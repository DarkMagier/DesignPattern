package com.principle.SingleResponsibility;

public class SingleResponsibililty02 {
    public static void main(String[] args) {
        RoadVehicle roadVehicle = new RoadVehicle();
        roadVehicle.run("moto");
        roadVehicle.run("car");
        AirVehicle airVehicle = new AirVehicle();
        airVehicle.run("flight");
    }
}
// method #2 comply the single responsible principle.
// however, it is heavy cost. It need to seperate one class to variance, and re-modify the client.
// promotion: directly change the Vehicle class.
class RoadVehicle{
    public void run(String vehicle){
        System.out.println(vehicle+" 在公路上運行。。。");
    }
}
class AirVehicle{
    public void run(String vehicle){
        System.out.println(vehicle+" 在天空上運行。。。");
    }
}
class WaterVehicle{
    public void run(String vehicle){
        System.out.println(vehicle+" 在水中運行。。。");
    }
}