package org.erukiti.learn_rx.time;

import rx.Observable;
import java.util.concurrent.TimeUnit;

public class ThrottleLast {
    public static void main(String[] args) {
        /*
         * stream: -a--b-c---d-e-|
         *          v   |v    |v
         * stream: -a----c-----e-|
         */
        Observable
                .just(100, 200, 100, 300, 100)
                .concatMap(ms -> Observable.just(ms).delay(ms, TimeUnit.MILLISECONDS))
                .throttleLast(350, TimeUnit.MILLISECONDS)
                .timeInterval()
                .toBlocking()
                .forEach(n -> System.out.println(n));

        System.out.println("****");
        // FIXME: タイミング調整が不十分

        // FIXME: 複数 obs 使った sample
    }

}
