package org.erukiti.learn_rx.time;

import rx.Observable;
import java.util.concurrent.TimeUnit;

public class SkipLast {
    public static void main(String[] args) {
        /*
         * stream: -a--b-c---d-e-|
         *         vvvvvvvv*******
         * stream: --------------a---b-c-|
         */
        Observable
                .just(100, 200, 100, 300, 100)
                .concatMap(ms -> Observable.just(ms).delay(ms, TimeUnit.MILLISECONDS))
                .skipLast(350, TimeUnit.MILLISECONDS)
                .timeInterval()
                .toBlocking()
                .forEach(n -> System.out.println(n));

        System.out.println("****");
    }

}
