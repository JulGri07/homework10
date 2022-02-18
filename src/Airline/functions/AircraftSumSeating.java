package Airline.functions;

import Airline.Airline;
import Airline.functions.AircraftSummer;
import Airline.model.Aircraft;

public class AircraftSumSeating implements AircraftSummer {
    private int sum;

    public AircraftSumSeating(){
        sum = 0;
    }

    @Override
    public void add(Aircraft aircraft) {
        sum += aircraft.getSeatingCapacity();
    }

    @Override
    public String toString() {
        return sum + " seats";
    }
}
