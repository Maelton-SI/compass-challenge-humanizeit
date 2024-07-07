package maelton.compass.humanizeit.model.entity.item;

import maelton.compass.humanizeit.enums.ClothingGender;
import maelton.compass.humanizeit.enums.ClothingSize;
import maelton.compass.humanizeit.enums.ClothingType;
import maelton.compass.humanizeit.model.interfaces.AppDTO;

public class ClothingItem extends Item {
    private ClothingType type;
    private ClothingGender gender;
    private ClothingSize size;

    @Override
    public AppDTO toDTO() {
        return null;
    }
}
