package org.erukiti.learn_rx;

import rx.Observable;

public class IgnoreElements {
    public static void main(String[] args) {
        /*
         * integer stream: 1-2-3-4-5-6-7-8-9-10-|
         *
         *   taken stream: ---------------------|
         */
        Observable.range(1, 10)
                .ignoreElements()
                .subscribe(s -> System.out.println(s));

        System.out.println("----");

        /*
         * integer stream: X-|
         *                 v
         *   taken stream: X-|
         */
        Observable.error(new Throwable("hoge"))
                .ignoreElements()
                .subscribe(
                        s -> System.out.println(s),
                        e -> System.out.println(e)
                );
    }
}
