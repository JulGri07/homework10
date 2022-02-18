package Airline;
/*3. Авиакомпания.
Определить иерархию самолетов.
Создать авиакомпанию.
Посчитать общую вместимость и грузоподъемность.
Провести сортировку самолетов компании по дальности полета.
Найти самолет в компании, соответствующий заданному диапазону параметров потребления горючего.
 */

import Airline.functions.*;
import Airline.model.AircraftCompareFlightRange;
import Airline.model.Helicopter;
import Airline.model.Plane;

public class AirlineRunner {
    public static void main(String[] args) throws Exception {
        Airline airline = new Airline("MyAirlines");
        airline.addAircraft(new Plane("Boeing","Airbus",
                100,2000,
                500,3000,2600, "Airbus"));
        airline.addAircraft(new Helicopter("Textron","Textron ",
                20, 1000,300,1000,10, 1001));
        System.out.println(airline);

        FleetServices services = new FleetServices();

        System.out.println("Total seats: " +
                services.getFleetSummary(new AircraftSumSeating(), airline));

        System.out.println("Total weight: "+
                services.getFleetSummary(new AircraftSumWeight(), airline));

        System.out.println("Sort by the range of flight\n");
        services.sortFleet(new AircraftCompareFlightRange(),airline);
        services.printFleet(airline.getAircrafts());

        System.out.println("Aircraft in the company, corresponding to the specified range of fuel consumption parameters \n");
        double from = 2500;
        double to = 4000;
        System.out.println("Fuel Consumption range from " + from + " to " + to + ":");
        services.printFleet(services.getFleetSublist(new AircraftCheckFuelConsumption(from, to), airline));

    }
}
