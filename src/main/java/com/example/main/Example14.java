package com.example.main;

import com.example.config.ProjectConfig;
import com.example.services.VehicleServices;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Example14 {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);
        VehicleServices vehicleServices = context.getBean(VehicleServices.class);
        VehicleServices vehicleServices1 =context.getBean("vehicleServices", VehicleServices.class);
        System.out.println("Hashcode Of Object Vehicle Service 1 : "+vehicleServices.hashCode());
        System.out.println("Hashcode Of Object Vehicle Service 2 : "+vehicleServices1.hashCode());
        if (vehicleServices == vehicleServices1)
            System.out.println("Vehicle Services is a Singleton Scope Bean.");
    }
}
