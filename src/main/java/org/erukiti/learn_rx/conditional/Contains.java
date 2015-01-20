package org.erukiti.learn_rx.conditional;

import rx.Observable;

/*
 *   stream: a-b-c-|
 *           v
 *  contain: t-|
 */

public class Contains {
    public static void main(String[] args) {
        Observable.just("hoge", "fuga", "piyo")
                .contains("hoge")
                .subscribe(s -> System.out.println(s));
    }
}
