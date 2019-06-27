package cn.lzm.designModel.singletonModel;

public class HungrySingleton {
    private static final HungrySingleton intstance = new HungrySingleton();
    private HungrySingleton(){}

    public static HungrySingleton getIntstance(){
        return intstance;
    }
}
