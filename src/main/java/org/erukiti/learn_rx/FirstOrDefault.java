package org.erukiti.learn_rx;

import rx.Observable;


public class FirstOrDefault {
    public static void main(String[] args) {
        /*
         *   empty stream: -|
         *                  v
         *   taken stream: -a-|
         */
        Observable.empty()
                .firstOrDefault(11)
                .subscribe(s -> System.out.println(s));

        System.out.println("----");

        /*
         *   empty stream: -|
         *                  v
         *   taken stream: -a-|
         */
        Observable.<Integer>empty()
                .firstOrDefault(11, n -> n % 2 == 0)
                .subscribe(s -> System.out.println(s));

        System.out.println("----");
        /*
         * integer stream: 1-2-3-4-5-6-7-8-9-10-|
         *                   v
         *   taken stream: --2-|
         */
        Observable.range(1, 10)
                .firstOrDefault(11, n -> n % 2 == 0)
                .subscribe(s -> System.out.println(s));
    }
}
