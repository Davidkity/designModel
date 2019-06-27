package cn.lzm.designModel.FactoryModel;

import cn.lzm.designModel.FactoryModel.abstractFactory.AbstractFactory;
import cn.lzm.designModel.FactoryModel.abstractFactory.AppleFactory;
import cn.lzm.designModel.FactoryModel.abstractFactory.DefaultFactory;
import cn.lzm.designModel.FactoryModel.pojo.Fuilt;

public class AbstactFactoryTest {
    public static void main(String[] args) {
        AbstractFactory factory = new DefaultFactory();
        System.out.println(factory.getFuilt("橘子").getName());
        System.out.println(factory.getFuilt("苹果").getName());
        System.out.println(factory.getFuilt("hsajfh").getName());
    }

}
