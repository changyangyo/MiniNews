package com.pn.wechatmini.util;

/**
 * @program: wechatmini
 * @description: test
 * @author: peng.ning
 * @create: 2018-11-06 09:42
 **/
public class TestUtil {

    private static final int COUNT_BITS = Integer.SIZE - 3;
    private static final int RUNNING = -1 << COUNT_BITS;
    private static final int SHUTDOWN = 0 << COUNT_BITS;
    private static final int STOP = 1 << COUNT_BITS;
    private static final int TIDYING = 2 << COUNT_BITS;
    private static final int TERMINATED = 3 << COUNT_BITS;

    public static void main(String[] args) {
        System.out.println(COUNT_BITS);
        System.out.println(RUNNING);
        System.out.println(SHUTDOWN);
        System.out.println(STOP);
        System.out.println(TIDYING);
        System.out.println(TERMINATED);
        System.out.println(3 << 1);
        int start = Integer.MAX_VALUE;
        System.out.println(start);
        int begin = start - 2;
        for (int i = begin; i < start; i++) {
            System.out.println("a");
        }
        System.out.println(judgeError());
        System.out.println(findResult());
    }

    public static boolean judgeError() {
        try {
            int a = 1 / 0;
            return true;
        } catch (Exception e) {
            return true;
        } finally {
            return false;
        }
    }

    public static Integer findResult() {
        Integer a = 5;
        try {
            return a = 6;
        } catch (Exception e) {
            return a = 7;
        } finally {
            return a = 8;
        }
    }
}
