package cn.wuchen.java8.lambda;

/**
 * Created by wuchen on 2017/9/19.
 */
public class LambdaTest {

    public static void main(String[] args){
        Runnable r1 = () -> System.out.println("hello lambda");
        r1.run();
    }
}
