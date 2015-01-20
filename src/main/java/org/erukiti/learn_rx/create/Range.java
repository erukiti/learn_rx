package org.erukiti.learn_rx.create;

import rx.Observable;

public class Range {
    public static void main(String[] args) {
        /*
         * stream: 1-2-3-4-5-|
         */
        Observable.range(1, 5)
                .subscribe(s -> System.out.println(s));
    }
}
