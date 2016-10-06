package ru.itis.Generic;

import ru.itis.Models.B;
import ru.itis.Models.D;

/**
 * Created by Kyzlek_pc on 06.10.2016.
 */


//Марсель почему когда я убираю extends то выходит ошибка???????????????????????????????????????????????????????????
    //Ведь Q без extends должен принимать все объекты класса X
    //
public class Q<X extends B, Y extends B, Z extends D> {
    private X x;
    private Y y;
    private Z z;

    public Q(X x, Y y, Z z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public int allCalc(){
        return x.calc2() + y.calc2() + z.calc();
    }
}
