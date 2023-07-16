package com.pisien.edu.pro.pro10Lamda.entity;

public class Population {

    private String region;
    private int population;

    public Population(String region, int population) {
        this.region = region;
        this.population = population;
    }

    public String getRegion() {
        return region;
    }

    public int getPopulation() {
        return population;
    }
}
