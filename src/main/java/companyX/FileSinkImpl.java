package companyX;
import lombok.Getter;
import lombok.Setter;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;



public class FileSinkImpl implements FileSink {
    private final String directoryPath;
    private  final String fileName;
    private final Lock lock;
    private FileWriter fileWriter;



    public FileSinkImpl(String directoryPath) {
        this.directoryPath = directoryPath;
        this.fileName = generateFileName();
        this.lock = new ReentrantLock();
        this.fileWriter = null;
    }

    /// Generate file name - for now we have only 1
    private String generateFileName() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyyMMdd_HHmmss");
        LocalDateTime dateTime = LocalDateTime.now();
        return String.format("log_%s.txt", dateTime.format(formatter));

    }

    /// Open the file for read
    private void openFileWriter() throws IOException {
        File directory = new File(directoryPath);
        if (!directory.exists()) {
            directory.mkdirs();
        }
        File file = new File(directory, fileName);
        fileWriter = new FileWriter(file, true);
    }

    /// Close the file
    private void closeFileWriter() throws IOException {
        if (fileWriter != null) {
            fileWriter.close();
            fileWriter = null;
        }
    }
    /// Write to the file - THREAD SAFE
    @Override
    public void write(String logMessage) {
        lock.lock();
        try {
            if (fileWriter == null) {
                openFileWriter();
            }
            fileWriter.write(logMessage + "\n");
            fileWriter.flush();
        } catch (IOException e) {
            System.out.println(" could not write log with error message " + e.getMessage() +
                    " and stack trace " + e.getStackTrace().toString() );
        } finally {
            lock.unlock();
        }
    }

    /// Close to the file - THREAD SAFE

    public void close() {
        lock.lock();
        try {
            closeFileWriter();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }

    public String getFileName() {
        return fileName;
    }


}