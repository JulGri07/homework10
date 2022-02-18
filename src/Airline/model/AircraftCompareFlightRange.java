package Airline.model;

public class AircraftCompareFlightRange implements java.util.Comparator<Aircraft> {
    @Override
    public int compare(Aircraft o1, Aircraft o2) {
        return (int)(o1.getRangeOfFlight()-o2.getRangeOfFlight());
    }
}
