package cn.lzm.designModel.FactoryModel.pojo;

public class Orange extends Fuilt {
    @Override
    public void print() {
        System.out.println("橘子");
    }

    @Override
    public String getName() {
        return "橘子";
    }
}
