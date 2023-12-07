package com.shash.maven;
import org.apache.commons.collections4.Unmodifiable;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Hello world!
 *
 */
@SpringBootApplication
@RestController
public class App implements Unmodifiable
{
    public static void main( String[] args )
    {
    	SpringApplication.run(App.class, args);
    }
    
    @GetMapping("/hellomaven")
    public String  letsLearnMaven() {
    	return "Hello Maven from Spring Boot";
    }
}
