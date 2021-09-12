package org.techtown.gico;

public class Unit {
    String unit;
    int res;

    public Unit(String unit){ this.unit = unit; this.res = R.drawable.ic_launcher_background; }

    public Unit(String unit, int res) { this.unit = unit; this.res = res; }

    public int getRes() { return res; }

    public void setRes(int res) { this.res = res; }

    public String getUnit(){
        return unit;
    }

    public void setUnit(String unit){
        this.unit = unit;
    }
}
