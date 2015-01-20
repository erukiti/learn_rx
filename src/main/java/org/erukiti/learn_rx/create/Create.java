package org.erukiti.learn_rx.create;

import rx.Observable;
import rx.Observable.OnSubscribe;

public class Create {
    public static void main(String[] args) {
        /*
         * stream: a-b-|
         */
        Observable.create((OnSubscribe<String>) subscriber -> {
            subscriber.onNext("a");
            subscriber.onNext("b");
            subscriber.onCompleted();

            // subscriber.onError(new Throwable("error"));
        }).subscribe(s -> System.out.println(s));
    }
}
