package app.code;

import app.staff.administration.Director;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

public class ApplicationWithSpring {
    public static void main(String[] args) {

        AbstractApplicationContext context = new AnnotationConfigApplicationContext("app.config");

        Director director = context.getBean(Director.class);

        director.workshop();
    }
}
