package maelton.compass.humanizeit.service;

import maelton.compass.humanizeit.model.enums.ClothingType;
import maelton.compass.humanizeit.model.entity.item.ClothingItem;
import maelton.compass.humanizeit.model.entity.item.FoodItem;
import maelton.compass.humanizeit.model.entity.item.PersonalHygieneItem;
import maelton.compass.humanizeit.model.factory.ItemFactory;
import maelton.compass.humanizeit.repository.ItemRepository;

public class ItemService {
    public static ClothingItem addClothingItem(ClothingType type) {
        ClothingItem item = ItemFactory.createClothingItem(type);
        ItemRepository.save(item);
        return item;
    }

    public static FoodItem addFoodItem() {
        FoodItem item = ItemFactory.createFoodItem();
        ItemRepository.save(item);
        return item;
    }

    public static PersonalHygieneItem addPersonalHygieneItem() {
        PersonalHygieneItem item = ItemFactory.createPersonalHygieneItem();
        ItemRepository.save(item);
        return item;
    }
}
