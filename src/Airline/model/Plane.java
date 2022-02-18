package Airline.model;

public class Plane extends Aircraft {
    String PlaneType;

    public Plane(String vendorName, String aircraftName,
                 int seatingCapacity, double weightLift, double fuelEndurance,
                 double rangeOfFlight, double fuelConsumption, String planeType) {
        super("plane", vendorName, aircraftName, seatingCapacity,
                weightLift, fuelEndurance, fuelConsumption, rangeOfFlight);
        PlaneType = planeType;
    }
}
