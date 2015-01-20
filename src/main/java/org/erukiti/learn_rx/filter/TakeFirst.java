package org.erukiti.learn_rx.filter;

import rx.Observable;

/*
 * integer stream: 1-2-3-4-5-6-7-8-9-10-|
 *                   v
 *   taken stream: --2-|
 */

public class TakeFirst {
    public static void main(String[] args) {
        Observable.range(1, 10)
                .takeFirst(n -> n % 2 == 0)
                .subscribe(s -> System.out.println(s));
    }
}
