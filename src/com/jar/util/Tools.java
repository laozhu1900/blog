package com.jar.util;

import java.net.InetAddress;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by zhuzw_000 on 2015/8/23.
 */
public class Tools {

    public int makeEmailVerifyode(){
        int a = (int) (Math.random()*9000+1000);
        return  a;
    }

    public long getCurrentTime(){
        return Long.valueOf(new SimpleDateFormat("yyyyMMddHHmmss").format(new Date()));
    }

    public String getLocalIp() {

        String Ip = "";

        try {
            Ip = InetAddress.getLocalHost().getHostAddress();

        } catch (Exception e) {
            e.printStackTrace();
        }

        return Ip;
    }

    public static void main(String[] args) {
        System.out.println(new Tools().makeEmailVerifyode());
    }
}
