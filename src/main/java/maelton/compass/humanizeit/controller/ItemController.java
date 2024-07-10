package maelton.compass.humanizeit.controller;

import maelton.compass.humanizeit.model.enums.ClothingType;
import maelton.compass.humanizeit.model.enums.FoodType;
import maelton.compass.humanizeit.model.enums.PersonalHygieneType;
import maelton.compass.humanizeit.service.ItemService;
import maelton.compass.humanizeit.util.UIUtil;

public class ItemController {
    public static String addClothingItem(ClothingType type) {
        return UIUtil.entitySavedTest(ItemService.addClothingItem(type));
    };

    public static String addFoodItem(FoodType type) {
        return UIUtil.entitySavedTest(ItemService.addFoodItem(type));
    };

    public static String addPersonalHygieneItem(PersonalHygieneType type) {
        return UIUtil.entitySavedTest(ItemService.addPersonalHygieneItem(type));
    };
}
