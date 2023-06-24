package Seminar1;

public class Coffee extends HotBeverage{
    public Coffee (String kind, double price, Long id, int temperature, int volume) {
        super(kind, price, id, temperature, volume);
    }

    @Override
    public String toString() {
        return String.format("У кофе: %s, %s, %s, %s, %s", getKind(), getPrice(), getId(), getTemperature(), getVolume());
    }
}
