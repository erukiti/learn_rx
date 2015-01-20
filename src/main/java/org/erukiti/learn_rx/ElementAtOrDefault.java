package org.erukiti.learn_rx;

import rx.Observable;

public class ElementAtOrDefault {
    public static void main(String[] args) {
        /*
         * integer stream: 1-2-3-4-5-6-7-8-9-10-|
         *                                      v
         *   taken stream: ---------------------a-|
         */
        Observable.range(1, 10)
                .elementAtOrDefault(15, 11)
                .subscribe(
                        s -> System.out.println(s),
                        e -> System.out.println(e));

    }
}
