package Airline.model;

public class Helicopter extends Aircraft {
    private double rotorBladesLength;

    public Helicopter(String vendorName, String aircraftName, int seatingCapacity, double weightLift, double fuelEndurance, double fuelConsumption, double rangeOfFlight, double rotorBladesLength) {
        super("helicopter", vendorName, aircraftName, seatingCapacity, weightLift, fuelEndurance, fuelConsumption, rangeOfFlight);
        this.rotorBladesLength = rotorBladesLength;
    }

    @Override
    public String toString() {
        return super.toString() + "Rotor Length : " + rotorBladesLength +"\n";
    }
}
