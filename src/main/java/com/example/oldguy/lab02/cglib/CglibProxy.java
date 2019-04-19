package com.example.oldguy.lab02.cglib;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @ClassName: CglibProxy
 * @Author: ren
 * @Description:
 * @CreateTIme: 2019/4/19 0019 上午 10:07
 **/
public class CglibProxy implements MethodInterceptor {

    private Enhancer enhancer = new Enhancer();

    /**
     *  创建代理对象
     * @param clazz
     * @return
     */
    public <T> T getProxy(Class<T> clazz){

        enhancer.setSuperclass(clazz);
        enhancer.setCallback(this);

        return clazz.cast(enhancer.create());
    }


    @Override
    public Object intercept(Object o, Method method, Object[] args, MethodProxy methodProxy) throws Throwable {

        System.out.println("调用前：使用cglib。。。。。");
        Object result = methodProxy.invokeSuper(o,args);
        System.out.println("调用后：使用cglib。。。。。");

        return result;
    }
}
