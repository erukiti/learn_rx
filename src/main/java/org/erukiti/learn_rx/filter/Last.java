package org.erukiti.learn_rx.filter;

import rx.Observable;

public class Last {
    public static void main(String[] args) {
        /*
         * integer stream: 1-2-3-4-5-6-7-8-9-10-|
         *                                   v
         *   taken stream: --------------8-9-10-|
         */
        Observable.range(1, 10)
                .last()
                .subscribe(s -> System.out.println(s));

        System.out.println("----");

        /*
         *  integer stream: 1-2-3-4-5-6-7-8-9-10-|
         *                                  v
         * last odd stream: ----------------9----|
         */
        Observable.range(1, 10)
                .last(n -> n % 2 == 1)
                .subscribe(s -> System.out.println(s));
    }
}
