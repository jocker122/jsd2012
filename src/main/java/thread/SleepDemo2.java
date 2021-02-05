package thread;

/**
 * sleep方法要求必须处理中断异常.(Thread还提供了其他会导致线程阻塞的方法,很多都要求处理这个异常
 * ,情况时一样的)
 *
 * 当一个线程调用sleep方法处于睡眠阻塞的过程中,此时该线程的interrupt方法被调用时
 * ,会中断这个阻塞过程,此时该方法会抛出中断异常.
 *
 */
public class SleepDemo2 {
    public static void main(String[] args) {
        Thread t1 = new Thread(){
          public void run(){
              System.out.println("林:刚美完容,睡会吧");
              try {
                  Thread.sleep(100000);
              } catch (InterruptedException e) {
                  System.out.println("林:干嘛呢,破了相了");
              }
              System.out.println("林:醒了");
          }
        };
        Thread t2 = new Thread(){
          public void run(){
              System.out.println("黄:开始干活");
              for(int i=0;i<5;i++){
                  System.out.println("黄:80");
                  try {
                      Thread.sleep(1000);
                  } catch (InterruptedException e) {
                      e.printStackTrace();
                  }
              }
              t1.interrupt();
              System.out.println("咣当!");
              System.out.println("黄:完事");
          }
        };
        t1.start();
        t2.start();
    }
}
