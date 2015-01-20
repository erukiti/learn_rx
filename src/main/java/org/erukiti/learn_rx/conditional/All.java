package org.erukiti.learn_rx.conditional;

import rx.Observable;

/*
 *  stream: -2-4-6-8-10-|
 *                      v
 *     all: ------------t-|
 */

public class All {
    public static void main(String[] args) {
        Observable.just(2, 4, 6, 8, 10)
                .all(n -> n % 2 == 0)
                .subscribe(n -> System.out.println(n));
    }
}
