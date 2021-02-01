package raf;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;
import jdk.internal.org.objectweb.asm.commons.RemappingAnnotationAdapter;
import org.w3c.dom.ls.LSOutput;

import java.io.*;
import java.util.Scanner;

/**
 * 简易记事本工具
 * 程序启动后要求用户输入一个文件名,然后对该文件进行操作
 * 之后用户在控制台输入的每一行字符串都写入到该文件中.(不用考虑换行问题)
 * 当用户单独输入"exit"时程序退出
 */
public class Note {
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        String filename = scan.nextLine();
        RandomAccessFile raf = new RandomAccessFile(filename+".txt","rw");
        while(true){
            String line = scan.nextLine();
            if("exit".equals(line)){
                break;
            }
            byte[] data= line.getBytes("utf-8");
            raf.write(data);
        }
        System.out.println("完成");
        raf.close();



    }
}
