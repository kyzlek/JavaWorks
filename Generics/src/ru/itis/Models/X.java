package ru.itis.Models;

/**
 * Created by Kyzlek_pc on 06.10.2016.
 */
public class X implements B {
    private int x1, x2;

    public X(int x1, int x2) {
        this.x1 = x1;
        this.x2 = x2;
    }

    @Override
    public int calc2() {
        return x1+x2;
    }
}
