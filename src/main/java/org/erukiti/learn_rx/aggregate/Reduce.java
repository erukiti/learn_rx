package org.erukiti.learn_rx.aggregate;

import rx.Observable;

public class Reduce {
    public static void main(String[] args) {
        /*
         *   stream: a-b-c-|
         *                 v
         *  contain: ------d-|
         */

        Observable.just("hoge", "fuga", "piyo")
                .reduce((acc, x) -> acc + "**" + x)
                .subscribe(s -> System.out.println(s));

        System.out.println("----");

        /*
         *   stream: a-b-c-|
         *                 v
         *  contain: ------d-|
         */

        Observable.just("hoge", "fuga", "piyo")
                .reduce("###", (acc, x) -> acc + "**" + x)
                .subscribe(s -> System.out.println(s));



    }
}
