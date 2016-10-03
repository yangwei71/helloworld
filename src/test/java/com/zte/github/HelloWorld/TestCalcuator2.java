package com.zte.github.HelloWorld;

import junit.framework.TestCase;

/**
 * 测试用例
 * File: TestCalcuator2.java
 * User: leizhimin
 * Date: 2008-3-13 16:13:29
 */
public class TestCalcuator2 extends TestCase  {
    public void testAdd(){
        Calcuator calcuator=new Calcuator();
        double result=calcuator.add(1,2);
        assertEquals(3,result,0);
    }
}
