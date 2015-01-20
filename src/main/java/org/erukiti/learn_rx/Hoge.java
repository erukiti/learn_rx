package org.erukiti.learn_rx;


import rx.Observable;

import java.util.concurrent.TimeUnit;

public class Hoge {
    public static void main(String[] args) {
        Observable
                .just(100, 200, 100, 300, 100)
                .concatMap(ms -> {
                    return Observable.just(ms).delay(ms, TimeUnit.MILLISECONDS);
                })
                .timeInterval()
                .toBlocking()
                .forEach(n -> System.out.println(n));
    }

}
