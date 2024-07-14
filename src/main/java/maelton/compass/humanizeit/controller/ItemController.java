package maelton.compass.humanizeit.controller;

import maelton.compass.humanizeit.model.entity.item.ClothingItem;
import maelton.compass.humanizeit.model.entity.item.FoodItem;
import maelton.compass.humanizeit.model.entity.item.PersonalHygieneItem;
import maelton.compass.humanizeit.model.enums.ClothingType;
import maelton.compass.humanizeit.model.enums.FoodType;
import maelton.compass.humanizeit.model.enums.PersonalHygieneType;
import maelton.compass.humanizeit.service.ItemService;

public class ItemController {
    public static ClothingItem addClothingItem(ClothingType type) {
        return ItemService.addClothingItem(type);
    };

    public static FoodItem addFoodItem(FoodType type) {
        return ItemService.addFoodItem(type);
    };

    public static PersonalHygieneItem addPersonalHygieneItem(PersonalHygieneType type) {
        return ItemService.addPersonalHygieneItem(type);
    };

    public static String getClothingItemById(long id) {
        return ItemService.getClothingItemById(id).toString();
    }

    public static String getFoodItemById(long id) {
        try {
            return ItemService.getFoodItemById(id).toString();
        } catch (NullPointerException e) {
            return null;
        }
    }

    public static String getPersonalHygieneItemById(long id) {
        try {
            return ItemService.getPersonalHygieneItemById(id).toString();
        } catch (NullPointerException e) {
            return null;
        }
    }
}
