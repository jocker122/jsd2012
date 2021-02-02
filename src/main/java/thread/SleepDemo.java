package thread;

import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;

/**
 * 线程提供的方法
 * static void sleep(long ms)
 * 该方法可以让运行这个方法的线程处于阻塞状态指定毫秒,超时后线程会自动回到RUNNABLE状态
 * 再次获取时间段并发运行
 */
public class SleepDemo {
    public static void main(String[] args){
        System.out.println("请输入数字");
        /*
            完成一个倒计时程序,程序启动后要求用户输入一个数字,然后从该数字开始
            每秒递减,到0时提示时间到.
         */
         Scanner scan = new Scanner(System.in);
             int time = scan.nextInt();
            for(int i=time;i>0;i--){
                System.out.println(i+"秒");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
             System.out.println("时间到");

    }
}
