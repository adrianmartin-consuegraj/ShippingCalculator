package com.example.enumOverIf;

public enum ShippingType {

    STANDARD {
        @Override
        public double calculateCost(double weight) {
            return weight * 5.0; // 5 EUR per Kilo
        }
    },
    EXPRESS {
        @Override
        public double calculateCost(double weight) {
            return weight * 10.0; // 10 EUR per Kilo
        }
    },
    OVERNIGHT {
        @Override
        public double calculateCost(double weight) {
            return weight * 20.0; // 20 EUR per Kilo
        }
    };

    // abstract method to be implemented by each shipping type
    public abstract double calculateCost(double weight);
}
