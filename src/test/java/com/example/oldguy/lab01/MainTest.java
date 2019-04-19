package com.example.oldguy.lab01;

import com.example.oldguy.lab01.impls.MyTest1;
import com.example.oldguy.lab01.impls.MyTest2;
import org.junit.Test;

/**
 * @ClassName: MainTest
 * @Author: ren
 * @DESCRIPTION: 2019/4/10 0010 上午 11:05
 **/
public class MainTest {

    @Test
    public void test(){
        ITest iTest = new MyTest1();

        iTest.say();
        System.out.println(iTest.eat());

        iTest = new MyTest2();

        iTest.say();
        System.out.println(iTest.eat());
    }

}
