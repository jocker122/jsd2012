package socket;

import java.util.Arrays;

/**
 * 测试从数组中删除指定元素
 */
public class Test {
    public static void main(String[] args) {
        int [] allout = {23,34,54,65,968,345,78,43};
        int pw = 968;
        System.out.println(Arrays.toString(allout));
        //将pw从数组allout中删除
        for(int i=0;i<allout.length;i++){
           if(allout[i]==pw){
              allout[i] = allout[allout.length-1];
               allout = Arrays.copyOf(allout,allout.length-1);
               break;
           }
        }
        System.out.println(Arrays.toString(allout));
    }
}
