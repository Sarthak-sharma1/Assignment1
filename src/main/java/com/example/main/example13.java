package com.example.main;

import com.example.beans.Person;
import com.example.beans.Vehicle;
import com.example.config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class example13 {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);
        /*
         Person person = context.getBean(Person.class);
         Vehicle vehicle = context.getBean(Vehicle.class);
         person.getVehicle().getVehicleServices().playMusic();
         System.out.println( vehicle.getName());
         vehicle.getVehicleServices().rotate();
        */

        String [] persons = context.getBeanNamesForType(Person.class);
        Person person = context.getBean(Person.class);
        String [] name = context.getBeanNamesForType(Vehicle.class);
        Vehicle vehicle = context.getBean(Vehicle.class);
        vehicle.getVehicleServices().rotate();
        vehicle.getVehicleServices().playMusic();

    }
}
