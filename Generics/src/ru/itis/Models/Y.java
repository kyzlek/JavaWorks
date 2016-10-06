package ru.itis.Models;

/**
 * Created by Kyzlek_pc on 06.10.2016.
 */
public class Y implements B {
    private int y1, y2;
    public Y(int y1, int y2){
        this.y1 = y1;
        this.y2 = y2;
    }
    @Override
    public int calc2() {
        return y1+y2;
    }
}
