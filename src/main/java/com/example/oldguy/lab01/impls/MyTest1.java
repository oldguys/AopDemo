package com.example.oldguy.lab01.impls;

import com.example.oldguy.lab01.ITest;

/**
 * @ClassName: MyTest1
 * @Author: ren
 * @DESCRIPTION: 2019/4/10 0010 上午 11:03
 **/
public class MyTest1 implements ITest {
    @Override
    public void say() {
        System.out.println(getClass() + ": say.............");
    }

    @Override
    public int eat() {
        System.out.println(getClass() + ":eat.............");
        return 1;
    }
}
