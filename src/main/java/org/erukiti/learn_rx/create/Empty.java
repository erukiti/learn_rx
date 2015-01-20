package org.erukiti.learn_rx.create;

import rx.Observable;

/*
 *  empty: -|
 */

public class Empty {
    public static void main(String[] args) {
        Observable.empty()
                .subscribe(
                        s -> System.out.println(s),
                        err -> System.out.println(err),
                        () -> System.out.println("onCompleted"));
    }
}
