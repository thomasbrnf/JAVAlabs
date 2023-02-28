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
        CustomSorter.add(tank.getSpeed());
        CustomSorter.add(automobile.getSpeed());
        CustomSorter.add(motorcycle.getSpeed());
        CustomSorter.descendingOrder();
        CustomSorter.byGrowth();
    }
}