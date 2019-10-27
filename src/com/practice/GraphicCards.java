package com.practice;

public class GraphicCards {
    private String brand;
    private int series;
    private String memory;

    public GraphicCards() {
        this.brand = "Nvidea";
        this.series = 460;
        this.memory = "2GB";
    }

    public GraphicCards(String brand, int series, String memory) {
        this.brand = brand;
        this.series = series;
        this.memory = memory;
    }

    public String getBrand() {
        return brand;
    }

    public int getSeries() {
        return series;
    }

    public String getMemory() {
        return memory;
    }

    @Override
    public String toString() {
        return "GraphicCards{" +
                "brand='" + brand + '\'' +
                ", series=" + series +
                ", memory='" + memory + '\'' +
                '}';
    }
}
