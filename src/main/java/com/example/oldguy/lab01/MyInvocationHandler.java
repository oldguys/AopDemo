package com.example.oldguy.lab01;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @ClassName: MyInvocationHandler
 * @Author: ren
 * @DESCRIPTION: 2019/4/10 0010 上午 11:09
 **/
public class MyInvocationHandler implements InvocationHandler {

    private Object target;

    public MyInvocationHandler(Object target) {
        this.target = target;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        System.out.println("代理前.....");
        Object result = method.invoke(target, args);
        if (method.getName().equals("eat")) {
            System.out.println("正在执行eat。。。。。。");
            System.out.println();
        }

        return result;
    }
}
