package maelton.compass.humanizeit.entity.factory;

import maelton.compass.humanizeit.entity.Lot;
import maelton.compass.humanizeit.entity.item.ClothingItem;
import maelton.compass.humanizeit.entity.item.FoodItem;
import maelton.compass.humanizeit.entity.item.PersonalHygieneItem;

public class LotFactory {
    public static Lot<ClothingItem> createClothingLot() {
        return new Lot<ClothingItem>(ClothingItem.class);
    }

    public static Lot<FoodItem> createFoodLot() {
        return new Lot<FoodItem>(FoodItem.class);
    }

    public static Lot<PersonalHygieneItem> createPersonalHygieneLot() {
        return new Lot<PersonalHygieneItem>(PersonalHygieneItem.class);
    }
}
