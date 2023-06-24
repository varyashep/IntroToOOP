package Seminar1;

public abstract class HotBeverage extends Product{

    private int temperature;
    private int volume;
    
    public HotBeverage(String kind, double price, Long id, int temperature, int volume) {
        super(kind, price, id);
        this.temperature = temperature;
        this.volume = volume;
    }


    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int degree) {
        this.temperature = degree;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int size) {
        this.volume = size;
    }
}
