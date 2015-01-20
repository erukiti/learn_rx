package org.erukiti.learn_rx;

import rx.Observable;


public class SingleOrDefault {
    public static void main(String[] args) {
        /*
         * integer stream: 1-|
         *                 vvv
         *   taken stream: --1-|
         */

        Observable.just(1)
                .singleOrDefault(11)
                .subscribe(n -> System.out.println(n));

        System.out.println("----");

        /*
         * integer stream: --|
         *                 vvv
         *   taken stream: --a-|
         */

        Observable.empty()
                .singleOrDefault(11)
                .subscribe(n -> System.out.println(n));

        System.out.println("----");

        /*
         * integer stream: 1-2-3-4-5-6-7-8-9-10-|
         *                 vvvvvvvvvvvvvvvvvvvvvv
         *   taken stream: ---------------------a-|
         */

        Observable.range(1, 10)
                .singleOrDefault(11, n -> n == 0)
                .subscribe(n -> System.out.println(n));



    }
}
