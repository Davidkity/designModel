package cn.lzm.designModel.singletonModel;

public class LazySingleton {
    private static LazySingleton instance;
    private LazySingleton(){}
    /* 在多线程中会出现问题，两个线程同时执行getInstance方法中的判断时，
    第二个线程在第一个线程实例化之前进入判断内，也会创建一个对象，这就创建了两个对象，违背了单例模式的初衷*/

    /* 解决方案：
       1. 在方法体上加 synchronized 关键值  效率比较低
       2. 给变量加锁，通过二次判断
       3. 使用内部类方法解决,效果比上面两种都好(也叫登记式模式)
    * */
    public static LazySingleton getInstance(){
        if(instance == null){
            instance = new LazySingleton();
        }
        return instance;
    }

    //方案一
    public static synchronized LazySingleton getInstance1(){
        if (instance == null) {
            instance = new LazySingleton();
        }
        return instance;
    }

    //方案二
    public static LazySingleton getInstance2(){
        if (instance == null) {
            synchronized (LazySingleton.class) {
                if (instance == null) {
                    instance = new LazySingleton();
                }
            }
        }
        return instance;
    }

    //方案三
    /*特点：在外部类被调用的时候内部类才会被加载
    内部类一定要在方法调用之前初始化
    巧妙地避免了线程安全问题
    * */
    public static final LazySingleton getInstance3(){   //final保证该方法不被覆写
        return LazyHolder.lazyHolder;
    }

    private static class LazyHolder{
        private static final LazySingleton lazyHolder = new LazySingleton();
    }
}
