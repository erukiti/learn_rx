package org.erukiti.learn_rx;

import rx.Observable;


public class First {
    public static void main(String[] args) {
        /*
         * integer stream: 1-2-3-4-5-6-7-8-9-10-|
         *                 v
         *   taken stream: 1-|
         */
        Observable.range(1, 10)
                .first()
                .subscribe(s -> System.out.println(s));

        System.out.println("----");

        /*
         * integer stream: 1-2-3-4-5-6-7-8-9-10-|
         *                   v
         *   taken stream: --2-|
         */
        Observable.range(1, 10)
                .first(n -> n % 2 == 0)
                .subscribe(s -> System.out.println(s));
    }
}
