package org.erukiti.learn_rx;

import rx.Observable;

public class ElementAt {
    public static void main(String[] args) {
        /*
         * integer stream: 1-2-3-4-5-6-7-8-9-10-|
         *                     v
         *   taken stream: ----3-|
         */
        Observable.range(1, 10)
                .elementAt(2)
                .subscribe(s -> System.out.println(s));

        System.out.println("----");

        /*
         * integer stream: 1-2-3-4-5-6-7-8-9-10-|
         *                                      v
         *   taken stream: ---------------------X-|
         */
        Observable.range(1, 10)
                .elementAt(15)
                .subscribe(
                        s -> System.out.println(s),
                        e -> System.out.println(e));

    }
}
