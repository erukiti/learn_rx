package org.erukiti.learn_rx.create;

import rx.Observable;

import java.util.concurrent.TimeUnit;

/*
 * interval: 0-1-2-3-4-5-6.......
 *           v v v v v
 *    taken: 0-1-2-3-4-|
 */

public class Interval {
    public static void main(String[] args) {
        Observable.interval(100, TimeUnit.MILLISECONDS)
                .take(5)
                .timeInterval()
                .toBlocking()
                .forEach(n -> System.out.println(n));
    }
}
