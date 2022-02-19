package Airline.functions;

import Airline.Airline;
import Airline.model.Aircraft;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class FleetServices {

    public FleetServices() {

    }

    public String getFleetSummary(AircraftSummer sum, Airline airline) {
        for (Aircraft aircraft : airline.getAircrafts()) {
            sum.add(aircraft);
        }
        return sum.toString();
    }

    public List<Aircraft> getFleetSublist(AircraftChecker f, Airline airline) {
        List<Aircraft> result = new ArrayList<Aircraft>();
        for (Aircraft aircraft : airline.getAircrafts()) {
            if (f.check(aircraft)) {
                result.add(aircraft);
            }
        }
        return result;
    }

    public void sortFleet(Comparator<Aircraft> c, Airline airline) {
        airline.getAircrafts().sort(c);
    }

    public void printFleet(List<Aircraft> aircrafts) {
        if (aircrafts.size()>0) {
            for (Aircraft aircraft : aircrafts) {
                System.out.println(aircraft);
            }
        } else {
            System.out.println("Empty");
        }
    }
}
