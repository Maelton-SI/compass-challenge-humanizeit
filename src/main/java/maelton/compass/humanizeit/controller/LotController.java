package maelton.compass.humanizeit.controller;

import maelton.compass.humanizeit.model.enums.DonationCenter;
import maelton.compass.humanizeit.model.dto.LotDTO;
import maelton.compass.humanizeit.service.LotService;
import maelton.compass.humanizeit.util.UIUtil;

import java.util.List;

public class LotController {

    public static String getAll() {
        List<LotDTO> existingLots = LotService.getExistingLots();
        if(existingLots.isEmpty()) {
            return null;
        } else {
            StringBuilder lotsRepresentation = new StringBuilder("======== ALL EXISTING LOTS ========\n");
            existingLots.forEach(lot -> lotsRepresentation.append(lot.toString())
                            .append("\n"));
            return lotsRepresentation.toString();
        }
    }

    public static String getOpenLots() {
        List<LotDTO> openLots = LotService.getOpenLots();
        if(openLots.isEmpty()) {
            return null;
        } else {
            StringBuilder lotsRepresentation = new StringBuilder("======== OPEN LOTS ========\n");
            openLots.forEach(lot -> lotsRepresentation.append(lot.toString())
                    .append("\n"));
            return lotsRepresentation.toString();
        }
    }

    public static String getOpenLotById(Long id) {
        LotDTO lot = LotService.getOpenLotById(id);
        return lot != null ? lot.toString() : null;
    }

    public static String getLotItemCategory(Long id) {
        return LotService.getLotItemCategory(id);
    }

    public static String addClothingLot(DonationCenter manager) {
        return UIUtil.entitySavedTest(LotService.addClothingLot(manager));
    };

    public static String addFoodLot(DonationCenter manager) {
        return UIUtil.entitySavedTest(LotService.addFoodLot(manager));
    };

    public static String addPersonalHygieneLot(DonationCenter manager) {
        return UIUtil.entitySavedTest(LotService.addPersonalHygieneLot(manager));
    };
}
