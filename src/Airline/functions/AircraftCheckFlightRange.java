package Airline.functions;

import Airline.Airline;
import Airline.functions.AircraftChecker;
import Airline.model.Aircraft;

public class AircraftCheckFlightRange implements AircraftChecker {
    private double from, to;

    public AircraftCheckFlightRange(double from, double to) {
        this.from = from;
        this.to = to;
    }

    @Override
    public boolean check(Aircraft aircraft) {
        return aircraft.getRangeOfFlight() >= from && aircraft.getRangeOfFlight() <= to;
    }
}
