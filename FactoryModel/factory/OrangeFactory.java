package cn.lzm.designModel.FactoryModel.factory;


import cn.lzm.designModel.FactoryModel.pojo.Fuilt;
import cn.lzm.designModel.FactoryModel.pojo.Orange;

public class OrangeFactory implements Factory{

    @Override
    public Fuilt crateFuilt() {
        return new Orange();
    }
}
