package cn.lzm.designModel.FactoryModel.factory;

import cn.lzm.designModel.FactoryModel.pojo.Apple;
import cn.lzm.designModel.FactoryModel.pojo.Fuilt;

public class AppleFactory implements Factory{

    @Override
    public Fuilt crateFuilt() {
        return new Apple();
    }
}
