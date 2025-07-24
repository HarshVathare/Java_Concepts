package Laptop;

import Laptop.component.GraphicsCard;
import Laptop.component.Processor;

public class Laptop {
    private float screen;
    private Processor processor; //is the class
    private String ram;
    private String HardDrve;
    private GraphicsCard graphicsCard; //is the class
    private String OpticalDrve;
    private String Keyboard;

    public Laptop() {
        this.screen = 15.6f;
        this.processor = new Processor();
        this.ram = "16GB";
        this.HardDrve = "2TB";
        this.graphicsCard = new GraphicsCard();
        this.OpticalDrve = "Multi Layer";
        this.Keyboard = "Backlit";
    }

    public Laptop(float screen, Processor processor, String ram, String hardDrve, GraphicsCard graphicsCard, String opticalDrve, String keyboard) {
        this.screen = screen;
        this.processor = processor;
        this.ram = ram;
        this.HardDrve = hardDrve;
        this.graphicsCard = graphicsCard;
        this.OpticalDrve = opticalDrve;
        this.Keyboard = keyboard;
    }

    public float getScreen() {
        return screen;
    }

    public Processor getProcessor() {
        return processor;
    }

    public String getRam() {
        return ram;
    }

    public String getHardDrve() {
        return HardDrve;
    }

    public GraphicsCard getGraphicsCard() {
        return graphicsCard;
    }

    public String getOpticalDrve() {
        return OpticalDrve;
    }

    public String getKeyboard() {
        return Keyboard;
    }

    @Override
    public String toString() {
        return "Laptop{" +
                "screen=" + screen +
                ", processor=" + processor +
                ", ram='" + ram + '\'' +
                ", HardDrve='" + HardDrve + '\'' +
                ", graphicsCard=" + graphicsCard +
                ", OpticalDrve='" + OpticalDrve + '\'' +
                ", Keyboard='" + Keyboard + '\'' +
                '}';
    }
}
