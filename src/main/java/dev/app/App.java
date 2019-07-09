package dev.app;

import org.springframework.boot.SpringApplication;
import org.springframework.context.ConfigurableApplicationContext;

import dev.presentation.Menu;

public class App {
	
    public static void main(String[] args) {
    	
    	ConfigurableApplicationContext context = SpringApplication.run(AppConfig.class, args);	

    	Menu menu = context.getBean(Menu.class);
    
        menu.demarrer();
    }
}
