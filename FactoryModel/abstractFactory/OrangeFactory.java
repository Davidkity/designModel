package cn.lzm.designModel.FactoryModel.abstractFactory;

import cn.lzm.designModel.FactoryModel.pojo.Apple;
import cn.lzm.designModel.FactoryModel.pojo.Fuilt;
import cn.lzm.designModel.FactoryModel.pojo.Orange;

public class OrangeFactory extends AbstractFactory {

    @Override
    protected Fuilt getFuilt() {
        return new Orange();
    }
}
