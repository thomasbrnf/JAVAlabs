import java.util.ArrayList;
import java.util.List;

public class Tank implements IVehicle, ITrackedVehicle{
    private int caterpillarsLength;
    private int gunCaliber;
    private int speed;
    private int price;
    private int year;
    private String model;
    private String type;
    Tank(String model, int year, int price){
        this.model = model;
        this.year = year;
        this.price = price;
    }
    @Override
    public int getCaterpillarsLength() {
        return caterpillarsLength;
    }
    public void setCaterpillarsLength(int caterpillarsLength) {
        this.caterpillarsLength = caterpillarsLength;
    }
    @Override
    public int getGunCaliber() {
        return gunCaliber;
    }
    public void setGunCaliber(int gunCaliber) {
        this.gunCaliber = gunCaliber;
    }
    @Override
    public int getSpeed() {
        return speed;
    }
    public void setSpeed(int speed) {
        this.speed = speed;
    }
    @Override
    public String getModel() {
        return model;
    }
    public void setModel(String model) {
        this.model = model;
    }
    @Override
    public int getSPrice() {
        return price;
    }
    public void setPrice(int price) {
        this.price = price;
    }
    @Override
    public int getYear() {
        return year;
    }
    public void setYear(int year) {
        this.year = year;
    }
    @Override
    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }
}
