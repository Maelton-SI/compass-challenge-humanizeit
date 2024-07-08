package maelton.compass.humanizeit.service;

import maelton.compass.humanizeit.enums.DonationCenter;
import maelton.compass.humanizeit.model.dto.LotDTO;
import maelton.compass.humanizeit.model.entity.Lot;
import maelton.compass.humanizeit.model.entity.item.Item;
import maelton.compass.humanizeit.model.factory.LotFactory;
import maelton.compass.humanizeit.model.entity.item.ClothingItem;
import maelton.compass.humanizeit.model.entity.item.FoodItem;
import maelton.compass.humanizeit.model.entity.item.PersonalHygieneItem;
import maelton.compass.humanizeit.repository.LotRepository;

import java.util.List;
import java.util.stream.Collectors;

public abstract class LotService {

    public static Lot<ClothingItem> addClothingLot(DonationCenter manager) {
        Lot<ClothingItem> lot = LotFactory.createClothingLot(manager);
        LotRepository.save(lot);
        return lot;
    }

    public static Lot<FoodItem> addFoodLot(DonationCenter manager) {
        Lot<FoodItem> lot = LotFactory.createFoodLot(manager);
        LotRepository.save(lot);
        return lot;
    }

    public static Lot<PersonalHygieneItem> addPersonalHygieneLot(DonationCenter manager) {
        Lot<PersonalHygieneItem> lot = LotFactory.createPersonalHygieneLot(manager);
        LotRepository.save(lot);
        return lot;
    }

    public static List<LotDTO> getExistingLots() {
        return LotRepository.findAll()
                            .stream()
                            .map(Lot::toDTO)
                            .collect(Collectors.toList());
    }

    public static List<LotDTO> getOpenLots() {
        return LotRepository.findOpenLots()
                .stream()
                .map(Lot::toDTO)
                .collect(Collectors.toList());
    }

    public static LotDTO getOpenLotById(Long id) {
        Lot<? extends Item> lot = LotRepository.findOpenLotById(id);
        return lot != null ? new LotDTO(lot.getId(), lot.getCategory(), lot.getName()) : null;
    }
}
