package org.example.aop.proxy;


public class CountLogImpl implements ICount {

    @Override
    public int add(int a, int b) {
        System.out.println("日志追踪：the method add begin with ["+a+" , "+ b +"]");
        int result = a+b;
        System.out.println("日志追踪：the method add end with "+result);
        return result;
    }

    @Override
    public int sub(int a, int b) {
        System.out.println("日志追踪：the method sub begin with ["+a+" , "+ b +"]");
        int result = a-b;
        System.out.println("日志追踪：the method sub end with "+result);
        return result;
    }

    @Override
    public int mul(int a, int b) {
        System.out.println("日志追踪：the method mul begin with ["+a+" , "+ b +"]");
        int result = a*b;
        System.out.println("日志追踪：the method mul end with "+result);
        return result;
    }

    @Override
    public int div(int a, int b) {
        System.out.println("日志追踪：the method div begin with ["+a+" , "+ b +"]");
        int result = a/b;
        System.out.println("日志追踪：the method div end with "+result);
        return result;
    }
}
