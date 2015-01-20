package org.erukiti.learn_rx.time;

import rx.Observable;
import java.util.concurrent.TimeUnit;

public class TakeLast {
    public static void main(String[] args) {
        /*
         * stream: -a--b-c---d-e-|
         *                  vvvvv
         * stream: ----------d-e-|
         */
        Observable
                .just(100, 200, 100, 300, 100)
                .concatMap(ms -> Observable.just(ms).delay(ms, TimeUnit.MILLISECONDS))
                .takeLast(350, TimeUnit.MILLISECONDS)
                .timeInterval()
                .toBlocking()
                .forEach(n -> System.out.println(n));

        System.out.println("----");

        /*
         * stream: -a--b-c---d-e-|
         *                  vvvvv
         * stream: ----------d---|
         */
        Observable
                .just(100, 200, 100, 300, 100)
                .concatMap(ms -> Observable.just(ms).delay(ms, TimeUnit.MILLISECONDS))
                .takeLast(1, 350, TimeUnit.MILLISECONDS)
                .timeInterval()
                .toBlocking()
                .forEach(n -> System.out.println(n));

        System.out.println("****");

    }

}
