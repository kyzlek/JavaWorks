package ru.itis;

/**
 * Created by KFU-user on 29.09.2016.
 */
public class SportAuto extends Auto {
    public void go(){
        System.out.println("I'm SuperAuto");
    }
    public SportAuto(int wheelsCount, int gasNumber){
        super(wheelsCount, gasNumber);
    }
}
