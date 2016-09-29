package ru.itis;

/**
 * Created by KFU-user on 29.09.2016.
 */
abstract class Transport {

    private int wheelCount;

    public int getWheelCount() {
        return wheelCount;
    }

    public void setWheelCount(int wheelCount) {
        this.wheelCount = wheelCount;
    }



    public Transport(int wheelsCount){
        this.wheelCount = wheelsCount;
    }

    public abstract void go();

    @Override
    public String toString() {
        return "Transport " + wheelCount;
    }
}
