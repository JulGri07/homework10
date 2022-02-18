package Airline;
import Airline.model.Aircraft;

import java.util.ArrayList;
import java.util.List;

public class Airline {
    private String name;
    private List<Aircraft> aircrafts = new ArrayList<Aircraft>();

    public Airline(String name) {
        this.name = name;
    }

    public boolean addAircraft(Aircraft aircraft) {
        return aircrafts.add(aircraft);
    }

    public List<Aircraft> getAircrafts() {
        return aircrafts;
    }

    public String showAircrafts() {
        String result = new String();
        result = "List of the aircrafts:\n";
        if (aircrafts.size()>0) {
            for (Aircraft aircraft : aircrafts) {
                result += aircraft.toString() + "\n";
            }
        } else {
            result += "Empty\n";
        }
        return result;
    }

    @Override
    public String toString() {
        return "Airline: " + name + "\n" + showAircrafts();
    }
}
