package org.sid.adapter;

import org.sid.other.HDMI;
import org.sid.std.Standard;

public class HdmiVgaAdapter implements Standard {
    private HDMI hdmi;

    void adopt(byte[] data){
        hdmi.plot(data);
    }

    public HDMI getHdmi() {
        return hdmi;
    }

    public void setHdmi(HDMI hdmi) {
        this.hdmi = hdmi;
    }

    @Override
    public void print(String str) {
        System.out.println(str);
    }
}
