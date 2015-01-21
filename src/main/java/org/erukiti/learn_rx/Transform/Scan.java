package org.erukiti.learn_rx.Transform;

import rx.Observable;

public class Scan {
    public static void main(String[] args) {
        /*
         * stream: -1-2-3-4-|
         *          v v v v
         * stream: -1-3-6-10-|
         */

        Observable.range(1, 4)
                .scan((acc, x) -> acc + x)
                .subscribe(s -> System.out.println(s));

        System.out.println("----");

        /*
         * stream: ---1-2-3-4-|
         *          v v v v v
         * stream: -1-2-4-7-11-|
         */

        Observable.range(1, 4)
                .scan(1, (acc, x) -> acc + x)
                .subscribe(s -> System.out.println(s));


    }
}
