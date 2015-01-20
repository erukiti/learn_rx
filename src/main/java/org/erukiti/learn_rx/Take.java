package org.erukiti.learn_rx;

import rx.Observable;

/*
 * integer stream: 1-2-3-4-5-6-7-8-9-10-|
 *                 v v v
 *   taken stream: 1-2-3-|
 */

public class Take {
    public static void main(String[] args) {
        Observable.range(1, 10)
                .take(3)
                .subscribe(s -> System.out.println(s));
    }
}
