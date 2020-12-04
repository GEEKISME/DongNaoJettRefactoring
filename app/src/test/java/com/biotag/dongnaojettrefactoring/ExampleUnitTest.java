package com.biotag.dongnaojettrefactoring;

import org.junit.Test;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

import static org.junit.Assert.assertEquals;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
    @Test
    public void addition_isCorrect() {
        assertEquals(4, 2 + 2);
    }

    @Test
    public void test1(){
        Student student = new Student();
        //getSuperclass()获得该类的父类
        Class<? extends Student> clazz = student.getClass();
        System.out.println(clazz.getSuperclass());

        /**
         * getGenericSuperclass()获得该类2带有泛型的父类
         * Type是java编程语言中所有类型的公共高级接口，他们包括原始类型、参数化类型
         * 数组类型、类型变量和基本类型
         */
        Type type = clazz.getGenericSuperclass();
        System.out.println(type);
        //ParameterizedType 参数化类型，即泛型
        ParameterizedType pt = (ParameterizedType)type;
        //getActualTypeArguments()获取参数化类型的数组，泛型可能有多个
        Type[] typeArguments = pt.getActualTypeArguments();
        Class c1 = (Class)typeArguments[0];
        System.out.println(c1);
        Class c2 = (Class)typeArguments[1];
        System.out.println(c2);
    }
}