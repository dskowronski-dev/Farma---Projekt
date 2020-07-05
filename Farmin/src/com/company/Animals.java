package com.company;

public class Animals {

    public Double weight;
    final String species;
    public Double value;
    public static final Double DEFAULT_PIG_WEIGHT = 100.0;
    public static final Double DEFAULT_COW_WEIGHT = 200.0;
    public static final Double DEFAULT_CHICKEN_WEIGHT = 2.0;
    public static final Double DEFAULT_PIG_VALUE = 150.0;
    public static final Double DEFAULT_COW_VALUE = 250.0;
    public static final Double DEFAULT_CHICKEN_VALUE = 15.0;

    public Animals(String species) {
        this.species = species;

        switch (species) {
            case "pig":
                this.weight = DEFAULT_PIG_WEIGHT;
                this.value = DEFAULT_PIG_VALUE;
                break;
            case "cow":
                this.weight = DEFAULT_COW_WEIGHT;
                this.value = DEFAULT_COW_VALUE;
                break;
            case "chicken":
                this.weight = DEFAULT_CHICKEN_WEIGHT;
                this.value = DEFAULT_CHICKEN_VALUE;
                break;
        }
    }
    public Animals(String species, Double weight){
        this.species = species;
        this.weight = weight;
    }




}
