package org.erukiti.learn_rx.create;

import rx.Observable;

/*
 *  param: (1,2,3,4,5,6,7,8,9,10)
 *         v v v v v v v v v v
 * stream: 1-2-3-4-5-6-7-8-9-10-|
 */

public class Just {
    public static void main(String[] args) {
        Observable.just(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
                .subscribe(s -> System.out.println(s));
    }
}
