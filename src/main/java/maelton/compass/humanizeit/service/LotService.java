package maelton.compass.humanizeit.service;

import maelton.compass.humanizeit.entity.Lot;
import maelton.compass.humanizeit.entity.factory.LotFactory;
import maelton.compass.humanizeit.entity.item.ClothingItem;
import maelton.compass.humanizeit.entity.item.FoodItem;
import maelton.compass.humanizeit.entity.item.PersonalHygieneItem;
import maelton.compass.humanizeit.repository.LotRepository;

public abstract class LotService {

    public static Lot<ClothingItem> addClothingLot() {
        Lot<ClothingItem> lot = LotFactory.createClothingLot();
        LotRepository.save(lot);
        return lot;
    }

    public static Lot<FoodItem> addFoodLot() {
        Lot<FoodItem> lot = LotFactory.createFoodLot();
        LotRepository.save(lot);
        return lot;
    }

    public static Lot<PersonalHygieneItem> addPersonalHygieneLot() {
        Lot<PersonalHygieneItem> lot = LotFactory.createPersonalHygieneLot();
        LotRepository.save(lot);
        return lot;
    }
}
