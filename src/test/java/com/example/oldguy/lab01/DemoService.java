package com.example.oldguy.lab01;

import com.example.oldguy.lab01.impls.MyTest1;
import com.example.oldguy.lab01.impls.MyTest2;
import org.junit.Test;

import java.lang.reflect.Proxy;

/**
 * @ClassName: DemoService
 * @Author: ren
 * @DESCRIPTION: 2019/4/10 0010 上午 11:11
 **/
public class DemoService {

    @Test
    public void test() {

        ITest obj = new MyTest2();

        Class<?>[] clazzs = {ITest.class};
        ITest iTest = (ITest) Proxy.newProxyInstance(getClass().getClassLoader(), clazzs, new MyInvocationHandler(obj));
//        iTest.say();
        System.out.println("----------------------------");
        iTest.eat();
    }

}
