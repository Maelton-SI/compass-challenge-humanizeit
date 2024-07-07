package maelton.compass.humanizeit.controller;

import maelton.compass.humanizeit.model.dto.LotDTO;
import maelton.compass.humanizeit.service.LotService;

import java.util.List;

public class LotController {

    public static String getAll() {
        List<LotDTO> existingLots = LotService.getExistingLots();
        if(existingLots.isEmpty()) {
            return "No lots found!\n";
        } else {
            StringBuilder lotsRepresentation = new StringBuilder("ALL LOTS\n");
            existingLots.forEach(lot -> lotsRepresentation.append(lot.toString())
                            .append("\n"));
            return lotsRepresentation.toString();
        }
    }

    public static String getOpenLots() {
        List<LotDTO> openLots = LotService.getOpenLots();
        if(openLots.isEmpty()) {
            return "No lots found!\n";
        } else {
            StringBuilder lotsRepresentation = new StringBuilder("OPEN LOTS\n");
            openLots.forEach(lot -> lotsRepresentation.append(lot.toString())
                    .append("\n"));
            return lotsRepresentation.toString();
        }
    }
}
