package app.staff.administration;

import app.staff.specialists.Electrician;
import org.springframework.beans.factory.annotation.Autowired;

public class ElectricalEngineer {
    @Autowired
    private Electrician electrician;

    public void giveOrders(){
        electrician.work();
    }

    public Electrician getElectrician() {
        return electrician;
    }

    public void setElectrician(Electrician electrician) {
        this.electrician = electrician;
    }
}
