package org.erukiti.learn_rx.conditional;

import rx.Observable;

/*
 *   empty: -|
 *           v
 *  stream: -a-|
 */

public class DefaultIfEmpty {
    public static void main(String[] args) {
        Observable.empty()
                .defaultIfEmpty("hoge")
                .subscribe(s -> System.out.println(s));
    }
}
