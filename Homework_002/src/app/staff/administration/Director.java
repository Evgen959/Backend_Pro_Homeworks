package app.staff.administration;

import org.springframework.beans.factory.annotation.Autowired;

public class Director {
    @Autowired
    private ElectricalEngineer electricalEngineer;

    public void workshop(){
        electricalEngineer.giveOrders();
    }

    public ElectricalEngineer getElectricalEngineer() {
        return electricalEngineer;
    }

    public void setElectricalEngineer(ElectricalEngineer electricalEngineer) {
        this.electricalEngineer = electricalEngineer;
    }
}
