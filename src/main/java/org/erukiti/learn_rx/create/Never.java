package org.erukiti.learn_rx.create;

import rx.Observable;

/*
 *  never: -......
 */

public class Never {
    public static void main(String[] args) {
        Observable.never()
                .subscribe(
                        s -> System.out.println(s),
                        err -> System.out.println(err),
                        () -> System.out.println("onCompleted"));
    }
}
