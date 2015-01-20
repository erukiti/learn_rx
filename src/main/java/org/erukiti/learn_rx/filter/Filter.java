package org.erukiti.learn_rx.filter;

import rx.Observable;

/*
 * integer stream: 1-2-3-4-5-6-7-8-9-10-|
 *         filter:   v   v   v   v   v
 *    even stream: --2---4---6---8---10-|
 */

public class Filter {
    public static void main(String[] args) {
        Observable.range(1, 10)
                .filter(n -> n % 2 == 0)
                .subscribe(s -> System.out.println(s));
    }
}
