package stageOne;

import java.util.Stack;

public class InheritanceTest {


    public static void main(String[] args) {
        A aClass = new A();
        B bClass = new B();
        A aBClass = new B();
//        B bAClass = new A();
        System.out.println("aClass.m " + aClass.m);
        System.out.println("aClass.k " + aClass.k);
        aClass.method();
        System.out.println("aClass.c " + aClass.c);
        System.out.println("bClass.m " + bClass.m);
        System.out.println("bClass.k " + bClass.k);
        bClass.method();
        System.out.println("bClass.c " + bClass.c);
        System.out.println("aBClass.m " + aBClass.m);
        System.out.println("aBClass.k " + aBClass.k);
        aBClass.method();
        System.out.println("aBClass.c " + aBClass.c);
    }
}
