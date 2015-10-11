package junit.test;


import org.junit.Test;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by zhuzw_000 on 2015/8/20.
 */
public class testOther {

    @Test
    public void testLongDate(){

        long time = Long.valueOf(new SimpleDateFormat("yyyyMMddHHmmss").format(new Date()));

      System.out.println(time);

    }

    @Test
    public void t1(){
        int a = 2;
        long sum = 1;
        for(int i=0;i<46;i++){
            sum = sum*2;
        }

        System.out.print(sum/1000000);
    }

}
