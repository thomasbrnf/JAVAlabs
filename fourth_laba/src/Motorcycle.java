public class Motorcycle implements IVehicle, IWheeledVehicle{
    private int wheelRadius;
    private int speed;
    private int price;
    private int year;
    private String model;
    private String type;
    Motorcycle(String model, int year, int price){
        this.model = model;
        this.year = year;
        this.price = price;
    }
    public void setSpeed(int speed){
        this.speed = speed;
    }
    @Override
    public int getSpeed() {
        return speed;
    }
    public void setModel(String model){
        this.model = model;
    }
    @Override
    public String getModel() {
        return model;
    }
    public void setPrice(int price){
        this.price = price;
    }
    @Override
    public int getSPrice() {
        return price;
    }
    public void setYear(int year){
        this.year = year;
    }
    @Override
    public int getYear() {
        return year;
    }
    public void setType(String type){
        this.type = type;
    }
    @Override
    public String getType() {
        return type;
    }
    @Override
    public int getNumOfWheels() {
        return 2;
    }
    public void setWheelRadius(int wheelRadius){
        this.wheelRadius = wheelRadius;
    }
    @Override
    public int getWheelRadius() {
        return wheelRadius;
    }
}
