package Laptop.component;

public class Processor {
    private String brand;
    private String series;
    private int Genrations;
    private int Cores;
    private int Threts;
    private String cachememory;
    private String Friqency;
    private String MinFriqency;
    private String MaxFriqency;

    //These are default value of processor
    public Processor(){
        this.brand = "Intel";
        this.series = "11000u";
        this.Genrations = 11;
        this.Cores = 4;
        this.Threts = 4;
        this.cachememory = "5MB";
        this.Friqency = "2.5GHZ";
        this.MinFriqency = "2.4GHZ";
        this.MaxFriqency = "3.4GHZ";
    }

    public Processor(String brand, String series, int genrations, int cores, int threts, String cachememory, String friqency, String minFriqency, String maxFriqency) {
        this.brand = brand;
        this.series = series;
        this.Genrations = genrations;
        this.Cores = cores;
        this.Threts = threts;
        this.cachememory = cachememory;
        this.Friqency = friqency;
        this.MinFriqency = minFriqency;
        this.MaxFriqency = maxFriqency;
    }

    public String getBrand() {
        return brand;
    }

    public String getSeries() {
        return series;
    }

    public int getGenrations() {
        return Genrations;
    }

    public int getCores() {
        return Cores;
    }

    public int getThrets() {
        return Threts;
    }

    public String getCachememory() {
        return cachememory;
    }

    public String getFriqency() {
        return Friqency;
    }

    public String getMinFriqency() {
        return MinFriqency;
    }

    public String getMaxFriqency() {
        return MaxFriqency;
    }

    @Override
    public String toString() {
        return "Processor{" +
                "brand='" + brand + '\'' +
                ", series='" + series + '\'' +
                ", Genrations=" + Genrations +
                ", Cores=" + Cores +
                ", Threts=" + Threts +
                ", cachememory='" + cachememory + '\'' +
                ", Friqency='" + Friqency + '\'' +
                ", MinFriqency='" + MinFriqency + '\'' +
                ", MaxFriqency='" + MaxFriqency + '\'' +
                '}';
    }
}
