package file;

import java.io.File;
import java.io.FileFilter;

/**
 * 获取一个目录中满足指定条件的所有子项
 *
 * File[]listFilees(FileFilter filter)
 * 将当前File对象表示的目录中所有符合各定过滤器要求的子项返回.
 * 该方法会将该目录中所有子项都经过一次给定的过滤器,然后仅保留
 * 并返回符合要求的子项*/
public class ListFilesDemo2 {
    public static void main(String[] args) {
        /*
        * 获取当前目录中的所有名字中含有字母"e"的子项*/
        File dir = new File(".");
        if(dir.isDirectory()){
           FileFilter filter = new FileFilter(){
               public boolean accept(File file){
                   String name = file.getName();
                   return name.contains("e");
               }
           };
           /*
           * 重载的listfiles方法会将dir中每个子项都经过一次给定的
           * 过滤器的accept方法,并最终返回所有返回为true的子项*/
            File[] subs = dir.listFiles(filter);
            System.out.println("子项个数"+subs.length);
            for(int i=0;i<subs.length;i++){
                System.out.println(subs[i].getName());
            }
        }

    }
}
