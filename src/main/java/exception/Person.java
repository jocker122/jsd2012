package exception;

/**
 * 使用当前类测试异常抛出
 */
public class Person {
   private int age;

    public int getAge() {
        return age;
    }

    /**
     * 当一个方法使用throws声明异常抛出时,调用该方法的代码就必须处理
     * 这个异常
     * @param age
     * @throws Exception
     */
    public void setAge(int age) throws IllegalAgeException {
        if(age<0 || age>100){
            //超过合理范围则对外抛出一个异常
        //    throw new RuntimeException("年龄不合法");
            /*
                当一个方法中使用throws抛出一个异常时,就要要求在
                当前方法上使用throws声明该异常的抛出,只有
                RuntimeException是个例外.
             */
            throw new IllegalAgeException("年龄不合法");
        }
        this.age = age;
    }
}
