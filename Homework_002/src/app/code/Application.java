package app.code;

import app.staff.administration.Director;
import app.staff.administration.ElectricalEngineer;
import app.staff.specialists.Electrician;

public class Application {
    public static void main(String[] args) {
        Electrician electrician =new Electrician();

        ElectricalEngineer electricalEngineer = new ElectricalEngineer();
        electricalEngineer.setElectrician(electrician);

        Director director = new Director();
        director.setElectricalEngineer(electricalEngineer);

        director.workshop();
    }
}
