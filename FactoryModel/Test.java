package cn.lzm.designModel.FactoryModel;

import cn.lzm.designModel.FactoryModel.factory.AppleFactory;
import cn.lzm.designModel.FactoryModel.factory.Factory;

public class Test {
    public static void main(String[] args) {
        Factory factory = new AppleFactory();
        factory.crateFuilt().print();
    }
}
