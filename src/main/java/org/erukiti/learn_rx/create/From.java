package org.erukiti.learn_rx.create;

import rx.Observable;

import java.util.Arrays;
import java.util.List;

/*
 *   list: [1,2,3,4,5,6,7,8,9,10]
 *         v
 * stream: 1-2-3-4-5-6-7-8-9-10-|
 */

public class From {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        Observable.from(list)
                .subscribe(s -> System.out.println(s));
    }
}
