package com.example.demo;

import com.example.demo.repository.BuyersRepository;
import com.example.demo.repository.ShopRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class MyshopApplication {

    public static void main(String[] args) {

        SpringApplication.run(MyshopApplication.class, args);

	//ConfigurableApplicationContext context = SpringApplication.run(MyshopApplication.class, args);
	//	ShopRepository repository = context.getBean(ShopRepository.class);
    //    ConfigurableApplicationContext context = SpringApplication.run(MyshopApplication.class, args);
     //   BuyersRepository repository = context.getBean(BuyersRepository.class);
        // crud
        // C Create
//	repository.save(new Buyers("Иван"));
        //	repository.save(new Buyers("Светлана"));
        //	repository.save(new Buyers("Михаил"));
        //	repository.save(new Buyers("Максим"));
        //	repository.save(new Buyers("Тимофей"));

        // R Read
        //System.out.println(repository.findAll());

        // U Update
//		System.out.println(repository.findAll());
//		repository.save(new Shop(4, "Блендер"));
//		System.out.println(repository.findAll());

        // D Delete
//		System.out.println(repository.findAll());
//		repository.deleteById(2);
//		repository.delete(new Shop(4));
//		System.out.println(repository.findAll());

    }

}
