package maelton.compass.humanizeit.model.factory;

import maelton.compass.humanizeit.model.enums.DonationCenter;
import maelton.compass.humanizeit.model.entity.Lot;
import maelton.compass.humanizeit.model.entity.item.ClothingItem;
import maelton.compass.humanizeit.model.entity.item.FoodItem;
import maelton.compass.humanizeit.model.entity.item.PersonalHygieneItem;

public class LotFactory {
    public static Lot<ClothingItem> createClothingLot(DonationCenter manager) {
        return new Lot<ClothingItem>(ClothingItem.class, manager);
    }

    public static Lot<FoodItem> createFoodLot(DonationCenter manager) {
        return new Lot<FoodItem>(FoodItem.class, manager);
    }

    public static Lot<PersonalHygieneItem> createPersonalHygieneLot(DonationCenter manager) {
        return new Lot<PersonalHygieneItem>(PersonalHygieneItem.class, manager);
    }
}
