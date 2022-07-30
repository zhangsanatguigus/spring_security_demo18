package com.atguigu.test;

import com.atguigu.util.DateUtils;
import org.junit.Test;

import java.text.SimpleDateFormat;
import java.util.*;

public class test01 {
    @Test
    public void test001(){
        Calendar calendar = Calendar.getInstance();
        System.out.println("instance = " + calendar);
        System.out.println("instance.getTime() = " + calendar.getTime());
        calendar.add(Calendar.MONTH,-30);
        List<String> montylist = new ArrayList<>();
        for (int i = 0; i < 12; i++) {
            calendar.add(Calendar.MONTH,1);
            montylist.add(new SimpleDateFormat("yyyy-MM").format(calendar.getTime()));
        }
        System.out.println("montylist.toString() = " + montylist.toString());

    }

    @Test
    public void test002() throws Exception {
        Date date = new Date();

        Date thisWeekMonday = DateUtils.getThisWeekMonday(date);
        Date date1 = DateUtils.geLastWeekMonday(date);
        System.out.println("date1 = " +new  SimpleDateFormat("yyyy-MM-dd").format(date1));
        System.out.println("thisWeekMonday = " + thisWeekMonday);

        Date firstDay4ThisMonth = DateUtils.getFirstDay4ThisMonth();
        System.out.println("firstDay4ThisMonth = " +new SimpleDateFormat("yyyy-MM-dd").format(firstDay4ThisMonth));


        Date today = DateUtils.getToday();
        String s = DateUtils.parseDate2String(today, "yyyy-MM-dd");
        System.out.println("s = " + s);

        String thisWeekMondays = new SimpleDateFormat("yyyy-MM-dd").format(DateUtils.getThisWeekMonday());
        System.out.println("thisWeekMonday = " + thisWeekMondays);
    }
}
