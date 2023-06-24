package Seminar1;

import java.util.ArrayList;
import java.util.List;

public class HotBeverageVending extends Vending {
    
    private final List<HotBeverage> list;

    public HotBeverageVending() {
        list = new ArrayList<>();
    }

    void addProduct(HotBeverage product) {
        list.add(product);
    }

   
    HotBeverage getProduct(String name, int drinkVolume, int drinkTemperature) {
        for (HotBeverage product : list) {
            if (name.equals(product.getKind()) && drinkVolume == product.getVolume() && drinkTemperature == product.getTemperature()) {
                return product;
            }
        }
        return null;
    }
}