package com.example.enumOverIf;

public class ShippingCalculator {

    /**
     * calculates the shipping cost based on the shipping type and weight.
     *
     * @param shippingType The type of shipping (STANDARD, EXPRESS, OVERNIGHT).
     * @param weight The weight of the package in kilograms.
     * @return The calculated shipping cost.
     */
    public double calculateShippingCost(ShippingType shippingType, double weight) {
        return shippingType.calculateCost(weight);
    }

}
