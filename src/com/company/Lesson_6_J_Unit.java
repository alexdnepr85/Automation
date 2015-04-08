package com.company;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;


/**
 * Created by Никита on 08/04/15.
 *
 */

@RunWith(JUnit4.class)

public class Lesson_6_J_Unit {
    @Test

    public void  Test1( ){
        Assert.fail();
    }

    @Test                       // необходимо всегда писать @Test  чтобы запустить функции по одиночке и выполнить
                                //   действия по отдельности друг от друга
    public  void Test2() {
        int a =10 ;
        int b = 6;
        int expectedResult =15;
        Assert.assertEquals(expectedResult, a + b);  // класс Assert , в котором есть функции .
    }

}
