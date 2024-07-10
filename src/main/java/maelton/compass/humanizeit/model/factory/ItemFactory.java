package maelton.compass.humanizeit.model.factory;

import maelton.compass.humanizeit.enums.*;
import maelton.compass.humanizeit.model.entity.Lot;
import maelton.compass.humanizeit.model.entity.item.ClothingItem;
import maelton.compass.humanizeit.model.entity.item.FoodItem;
import maelton.compass.humanizeit.model.entity.item.Item;
import maelton.compass.humanizeit.model.entity.item.PersonalHygieneItem;

public class ItemFactory {
    public static ClothingItem createClothingItem(ClothingType type) {
        return new ClothingItem(type);
    }

    public static FoodItem createFoodItem() {
        return new FoodItem();
    }

    public static PersonalHygieneItem createPersonalHygieneItem() {
        return new PersonalHygieneItem();
    }
}
