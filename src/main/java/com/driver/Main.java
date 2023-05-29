package com.driver;

public class Main {
    public static void main(String args[]) {
        B object = new B();
        object.meth();
    }

    static class A {
        public A() {
        }

        public static String meth() {
            return "Invoking method from class A";
        }
    }

    static class B extends A {
        public B() {
        }

        public static String meth() {
            return "Method is overridden in Extendend class B";
        }

    }
}