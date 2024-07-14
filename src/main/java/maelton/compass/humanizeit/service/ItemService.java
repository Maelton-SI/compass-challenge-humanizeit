package maelton.compass.humanizeit.service;

import maelton.compass.humanizeit.model.dto.ItemDTO;
import maelton.compass.humanizeit.model.enums.ClothingType;
import maelton.compass.humanizeit.model.entity.item.ClothingItem;
import maelton.compass.humanizeit.model.entity.item.FoodItem;
import maelton.compass.humanizeit.model.entity.item.PersonalHygieneItem;
import maelton.compass.humanizeit.model.enums.FoodType;
import maelton.compass.humanizeit.model.enums.PersonalHygieneType;
import maelton.compass.humanizeit.model.factory.ItemFactory;
import maelton.compass.humanizeit.repository.ItemRepository;

public class ItemService {
    public static ClothingItem addClothingItem(ClothingType type) {
        ClothingItem item = ItemFactory.createClothingItem(type);
            ClothingItem itemExists = (ClothingItem) ItemRepository.findItem(item);
        return itemExists != null ? itemExists : (ClothingItem) ItemRepository.save(item);
    }

    public static FoodItem addFoodItem(FoodType type) {
        FoodItem item = ItemFactory.createFoodItem(type);
            FoodItem itemExists = (FoodItem) ItemRepository.findItem(item);
        return itemExists != null ? itemExists : (FoodItem) ItemRepository.save(item);
    }

    public static PersonalHygieneItem addPersonalHygieneItem(PersonalHygieneType type) {
        PersonalHygieneItem item = ItemFactory.createPersonalHygieneItem(type);
            PersonalHygieneItem itemExists = (PersonalHygieneItem) ItemRepository.findItem(item);
        return itemExists != null ? itemExists : (PersonalHygieneItem) ItemRepository.save(item);
    }

    public static ItemDTO getClothingItemById(long id) {
        ClothingItem item = ItemRepository.findClothingItemById(id);
        return item != null ? new ItemDTO(item.getId(), item.getType().toString(), item.getUnitOfMeasurement().toString()) : null;
    }

    public static ItemDTO getFoodItemById(long id) {
        FoodItem item = ItemRepository.findFoodItemById(id);
        return item != null ? new ItemDTO(item.getId(), item.getType().toString(), item.getUnitOfMeasurement().toString()) : null;
    }

    public static ItemDTO getPersonalHygieneItemById(long id) {
        PersonalHygieneItem item = ItemRepository.findPersonalHygieneItemById(id);
        return item != null ? new ItemDTO(item.getId(), item.getType().toString(), item.getUnitOfMeasurement().toString()) : null;
    }

}
