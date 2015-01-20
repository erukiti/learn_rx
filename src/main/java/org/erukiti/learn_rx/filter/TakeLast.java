package org.erukiti.learn_rx.filter;

import rx.Observable;

/*
 * integer stream: 1-2-3-4-5-6-7-8-9-10-|
 *                               v v v
 *   taken stream: --------------8-9-10-|
 */

public class TakeLast {
    public static void main(String[] args) {
        Observable.range(1, 10)
                .takeLast(3)
                .subscribe(s -> System.out.println(s));
    }
}
