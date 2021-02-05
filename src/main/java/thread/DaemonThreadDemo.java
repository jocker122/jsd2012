package thread;

/**
 * 守护线程
 * 守护线程是通过普通线程调用setDaemo(boolean on)设置而转变来的.
 * 因此创建上与普通方法没有区别.主要区别在于结束时机上有一点不同:进程的结束.
 * 当java进程中没有任何普通线程运行时,该进程就会结束,此时会杀死所有正在运行的所有线程.
 *
 * 守护线程一般也称为后台线程
 */
public class DaemonThreadDemo {
    public static void main(String[] args) {
        Thread rose = new Thread(){
          public void run(){
              for(int i=0;i<4;i++){
                  System.out.println("lit go");
                  try {
                      Thread.sleep(1000);
                  } catch (InterruptedException e) {
                      e.printStackTrace();
                  }
              }
              System.out.println("啊啊啊啊啊啊.....");
          }
        };
        Thread jack = new Thread(){
            public void run(){
                while(true){
                    System.out.println("you jump i jump");
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        };
        rose.start();
        //必须在线程启动之前
        jack.setDaemon(true);
        jack.start();
    }
}
