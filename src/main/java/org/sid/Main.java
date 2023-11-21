package org.sid;

import org.sid.adapter.HdmiVgaAdapter;
import org.sid.std.Moniteur;
import org.sid.std.Standard;
import org.sid.std.UniteCentrale;
import org.sid.std.VP;

public class Main {
    public static void main(String[] args) {

        Standard std=new Moniteur();
        UniteCentrale uc=new UniteCentrale();
        uc.setStandard(std);
        uc.afficher("Unite Centrale");
        std.print("Moniteur");
        Standard vp=new VP();
        vp.print("Video Projecteur");
        
    }
}