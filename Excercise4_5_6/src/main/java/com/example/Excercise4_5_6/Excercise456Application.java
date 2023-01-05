package com.example.Excercise4_5_6;

import com.example.Excercise4_5_6.entities.Laptop;
import com.example.Excercise4_5_6.repositories.LaptopRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Excercise456Application {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(Excercise456Application.class, args);
		LaptopRepository repository = context.getBean(LaptopRepository.class);

		Laptop laptop1 = new Laptop(null, 24382122, "Asus", "Xc20", true);

		Laptop laptop2 = new Laptop(null, 12333542, "MSI", "Zh100", true);
		Laptop laptop3 = new Laptop(null, 12333455, "Benq", "B7000", false);

		repository.save(laptop1);
		repository.save(laptop2);
		repository.save(laptop3);


	}

}
