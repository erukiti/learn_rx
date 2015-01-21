package org.erukiti.learn_rx.Transform;

import rx.Observable;

import java.util.concurrent.TimeUnit;

public class ConcatMap {
    public static void main(String[] args) {
        /*
         * integer stream: -3-4-1-2-|
         *                     v    v v  v
         * integer stream: ----3----4-1--2-|
         */

        Observable.just(300, 400, 100, 200)
                .concatMap(ms -> Observable.just(ms).delay(ms, TimeUnit.MILLISECONDS))
                .toBlocking()
                .forEach(s -> System.out.println(s));

        System.out.println("****");
    }
}
