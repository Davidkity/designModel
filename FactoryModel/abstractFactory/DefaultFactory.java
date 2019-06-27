package cn.lzm.designModel.FactoryModel.abstractFactory;

import cn.lzm.designModel.FactoryModel.pojo.Fuilt;

public class DefaultFactory extends AbstractFactory {
    @Override
    protected Fuilt getFuilt() {
        return new DefaultFactory().getFuilt();
    }
}
