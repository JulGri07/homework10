package Airline.functions;

import Airline.Airline;
import Airline.functions.AircraftChecker;
import Airline.model.Aircraft;

public class AircraftCheckFuelConsumption implements AircraftChecker {
    private double from, to;

    public AircraftCheckFuelConsumption(double from, double to){
        this.from = from;
        this.to = to;
    }

    @Override
    public boolean check(Aircraft aircraft) {
        return aircraft.getFuelConsumption() >= from && aircraft.getFuelConsumption() <= to;
    }
}
