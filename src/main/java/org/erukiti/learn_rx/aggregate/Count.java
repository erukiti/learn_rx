package org.erukiti.learn_rx.aggregate;

import rx.Observable;

/*
 *   stream: a-b-c-|
 *                 v
 *  contain: ------3-|
 */

public class Count {
    public static void main(String[] args) {
        Observable.just("hoge", "fuga", "piyo")
                .count()
                .subscribe(s -> System.out.println(s));
    }
}
