package org.example.config;

import org.example.model.Doctor;
import org.springframework.context.annotation.*;

@Configuration
@ComponentScan(basePackages = "org.example")
public class SpringConfig {
    //@Scope("prototype")
    @Bean(value = "general",initMethod = "init")
    public Doctor doctor() {
        return new Doctor("Dr. Smith", "Physiotherapist");
    }
}
