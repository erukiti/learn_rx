package org.erukiti.learn_rx;

import rx.Observable;

public class DistinctUntilChanged {
    public static void main(String[] args) {
        /*
         * integer stream: a-a-b-b-b-c-c-|
         *                 v   v     v
         *   taken stream: a---b-----c---|
         */
        Observable.just("a", "a", "b", "b", "b", "c", "c")
                .distinctUntilChanged()
                .subscribe(s -> System.out.println(s));

        System.out.println("----");

        /*
         * integer stream: 1-2-3-5-|
         *                 v v v
         *   taken stream: 1-2-3---|
         */
        Observable.just(1, 2, 3, 5)
                .distinctUntilChanged(n -> n % 2 == 0)
                .subscribe(s -> System.out.println(s));
    }
}
