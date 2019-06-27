package cn.lzm.designModel.adapterModel.classAdapter;

public class Adapter extends Usber implements Ps2 {
    @Override
    public void isPs2() {
        isUsb();
    }
}
