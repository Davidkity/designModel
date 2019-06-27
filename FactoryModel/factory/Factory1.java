package cn.lzm.designModel.FactoryModel.factory;

import cn.lzm.designModel.FactoryModel.pojo.Fuilt;

public class Factory1 {

    private static Fuilt fuilt;

    public static final Factory1 getInstance(){
        return FactoryHolder.factoryHolder;
    }

    private Factory1(Fuilt fuilt){

    }

    private static class FactoryHolder{
        private static final Factory1 factoryHolder = new Factory1(fuilt);
    }
}
