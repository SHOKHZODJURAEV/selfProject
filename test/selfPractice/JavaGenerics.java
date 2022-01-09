package test.selfPractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class JavaGenerics {

    public static void main(String[] args) {


        List list = new ArrayList();
        list.addAll(Arrays.asList(1));


        int num = Integer.valueOf(list.get(0).toString());


        System.out.println(list);


        String s1 = new String("ABC"); //unmodifiable

        // mutable
        StringBuilder s2 = new StringBuilder("DEF");
        StringBuffer s3 = new StringBuffer("GHI"); // synchronized
        String Abbos = new String("Shirinboev");


    }


    public synchronized void method1() {

    }

    public void method2() {


        synchronized (this) {  // no static

        }

    }

    public static void method3() {
        synchronized (JavaGenerics.class) {  // static
        }

    }
}