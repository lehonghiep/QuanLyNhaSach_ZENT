/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.qlth.util;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author Hong Hiep
 */
public class Time {
    public static String time(){
        String s;
        Calendar cal=Calendar.getInstance();
        Date t=cal.getTime();
        SimpleDateFormat sdf=new SimpleDateFormat("dd/MM/yyyy  HH:mm:ss");
        s=sdf.format(t);
        return s;
    }
    public static void main(String[] args) {
        System.out.println(time());
    }
}
