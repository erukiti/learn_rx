package org.erukiti.learn_rx.time;

import rx.Observable;
import java.util.concurrent.TimeUnit;

public class ThrottleLast {
    public static void main(String[] args) {
        Observable
                .just(100, 200, 100, 200, 200)
                .concatMap(ms -> Observable.just(ms).delay(ms, TimeUnit.MILLISECONDS))
                .throttleFirst(350, TimeUnit.MILLISECONDS)
                .timeInterval()
                .toBlocking()
                .forEach(n -> System.out.println(n));

        System.out.println("****");
    }
    // FIXME: なんだかタイミング調整が難しい
}
