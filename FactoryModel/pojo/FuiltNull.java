package cn.lzm.designModel.FactoryModel.pojo;

public class FuiltNull extends Fuilt {
    @Override
    public void print() {
        System.out.println("苹果");
    }

    @Override
    public String getName() {
        return "该产品不能生产";
    }
}
