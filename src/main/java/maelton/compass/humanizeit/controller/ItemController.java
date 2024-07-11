package maelton.compass.humanizeit.controller;

import maelton.compass.humanizeit.exception.AppEntityAlreadyExistsException;
import maelton.compass.humanizeit.model.enums.ClothingType;
import maelton.compass.humanizeit.model.enums.FoodType;
import maelton.compass.humanizeit.model.enums.PersonalHygieneType;
import maelton.compass.humanizeit.service.ItemService;
import maelton.compass.humanizeit.util.UIUtil;

public class ItemController {
    public static String addClothingItem(ClothingType type) {
        try {
            return UIUtil.entitySaved(ItemService.addClothingItem(type));
        } catch(AppEntityAlreadyExistsException e) {
            return e.getMessage();
        }
    };

    public static String addFoodItem(FoodType type) {
        try {
            return UIUtil.entitySaved(ItemService.addFoodItem(type));
        } catch (AppEntityAlreadyExistsException e) {
            return e.getMessage();
        }
    };

    public static String addPersonalHygieneItem(PersonalHygieneType type) {
        try {
            return UIUtil.entitySaved(ItemService.addPersonalHygieneItem(type));
        } catch (AppEntityAlreadyExistsException e) {
            return e.getMessage();
        }
    };
}
