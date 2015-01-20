package org.erukiti.learn_rx.create;

import rx.Observable;

/*
 *  empty: -X
 */

public class Error {
    public static void main(String[] args) {
        Observable.error(new Throwable("hoge"))
                .subscribe(
                        s -> System.out.println(s),
                        err -> System.out.println(err),
                        () -> System.out.println("onCompleted"));
    }
}
