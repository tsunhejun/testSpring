package org.example.aop.proxy;

public class MainTest {

    public static void main(String[] args) {

        ICount target = new CountImpl();
        //2.将目标对象传入，获得代理对象
        ICount proxy = new CountLogProxy(target).getProxy();
        //com.sun.proxy.$Proxy0
        System.out.println(proxy.getClass().getName());
        //3.执行计算器方法
        int result1 = proxy.add(5, 6);
        System.out.println("-->result1 = "+result1);

        int result2 = proxy.div(10, 0);
        System.out.println("-->result2 = "+result2);
    }

}
