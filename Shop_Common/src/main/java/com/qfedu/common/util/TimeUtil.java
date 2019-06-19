package com.qfedu.common.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class TimeUtil {
    public static String getTime(){
        return new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date());
    }
    public static String getDate(){
        return new SimpleDateFormat("yyyy-MM-dd " ).format(new Date());
    }

    /**
     * 计算时间  获取多少年之后
     * @param year
     * @return
     */
    public static Date getYear(int year){
        //日历类
        Calendar calendar = Calendar.getInstance();
        calendar.add(Calendar.YEAR, year);
        return calendar.getTime();
    }

    /**
     * 计算时间  获取多少月之后
     * @param months
     * @return
     */
    public static Date getMonths(int months){
        //日历类
        Calendar calendar = Calendar.getInstance();
        calendar.add(Calendar.MONTH, months);;
        return calendar.getTime();
    }

    /**
     * 计算时间  获取多少天之后
     * @param days
     * @return
     */
    public static Date getDays(int days){
        //日历类
        Calendar calendar = Calendar.getInstance();
        calendar.add(Calendar.DAY_OF_MONTH, days);;
        return calendar.getTime();

    }

    /**
     * 计算时间  获取多少分钟之后
     * @param minutes
     * @return
     */
    public static Date getMiutes(int minutes){
        //日历类
        Calendar calendar = Calendar.getInstance();
        calendar.add(Calendar.MINUTE, minutes);
        return calendar.getTime();
    }

    /**
     * 计算时间  今天剩余秒
     * @return
     */
    public static int getLastSeconds(){
        Date currdate = new Date();
        //获取今天的最后一秒
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

        try {
            Date lastdate = sdf.parse(getDate()+"23:59:59");
            return (int) ((lastdate.getTime()-currdate.getTime())/1000);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return 0;
    }

    /**
     * 获取当前距离指定日期的天数
     * @param date
     * @return
     */
    public static int getDistanceDays(Date date){
        Calendar calendar = Calendar.getInstance();
        Calendar calendarOld = Calendar.getInstance();
        calendarOld.setTime(date);

        return (int) (calendar.getTime().getTime()/1000/24/3600-date.getTime()/1000/24/3600);
    }

    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        calendar.add(Calendar.DAY_OF_MONTH,-5);
        System.out.println(getDistanceDays(calendar.getTime()));
    }

    public static String getFormat(Date date){
        return new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(date);

    }




}
