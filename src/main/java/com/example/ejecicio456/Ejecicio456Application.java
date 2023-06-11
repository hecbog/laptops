package com.example.ejecicio456;

import com.example.ejecicio456.entities.Laptop;
import com.example.ejecicio456.repository.LaptopRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Ejecicio456Application {

	public static void main(String[] args) {


		ApplicationContext context = SpringApplication.run(Ejecicio456Application.class, args);
		LaptopRepository repository = context.getBean(LaptopRepository.class);

		System.out.println("Cantidad de Laptops en DDBB: " + repository.findAll().size());

		Laptop laptop1 = new Laptop(null, "acer", "aspire123", 550,"windows10");
		Laptop laptop2 = new Laptop(null, "toshiba", "t155a", 455.50,"windows11");
		Laptop laptop3 = new Laptop(null, "hp", "Stream16", 650.55, "windows10");

		repository.save(laptop1);
		repository.save(laptop2);
		repository.save(laptop3);

		

		System.out.println("Cantidad de Laptops en DDBB: " + repository.findAll().size());








	}


}
