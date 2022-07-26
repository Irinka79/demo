package com.example.demo;

import com.example.demo.model.Buyers;
import com.example.demo.model.Shop;
import com.example.demo.repository.BuyersRepository;
import com.example.demo.repository.ShopRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class MyshopApplication {

    public static void main(String[] args) {

        SpringApplication.run(MyshopApplication.class, args);


    }

}
