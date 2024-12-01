package com.example.enumOverIf;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ShippingCalculatorApplication {

	public static void main(String[] args) {
		SpringApplication.run(ShippingCalculatorApplication.class, args);


		// Create an instance of ShippingCalculator
		ShippingCalculator calculator = new ShippingCalculator();

		// input values
		double weight = 3.0;
		ShippingType shipping = ShippingType.EXPRESS;

		// Calculate shipping costs for different shipping types
		double cost = calculator.calculateShippingCost(shipping, weight);

		System.out.println("Express Shipping Cost: €" + cost);

	}

}
