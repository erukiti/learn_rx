package org.erukiti.learn_rx;

import rx.Observable;

/*
 * integer stream: 1-2-3-4-5-6-7-8-9-10-|
 *           skip:       v v v v v v v
 *    even stream: ------4-5-6-7-8-9-10-|
 */

public class Skip {
    public static void main(String[] args) {
        Observable.range(1, 10)
                .skip(3)
                .subscribe(s -> System.out.println(s));
    }
}
