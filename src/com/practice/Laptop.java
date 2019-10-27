package com.practice;

public class Laptop extends Processor{
    private float screen;
    private String ram;
    private String hardDrive;
    private String opticalDrive;
    private String keybord;

    private Processor processor;
    private GraphicCards graphicCards;

    public Laptop(){
        this.screen = 15.6f;
        this.ram = "DDR4";
        this.hardDrive = "2TB";
        this.opticalDrive = "mlt layer";
        this.keybord = "backlit";
        this.processor = new Processor();
        this.graphicCards = new GraphicCards();

    }
    public Laptop(float screen, String ram, String hardDrive, String opticalDrive, String keybord, Processor processor, GraphicCards graphicCards) {
        this.screen = screen;
        this.ram = ram;
        this.hardDrive = hardDrive;
        this.opticalDrive = opticalDrive;
        this.keybord = keybord;
        this.processor = processor;
        this.graphicCards = graphicCards;
    }

    @Override
    public String toString() {
        return "Laptop{" +
                "screen=" + screen +
                ", ram='" + ram + '\'' +
                ", hardDrive='" + hardDrive + '\'' +
                ", opticalDrive='" + opticalDrive + '\'' +
                ", keybord='" + keybord + '\'' +
                ", processor=" + processor +
                ", graphicCards=" + graphicCards +
                '}';
    }

    public Processor getProcessor() {
        return processor;
    }

    public float getScreen() {
        return screen;
    }

    public String getRam() {
        return ram;
    }

    public String getHardDrive() {
        return hardDrive;
    }

    public String getOpticalDrive() {
        return opticalDrive;
    }

    public String getKeybord() {
        return keybord;
    }

    public GraphicCards getGraphicCards() {
        return graphicCards;
    }
}
