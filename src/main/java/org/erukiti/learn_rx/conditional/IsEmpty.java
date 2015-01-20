package org.erukiti.learn_rx.conditional;

import rx.Observable;

/*
 *   stream: -|
 *            v
 *  contain: -t-|
 */

public class IsEmpty {
    public static void main(String[] args) {
        Observable.empty()
                .isEmpty()
                .subscribe(s -> System.out.println(s));
    }
}
