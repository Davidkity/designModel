package cn.lzm.designModel.FactoryModel.abstractFactory;

import cn.lzm.designModel.FactoryModel.pojo.Fuilt;
import cn.lzm.designModel.FactoryModel.pojo.FuiltNull;

public class FactoryNull extends AbstractFactory {
    @Override
    protected Fuilt getFuilt() {
        return new FuiltNull();
    }
}
