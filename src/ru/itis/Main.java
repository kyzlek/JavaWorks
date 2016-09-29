package ru.itis;

public class Main {

    public static void main(String[] args) {
        Auto auto = new Auto(4, 95);
        Auto auto1 = new Auto(5,95);
        SportAuto sportAuto = new SportAuto(10,96);
        SportAuto sportAuto1 = new SportAuto(11,96);
        Bike bike = new Bike(12);
        Bike bike1 = new Bike(2);

        Transport transports[] = {auto, auto1, sportAuto, sportAuto1, bike, bike1};
        int r = transports[0].getWheelCount();
        //for(int i=0; i< transports.length; i++){
        //    Transport currentTransport = transports[i];
        //    currentTransport.go();
        //}
        for(int i=0; i<transports.length; i++){
            if(r> transports[i].getWheelCount()){
                r = transports[i].getWheelCount();
            }
        }
        System.out.println("Min "+r );
    }
}
