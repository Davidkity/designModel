package cn.lzm.designModel.singletonModel;

public class Test {
    public static void main(String[] args) {
        HungrySingleton hungrySingleton = HungrySingleton.getIntstance();
        HungrySingleton intstance = HungrySingleton.getIntstance();
        System.out.println(hungrySingleton);
        System.out.println(intstance);

        LazySingleton instance = LazySingleton.getInstance();
        LazySingleton lazySingleton = LazySingleton.getInstance();
        System.out.println(instance);
        System.out.println(lazySingleton);
    }
}
