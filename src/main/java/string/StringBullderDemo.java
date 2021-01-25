package string;
/**
 * String 的优化导致其为不变对象,这会存在利于重用但是不利于修改操作
 * 频繁修改string会降低性能并有较多的系统开销
 *
 * java.lang.StringBullder是专门设计用来修改String的API,其内部维护一个
 * 可变的char数组,并提供了多种修改字符串内存的方法,列如:增删改插,和
 * String原有的相关方法:indexOf.length等等.
 * StringBullder修改String内容速度快,开销小
*/
public class StringBullderDemo {
    public static void main(String[] args) {
        String str = "好好学习java";

        //内部表示空字符串
        //StringBullder builder = new StringBullder();

        //基于给定的字符串内容进行修改
        StringBuilder builder = new StringBuilder(str);
        /*
        * 好好学习java
        * 好好学习java,就是为了找个好工作*/
        builder.append(",就是为了找个好工作");
        str = builder.toString();
        System.out.println(str);
        /*
         *好好学习java,就是为了找个好工作
         * 好好学习java,就是为了改变世界
         *  */
        builder.replace(13,18,"改变世界");
        System.out.println(builder.toString());
//        直接输出builder也是输出toSring返回的字符串
        System.out.println(builder);
    }

}
