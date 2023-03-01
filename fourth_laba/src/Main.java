import java.text.CollationElementIterator;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Tank tank = new Tank("M1 Abrams",
                            2012, 200000);
        tank.setGunCaliber(127);
        tank.setSpeed(75);
        Automobile automobile = new Automobile("Tesla Model S",
                            2020, 140000);
        automobile.setType("Plaid");
        automobile.setSpeed(200);
        Motorcycle motorcycle = new Motorcycle("Yamaha",
                2020, 30000);
        motorcycle.setSpeed(120);
        System.out.println(tank.getModel() + "\n"
                + automobile.getModel() + "\n" + motorcycle.getModel());
        VehicleSpeedComparator speedComparator = new VehicleSpeedComparator();
        List<IVehicle> vehicles = new LinkedList<>();
        vehicles.add(automobile);
        vehicles.add(tank);
        vehicles.add(motorcycle);
        vehicles.sort(speedComparator);
        System.out.println(vehicles);

    }
}