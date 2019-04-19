package com.example.oldguy.lab01;

import com.example.oldguy.lab02.cglib.CglibProxy;
import com.example.oldguy.lab02.cglib.Train;
import org.junit.Test;

/**
 * @ClassName: CglibTest
 * @Author: ren
 * @Description:
 * @CreateTIme: 2019/4/19 0019 上午 10:14
 **/
public class CglibTest {

    @Test
    public void test(){

        CglibProxy proxy = new CglibProxy();

        Train train = proxy.getProxy(Train.class);
        train.move();
    }

}
