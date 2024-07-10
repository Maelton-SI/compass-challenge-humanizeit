package maelton.compass.humanizeit.model.factory;

import maelton.compass.humanizeit.model.entity.item.ClothingItem;
import maelton.compass.humanizeit.model.entity.item.FoodItem;
import maelton.compass.humanizeit.model.entity.item.PersonalHygieneItem;
import maelton.compass.humanizeit.model.enums.ClothingType;
import maelton.compass.humanizeit.model.enums.FoodType;
import maelton.compass.humanizeit.model.enums.PersonalHygieneType;

public class ItemFactory {
    public static ClothingItem createClothingItem(ClothingType type) {
        return new ClothingItem(type);
    }

    public static FoodItem createFoodItem(FoodType type) {
        return new FoodItem(type);
    }

    public static PersonalHygieneItem createPersonalHygieneItem(PersonalHygieneType type) {
        return new PersonalHygieneItem(type);
    }
}
