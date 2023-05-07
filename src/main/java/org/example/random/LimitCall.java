package org.example.random;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.HashMap;

public class LimitCall {


    private static HashMap <String , TimeAndCount> map = new HashMap<>();

        public void test1(String[] args) throws InterruptedException {

            System.out.println(rateLimit("device_info", 1, 3)); // returns false

            System.out.println(rateLimit("device_info", 1, 3)); // returns false
            System.out.println(rateLimit("device_info", 1, 3)); // returns false

            System.out.println(rateLimit("device_info", 1, 3)); // returns true
            Thread.sleep(1000);
            System.out.println(rateLimit("device_info", 1, 3)); // returns true


        }

        // Return "true" if no more requests are allowed, and "false" otherwise
        public static boolean rateLimit(String key, int intervalInSecs, int maxLimit) {

            // key
            // interval - time period
            // max - how many in the interval

            if ( !map.containsKey(key) ) {
                // if does not exists add it with key and now
                TimeAndCount timeAndCount = new TimeAndCount( LocalDateTime.now(), 1);

                map.put(key, timeAndCount);
            }else{

                // if exists check if we reach limit
                TimeAndCount timeAndCount = map.get(key);

                if ( LocalDateTime.now().minusSeconds(intervalInSecs).isAfter(timeAndCount.time) )
                {
                    timeAndCount.time = LocalDateTime.now();
                    map.put(key,timeAndCount);
                }
                else if ( timeAndCount.counter >= maxLimit && LocalDateTime.now().minusSeconds(intervalInSecs).isBefore(timeAndCount.time) )
                {
                    return true;
                }else {
                    timeAndCount.counter ++;
                    map.put(key, timeAndCount);
                }
            }

            return false;
        }

    @Setter
    @Getter
    public  static class TimeAndCount {

        private LocalDateTime time;
        private int counter;

        public TimeAndCount ( LocalDateTime time , int counter ){
            this.time=time;
            this.counter=counter;
        }


    }

}

