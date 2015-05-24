package com.oldratlee;

import java.util.Date;

/**
 * @author oldratlee
 */
public class Foo {

    static int method1(int i, int j) {
        return i + j;
    }

    static int method2(int i) {
        return method1(i, 3);
    }

    public static void main(String[] args) {
        Date date = new Date(System.currentTimeMillis() + method1(13 + 3, 1000));
        System.out.println(date);
        System.out.println(method2(37));

        if (date.compareTo(new Date()) < 0) {
            System.out.println("It's past!");
        }

        if (date.compareTo(new Date()) > 0) {
            System.out.println("It's future!");
        }
    }
}
