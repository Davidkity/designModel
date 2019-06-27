package cn.lzm.designModel.adapterModel.objectAdapter;

import cn.lzm.designModel.adapterModel.classAdapter.Ps2;


public class Adapter implements Ps2 {

    private Usb usb;

    public Adapter(Usb usb) {
        this.usb = usb;
    }

    @Override
    public void isPs2() {
        usb.isUsb();
    }
}
