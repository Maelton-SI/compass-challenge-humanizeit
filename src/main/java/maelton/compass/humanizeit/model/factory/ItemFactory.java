package maelton.compass.humanizeit.model.factory;

import maelton.compass.humanizeit.model.entity.item.ClothingItem;
import maelton.compass.humanizeit.model.entity.item.FoodItem;
import maelton.compass.humanizeit.model.entity.item.Item;
import maelton.compass.humanizeit.model.entity.item.PersonalHygieneItem;
import maelton.compass.humanizeit.enums.ItemCategory;

public class ItemFactory {
    public static Item createDonationItem(ItemCategory donationItemCategory) {
        return switch (donationItemCategory) {
            case CLOTHING -> new ClothingItem();
            case FOOD -> new FoodItem();
            case PERSONAL_HYGIENE -> new PersonalHygieneItem();
            default -> throw new IllegalArgumentException("Invalid donation item category");
        };
    }
}
