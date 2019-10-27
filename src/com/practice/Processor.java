package com.practice;

public class Processor {

    private String brand;
    private String series;
    private String cachmemory;
    private String frequency;
    private String minFrequency;
    private String maxFrequency;

    private int generation;
    private int core;
    private int thread;


    public Processor() {
        this.brand = "Intel";
        this.series = "i5 7200u";
        this.cachmemory = "3mb";
        this.frequency = "2.5GHz";
        this.minFrequency = "2.5Ghz";
        this.maxFrequency = "3.2Ghz";
        this.generation = 7;
        this.core = 2;
        this.thread = 4;
    }

    public Processor(String brand, String series, String cachmemory, String frequency, String minFrequency, String maxFrequency, int generation, int core, int thread) {
        this.brand = brand;
        this.series = series;
        this.cachmemory = cachmemory;
        this.frequency = frequency;
        this.minFrequency = minFrequency;
        this.maxFrequency = maxFrequency;
        this.generation = generation;
        this.core = core;
        this.thread = thread;
    }

    public String getBrand() {
        return brand;
    }

    public String getSeries() {
        return series;
    }

    public String getCachmemory() {
        return cachmemory;
    }

    public String getFrequency() {
        return frequency;
    }

    public String getMinFrequency() {
        return minFrequency;
    }

    public String getMaxFrequency() {
        return maxFrequency;
    }

    public int getGeneration() {
        return generation;
    }

    public int getCore() {
        return core;
    }

    public int getThread() {
        return thread;
    }

    @Override
    public String toString() {
        return "Processor{" +
                "brand='" + brand + '\'' +
                ", series='" + series + '\'' +
                ", cachmemory='" + cachmemory + '\'' +
                ", frequency='" + frequency + '\'' +
                ", minFrequency='" + minFrequency + '\'' +
                ", maxFrequency='" + maxFrequency + '\'' +
                ", generation=" + generation +
                ", core=" + core +
                ", thread=" + thread +
                '}';
    }
}
