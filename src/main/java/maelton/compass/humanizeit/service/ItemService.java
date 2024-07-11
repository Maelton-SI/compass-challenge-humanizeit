package maelton.compass.humanizeit.service;

import maelton.compass.humanizeit.exception.AppEntityAlreadyExistsException;
import maelton.compass.humanizeit.model.enums.ClothingType;
import maelton.compass.humanizeit.model.entity.item.ClothingItem;
import maelton.compass.humanizeit.model.entity.item.FoodItem;
import maelton.compass.humanizeit.model.entity.item.PersonalHygieneItem;
import maelton.compass.humanizeit.model.enums.FoodType;
import maelton.compass.humanizeit.model.enums.PersonalHygieneType;
import maelton.compass.humanizeit.model.factory.ItemFactory;
import maelton.compass.humanizeit.repository.ItemRepository;

public class ItemService {
    public static ClothingItem addClothingItem(ClothingType type) throws AppEntityAlreadyExistsException {
        ClothingItem item = ItemFactory.createClothingItem(type);
            ItemRepository.save(item);
        return item;
    }

    public static FoodItem addFoodItem(FoodType type) throws AppEntityAlreadyExistsException {
        FoodItem item = ItemFactory.createFoodItem(type);
            ItemRepository.save(item);
        return item;
    }

    public static PersonalHygieneItem addPersonalHygieneItem(PersonalHygieneType type) throws AppEntityAlreadyExistsException {
        PersonalHygieneItem item = ItemFactory.createPersonalHygieneItem(type);
            ItemRepository.save(item);
        return item;
    }
}
