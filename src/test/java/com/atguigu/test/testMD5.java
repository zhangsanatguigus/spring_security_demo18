package com.atguigu.test;

import com.atguigu.util.MD5Utils;
import org.junit.Test;

public class testMD5 {

    @Test
    public void testmd55(){
        System.out.println(MD5Utils.md5("123xiao"));
        System.out.println(MD5Utils.md5("123xiaowang"));
        System.out.println("master 66666");
        System.out.println("hotfix 8888");
        System.out.println("master 188");
        System.out.println("master 208");
        System.out.println(MD5Utils.md5("f439778d1a302657229cda5e3f286bc6"));
    }
}
