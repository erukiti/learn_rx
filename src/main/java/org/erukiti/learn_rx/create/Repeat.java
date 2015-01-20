package org.erukiti.learn_rx.create;

import rx.Observable;

public class Repeat {
    public static void main(String[] args) {
        /*
         *   just: 1-2-3-|
         *         v
         * repeat: 1-2-3-1-2-3-1-2-3-1-2-3......
         *         v v v v v v v
         *   take: 1-2-3-1-2-3-1-|
         */
        Observable.just(1, 2, 3)
                .repeat()
                .take(10)
                .subscribe(s -> System.out.println(s));

        System.out.println("----");

        /*
         *   just: 1-2-3-|
         *         v
         * repeat: 1-2-3-1-2-3-1-2-3
         */
        Observable.just(1, 2, 3)
                .repeat(3)
                .subscribe(s -> System.out.println(s));


    }
}
