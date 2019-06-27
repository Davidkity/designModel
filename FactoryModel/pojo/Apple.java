package cn.lzm.designModel.FactoryModel.pojo;

public class Apple extends Fuilt {
    @Override
    public void print() {
        System.out.println("苹果");
    }

    @Override
    public String getName() {
        return "苹果";
    }
}
