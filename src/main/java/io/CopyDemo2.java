package io;

import java.io.*;

/**
 * 使用缓冲流完成文件复制
 *
 * 缓冲流:java.io.BufferedInputStream和BufferedOutputStream
 * 它是一对高级流,在流连接中的作用是提高读写效率
 */
public class CopyDemo2 {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("asd.mp4");
        BufferedInputStream dis = new BufferedInputStream(fis);
        FileOutputStream fos = new FileOutputStream("asd__cp.mp4");
        BufferedOutputStream dos = new BufferedOutputStream(fos);
        int b;
        long a = System.currentTimeMillis();
        /*
            缓冲流内部维护着一个字节数组,默认为8k,无论我们读写时用哪种方式,
            最终都会被缓冲流转化为块读写8k8k的进行来保证读写效率
         */
        while((b=dis.read())!=-1){
            dos.write(b);
        }
        long c = System.currentTimeMillis();
        System.out.println("复制完毕,耗时"+(c-a)+"毫秒");
         dis.close();
         dos.close();
    }
}
