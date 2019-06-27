package cn.lzm.designModel.FactoryModel.abstractFactory;

import cn.lzm.designModel.FactoryModel.pojo.Fuilt;
import cn.lzm.designModel.FactoryModel.pojo.FuiltNull;

public abstract class AbstractFactory {

    protected abstract Fuilt getFuilt();

    public Fuilt getFuilt(String name){
        if ("苹果".equals(name)) {
            return new AppleFactory().getFuilt();
        }else if ("橘子".equals(name)){
            return new OrangeFactory().getFuilt();
        }else{
//            System.out.println("此产品不能生产"+name);
            return new FactoryNull().getFuilt();
        }
    }
}
