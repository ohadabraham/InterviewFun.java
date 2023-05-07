import companyX.FileSinkImpl;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

import static org.junit.Assert.assertEquals;

public class FileSinkImplTest {
    private static final String LOG_DIRECTORY = "C:\\temp\\logz.io";
    private FileSinkImpl fileSink;

    @Before
    public void initialize() {
        fileSink = new FileSinkImpl(LOG_DIRECTORY);
    }

    @After
    public void close() {
        fileSink.close();
        File logDirectory = new File(LOG_DIRECTORY);
        for (File file : logDirectory.listFiles()) {
            file.delete();
        }
        logDirectory.delete();
    }



    @Test
    public void whenTryToWrite1Line_WillReturn1LinesAndSuccess() throws IOException {
        String logMessage = "Test message";
        fileSink.write(logMessage);
        String actualMessage = readLogFile();
        assertEquals(logMessage + "\n", actualMessage);
    }

    @Test
    public void whenTryToWriteMultipleLine_WillReturnMultipleLinesAndSuccess() throws IOException {
        String logMessage1 = "Test message 1";
        String logMessage2 = "Test message 2";
        fileSink.write(logMessage1);
        fileSink.write(logMessage2);
        String actualMessage = readLogFile();
        assertEquals(logMessage1 + "\n" + logMessage2 + "\n", actualMessage);
    }


    @Test
    public void whenTryToWriteMultipleLineFromMultipleThreads_WillReturnMultipleLinesFromMultipleThreadsAndSuccess() throws InterruptedException {
        final int threadCount = 10;
        final int linesPerThread = 10;

        ExecutorService executorService = Executors.newFixedThreadPool(threadCount);

        for (int i = 0; i < threadCount; i++) {
            executorService.execute(() -> {
                for (int j = 0; j < linesPerThread; j++) {
                    String message = "Thread " + Thread.currentThread().getId() + " wrote message #" + j;
                    fileSink.write(message);
                }
            });
        }

        executorService.shutdown();
        executorService.awaitTermination(1, TimeUnit.MINUTES);

        // number of lines in file
        long lineCount = countLines(LOG_DIRECTORY + "/" + fileSink.getFileName());

        // check number of lines is as should
        // can add here more spesific check
        assertEquals(threadCount * linesPerThread, lineCount);

        fileSink.close();
    }



    ///Read file and his data
    private String readLogFile() throws IOException {
        File directory = new File(LOG_DIRECTORY);
        File[] files = directory.listFiles();
        if (files != null && files.length > 0) {
            File logFile = files[0];
            BufferedReader reader = new BufferedReader(new FileReader(logFile));
            StringBuilder builder = new StringBuilder();
            String line;
            while ((line = reader.readLine()) != null) {
                builder.append(line).append("\n");
            }
            reader.close();
            return builder.toString();
        }
        return "";
    }
    ///Count rows in file
    private long countLines(String filePath) {
        try {
            return Files.lines(Paths.get(filePath)).count();
        } catch (IOException e) {
            e.printStackTrace();
            return 0;
        }
    }


}
