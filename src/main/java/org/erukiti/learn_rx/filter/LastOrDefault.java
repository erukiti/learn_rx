package org.erukiti.learn_rx.filter;

import rx.Observable;

public class LastOrDefault {
    public static void main(String[] args) {
        /*
         *   empty stream: ---------------------|
         *                                      v
         *  string stream: ---------------------a-|
         */
        Observable.<String>empty()
                .lastOrDefault("hoge")
                .subscribe(s -> System.out.println(s));

        System.out.println("----");

        /*
         *   empty stream: ---------------------|
         *                                      v
         *  string stream: ---------------------a-|
         */
        Observable.<String>empty()
                .lastOrDefault("hoge", s -> s == "fuga")
                .subscribe(s -> System.out.println(s));

        System.out.println("----");

        /*
         *   empty stream: -------------------b-|
         *                                    v
         *  string stream: -------------------b-|
         */
        Observable.just("fuga")
                .lastOrDefault("hoge", s -> s == "fuga")
                .subscribe(s -> System.out.println(s));

    }
}
