package Seminar1;

public class Tea extends HotBeverage{
    
    public Tea (String kind, double price, Long id, int temperature, int volume) {
        super(kind, price, id, temperature, volume);
    }

    @Override
    public String toString() {
        return String.format("У чая: %s, %s, %s, %s, %s", getKind(), getPrice(), getId(), getTemperature(), getVolume());
    }
}
