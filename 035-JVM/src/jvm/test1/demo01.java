package jvm.test1;

/**
 * ClassName:jvm.test1.demo01
 * Package:java.test01
 * Description: 演示堆内存
 *
 * @date:2022/3/23 11:29
 * @author:白白白
 */
public class demo01 {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("1.........");
        Thread.sleep(30000);
        byte[] bytes = new byte[1024 * 1024 * 10];//10mb
        System.out.println("2..........");
        Thread.sleep(20000);
        bytes = null;
        System.gc();
        System.out.println("3.........");
        Thread.sleep(1000000l);


    }

}
