package Airline.functions;

import Airline.Airline;
import Airline.functions.AircraftSummer;
import Airline.model.Aircraft;

public class AircraftSumWeight implements AircraftSummer {

    private double sum;

    public AircraftSumWeight(){
        sum = 0;
    }

    @Override
    public void add(Aircraft aircraft) {
        sum += aircraft.getWeightLift();
    }

    @Override
    public String toString() {
        return sum + "kg";
    }
}
