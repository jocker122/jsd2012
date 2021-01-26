package string;
/**
 * String支持正则表达式方法二:
 * String[] split(String regex)
 * 将当前字符串按照满足正则表达式的部分进行拆分,将拆分后的所有部分以
 * 一个String数组形式返回.*/
public class SplitDemo {
    public static void main(String[] args) {
        //按照数字部分拆分
        /*
        String str = "asd2323rtry453sadarfsf676";
        String[] arr = str.split("[0-9]+");
         String[] arr = str.split("[a-z]+");
        System.out.println(arr.length);
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
        */

        //按照"."拆分
        //String str = "123,32,43";
        String str = ",123,,,345,567";
        String [] arr = str.split(",");
        System.out.println(arr.length);
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }


    }
}
