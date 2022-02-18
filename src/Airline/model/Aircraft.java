package Airline.model;

import Airline.Airline;

public abstract class Aircraft {
    private String aircraftType;
    private String vendorName;
    private String aircraftName;

    private int seatingCapacity;
    private double weightLift;
    private double fuelEndurance;
    private double rangeOfFlight;
    private double fuelConsumption;

    public Aircraft(String aircraftType, String vendorName,
                    String aircraftName, int seatingCapacity,
                    double weightLift, double fuelEndurance, double rangeOfFlight, double fuelConsumption) {
        this.aircraftType = aircraftType;
        this.vendorName = vendorName;
        this.aircraftName = aircraftName;
        this.seatingCapacity = seatingCapacity;
        this.weightLift = weightLift;
        this.fuelEndurance = fuelEndurance;
        this.rangeOfFlight = rangeOfFlight;
        this.fuelConsumption = fuelConsumption;
    }

    public double getFuelConsumption() {
        return fuelConsumption;
    }

    public void setFuelConsumption(double fuelConsumption) {
        this.fuelConsumption = fuelConsumption;
    }

    public void setAircraftName(String aircraftName) {
        this.aircraftName = aircraftName;
    }

    protected void setAircraftType(String aircraftType) {
        this.aircraftType = aircraftType;
    }

    public void setVendorName(String vendorName) {
        this.vendorName = vendorName;
    }

    public void setRangeOfFlight(double rangeOfFlight) {
        this.rangeOfFlight = rangeOfFlight;
    }

    public String getAircraftType() {
        return aircraftType;
    }

    public String getVendorName() {
        return vendorName;
    }

    public String getAircraftName() {
        return aircraftName;
    }

    public int getSeatingCapacity() {
        return seatingCapacity;
    }

    public void setSeatingCapacity(int seatingCapacity) {
        this.seatingCapacity = seatingCapacity;
    }

    public double getWeightLift() {
        return weightLift;
    }

    public void setWeightLift(double weightLift) {
        this.weightLift = weightLift;
    }

    public double getFuelEndurance() {
        return fuelEndurance;
    }

    public void setFuelEndurance(double fuelEndurance) {
        this.fuelEndurance = fuelEndurance;
    }

    public double getRangeOfFlight() {
        return rangeOfFlight;
    }

    @Override
    public String toString() {
        return " Name : " + aircraftName + "\n" +
                " Type : " + aircraftType + "\n" +
                " Vendor : " + vendorName + "\n" +
                " Weight lift : " + weightLift + "\n" +
                " Range : " + rangeOfFlight + "\n" +
                " Seating : " + seatingCapacity + "\n" +
                " Fuel Consumption : " + fuelConsumption;
    }
}
