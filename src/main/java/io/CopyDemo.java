package io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * 使用文件流完成文件的复制操作
 */
public class CopyDemo {
    public static void main(String[] args) throws IOException {
        /*
            1:创建文件输入流读取原文件
            2:创建文件输出流写入复制文件
            3:循环块读写完成复制
            4:关闭两个流
         */
        FileInputStream se = new FileInputStream("asd.mp4");
        FileOutputStream fis = new FileOutputStream("asd__cp.mp4");


        int len;
        long a = System.currentTimeMillis();
        byte[] data = new byte[1024*10];
        while((len=se.read(data))!=-1){
            fis.write(data,0,len);
        }
        long b = System.currentTimeMillis();
        System.out.println("复制完毕,耗时"+(b-a)+"毫秒");
        fis.close();
        se.close();

    }
}
