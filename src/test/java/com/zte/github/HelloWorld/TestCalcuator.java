package com.zte.github.HelloWorld;

import junit.framework.TestCase;

/**
 * 测试用例
 * File: TestCalcuator.java
 * User: leizhimin
 * Date: 2008-3-13 15:00:17
 */
public class TestCalcuator extends TestCase {
    public void testAdd(){
        Calcuator calcuator=new Calcuator();
        double result=calcuator.add(1,2);
        assertEquals(3,result,0);
    }

}