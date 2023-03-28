package com.example.lab;

import com.example.lab.UI.select_equipment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.ApplicationListener;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

public class Start implements CommandLineRunner {

    @Override
    public void run(String... args) throws Exception {
        new select_equipment().init();
    }

}
