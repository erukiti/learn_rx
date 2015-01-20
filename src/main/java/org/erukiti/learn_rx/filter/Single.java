package org.erukiti.learn_rx.filter;

import rx.Observable;


public class Single {
    public static void main(String[] args) {
        /*
         * integer stream: 1-|
         *                 vvv
         *   taken stream: --1-|
         */

        Observable.just(1)
                .single()
                .subscribe(n -> System.out.println(n));

        System.out.println("----");

        /*
         * integer stream: 1-2-3-4-5-6-7-8-9-10-|
         *                 vvvvvvvvvvvvvvvvvvvvv
         *   taken stream: --X-|
         */

        Observable.range(1, 10)
                .single()
                .subscribe(
                        n -> System.out.println(n),
                        e -> System.out.println(e));

        System.out.println("----");

        /*
         * integer stream: 1-2-3-4-5-6-7-8-9-10-|
         *                 vvvvvvvvvvvvvvvvvvvvv
         *   taken stream: ---------------------5-|
         */

        Observable.range(1, 10)
                .single(n -> n == 5)
                .subscribe(n -> System.out.println(n));



    }
}
