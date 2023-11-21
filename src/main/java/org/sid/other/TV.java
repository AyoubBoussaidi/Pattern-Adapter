package org.sid.other;

import java.util.Arrays;

public class TV implements HDMI{
    @Override
    public void plot(byte[] data) {

        System.out.println(Arrays.toString(data));
    }
}
