package org.erukiti.learn_rx.Transform;

import rx.Observable;

/*
 * integer stream: 1-2-3-4-5-6-7-8-9-10-|
 *            map: v v v v v v v v v v
 *  string stream: a-b-c-d-e-f-g-h-i-j--|
 */

public class Map {
    public static void main(String[] args) {
        Observable.range(1, 10)
                .map(n -> String.format("hoge <%d>", n))
                .subscribe(s -> System.out.println(s));
    }
}
