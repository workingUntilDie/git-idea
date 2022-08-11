package com;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * 常用的模板
 */
public class TemplatesTest {

    //模板一：psvm
    /*public static void main(String[] args) {

    }*/

    //模板六： prsf: 可生成 private static final
    private static final String NAME = "cc";

    public static void main(String[] args) {

        //模板二：sout
        System.out.println("hello");
        //变形： soutp /soutm /soutv / xxx.sout

        //模板三：fori
        String[] arr = new String[]{"cc", "lw"};
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        //变形: iter -增强for循环
        for (String s : arr) {
            System.out.println(s);
        }
        //变形： itar -提前赋值
        for (int i = 0; i < arr.length; i++) {
            String s = arr[i];
            System.out.println(s);
        }

        //模板四：list.for -遍历list
        ArrayList list = new ArrayList();
        list.add(1);
        list.add(2);

        for (Object o : list) {

        }
        //变形：list.forr -是逆序遍历
        for (int i = list.size() - 1; i >= 0; i--) {

        }

        //模板五：ifn: 可以生成 if(xxx = null)
        ArrayList list2 = new ArrayList();
        list2.add(1);
        list2.add(2);

        if (list2 == null) {

        }
        //变形：inn 可以生成 if(xxx != null)
        if (list2 != null) {

        }




    }

    public void method(int age){
        //模板二变形
        //soutp: 打印形参
        System.out.println("age = " + age);
        //soutm: 打印方法名
        System.out.println("TemplatesTest.method");
        //soutv: 打印变量值(就近选择变量)
        String name = "林伟";
        System.out.println("name = " + name);
    }
}
