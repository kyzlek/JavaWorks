package ru.itis.Models;

/**
 * Created by Kyzlek_pc on 06.10.2016.
 */
public class Z implements D{

    private int z1;
    private int z2;

    public Z(int z1, int z2) {
        this.z1 = z1;
        this.z2 = z2;
    }

    @Override
    public int calc() {
        return z1+z2;
    }
}
