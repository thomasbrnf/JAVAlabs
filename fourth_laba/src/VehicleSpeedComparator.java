import java.util.Comparator;
public class VehicleSpeedComparator implements Comparator<IVehicle> {
    @Override
    public int compare(IVehicle o1, IVehicle o2) {
        return Integer.compare(o1.getSpeed(),o2.getSpeed());
    }
}
