package org.erukiti.learn_rx.time;

import rx.Observable;
import java.util.concurrent.TimeUnit;

public class Sample {
    public static void main(String[] args) {
        /*
         * stream: -a--b-c--d--e-|
         *          v   |v   |
         * stream: -a----c---|
         */
        Observable
                .just(100, 200, 100, 200, 200)
                .concatMap(ms -> Observable.just(ms).delay(ms, TimeUnit.MILLISECONDS))
                .sample(Observable.interval(350, TimeUnit.MILLISECONDS))
                .timeInterval()
                .toBlocking()
                .forEach(n -> System.out.println(n));

        System.out.println("****");
    }

}
