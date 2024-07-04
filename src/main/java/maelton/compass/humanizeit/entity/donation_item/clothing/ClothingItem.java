package maelton.compass.humanizeit.entity.donation_item.clothing;

import maelton.compass.humanizeit.entity.donation_item.DonationItem;
import maelton.compass.humanizeit.enums.donation_item.clothing.ClothingGender;
import maelton.compass.humanizeit.enums.donation_item.clothing.ClothingSize;
import maelton.compass.humanizeit.enums.donation_item.clothing.ClothingType;

public class ClothingItem extends DonationItem {
    private ClothingType type;
    private ClothingGender gender;
    private ClothingSize size;
}
