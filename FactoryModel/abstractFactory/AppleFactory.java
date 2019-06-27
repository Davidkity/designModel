package cn.lzm.designModel.FactoryModel.abstractFactory;

import cn.lzm.designModel.FactoryModel.pojo.Apple;
import cn.lzm.designModel.FactoryModel.pojo.Fuilt;

public class AppleFactory extends AbstractFactory {

    @Override
    protected Fuilt getFuilt() {
        return new Apple();
    }
}
