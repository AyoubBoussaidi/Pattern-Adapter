package org.sid.std;

public class UniteCentrale {
    private Standard standard;

    public void afficher(String str){
        standard.print(str);
    }

    public Standard getStandard() {
        return standard;
    }

    public void setStandard(Standard standard) {
        this.standard = standard;
    }
}
