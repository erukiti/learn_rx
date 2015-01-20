package org.erukiti.learn_rx.time;

import rx.Observable;
import java.util.concurrent.TimeUnit;

public class TimeOut {
    public static void main(String[] args) {
        /*
         * stream: -a--b-c---d-e-|
         *          vvvvvvvv
         * stream: -a--b-c--X
         *                  v
         * stream: -a--b-c--f-|
         */
        Observable
                .just(100, 200, 100, 300, 100)
                .concatMap(ms -> Observable.just(ms).delay(ms, TimeUnit.MILLISECONDS))
                .timeout(250, TimeUnit.MILLISECONDS)
                .onErrorReturn(err -> 1000)
                .timeInterval()
                .toBlocking()
                .forEach(n -> System.out.println(n));

        System.out.println("****");
    }

}
