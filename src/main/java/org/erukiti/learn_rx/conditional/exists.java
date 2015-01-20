package org.erukiti.learn_rx.conditional;

import rx.Observable;

/*
 *   stream: a-b-c-|
 *             v
 *  contain: --t-|
 */

public class Exists {
    public static void main(String[] args) {
        Observable.just("hoge", "fuga", "piyo")
                .exists(s -> s.startsWith("fu"))
                .subscribe(s -> System.out.println(s));
    }
}
