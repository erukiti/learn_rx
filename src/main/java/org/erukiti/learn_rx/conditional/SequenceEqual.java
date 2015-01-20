package org.erukiti.learn_rx.conditional;

import rx.Observable;

public class SequenceEqual {
    public static void main(String[] args) {
        /*
         *        stream1: -a-b-c-|
         *        stream2: --a-b-c-|
         *                         v
         *  sequenceEqual: --------t-|
         */

        Observable<String> obs1 = Observable.just("hoge", "fuga", "piyo");
        Observable<String> obs2 = Observable.just("hoge", "fuga", "piyo");

        Observable.sequenceEqual(obs1, obs2)
                .subscribe(b -> System.out.println(b));

        System.out.println("----");

        /*
         *        stream1: -2-4-6-|
         *        stream2: --1-2-3-|
         *                         v
         *  sequenceEqual: --------t-|
         */

        Observable<Integer> obs3 = Observable.just(2, 4, 6);
        Observable<Integer> obs4 = Observable.just(1, 2, 3);

        Observable.sequenceEqual(obs3, obs4, (n1, n2) -> n1 / 2 == n2)
                .subscribe(b -> System.out.println(b));


    }
}
