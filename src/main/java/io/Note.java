package io;

import java.io.*;
import java.util.Scanner;

/**
 * 简易记事本功能
 * 程序启动后要求用户输入文件名,然后对文件进行操作
 * 之后用户输入的每一行字符串都要按行写入到文件中
 * 当用户单独输入exit时程序退出.
 *
 * 要求:创建PrintWriter并且自行创建流完成.
 */
public class Note {
    public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException {
        Scanner scan = new Scanner(System.in);
        System.out.println("请输入文件名");
        String name = scan.nextLine();
        FileOutputStream fos = new FileOutputStream(name);
        OutputStreamWriter osw = new OutputStreamWriter(fos,"utf-8");
        BufferedWriter bw = new BufferedWriter(osw);
        /*
           当创建PW时第一个参数为流,则可以再传入一个boolean型的参数
           如果这个值为true,则当前PW具有自动行刷新功能.即:
           每当我们调用println方法后会自动flash
         */
        PrintWriter pw = new PrintWriter(bw);
        System.out.println("输入内容,输入exit时退出");
        while(true){
            String line = scan.nextLine();
            if("exit".equals(line)){
                break;
            }
            pw.println(line);
            pw.flush();
        }
        System.out.println("写入完毕");
        pw.close();
    }
}
