package app.config;

import app.staff.administration.Director;
import app.staff.administration.ElectricalEngineer;
import app.staff.specialists.Electrician;
import org.springframework.context.annotation.Bean;

public class AppConfig {
    @Bean
    public Director getDirector(){
        return new Director();
    }

    @Bean
    public ElectricalEngineer getElectricalEngineer(){
        return new ElectricalEngineer();
    }

    @Bean
    public Electrician getElectrician (){
        return new Electrician();
    }
}
