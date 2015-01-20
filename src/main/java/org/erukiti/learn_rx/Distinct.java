package org.erukiti.learn_rx;

import rx.Observable;

public class Distinct {
    public static void main(String[] args) {
        /*
         * integer stream: a-b-c-a-b-c-d-|
         *                 v v v       v
         *   taken stream: a-b-c-------d-|
         */
        Observable.just("a", "b", "c", "a", "b", "c", "d")
                .distinct()
                .subscribe(s -> System.out.println(s));

        System.out.println("----");

        /*
         * integer stream: 1-2-3-4-|
         *                 v v
         *   taken stream: 1-2-----|
         */
        Observable.range(1,4)
                .distinct(n -> n % 2 == 0)
                .subscribe(s -> System.out.println(s));
    }
}
