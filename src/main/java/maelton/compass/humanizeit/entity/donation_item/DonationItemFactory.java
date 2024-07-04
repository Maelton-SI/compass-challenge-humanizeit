package maelton.compass.humanizeit.entity.donation_item;

import maelton.compass.humanizeit.entity.donation_item.clothing.ClothingItem;
import maelton.compass.humanizeit.entity.donation_item.food.FoodItem;
import maelton.compass.humanizeit.entity.donation_item.personal_hygiene.PersonalHygieneItem;
import maelton.compass.humanizeit.enums.donation_item.ItemCategory;

public class DonationItemFactory {
    public static DonationItem createDonationItem(ItemCategory donationItemCategory) {
        return switch (donationItemCategory) {
            case CLOTHING -> new ClothingItem();
            case FOOD -> new FoodItem();
            case PERSONAL_HYGIENE -> new PersonalHygieneItem();
            default -> throw new IllegalArgumentException("Invalid donation item category");
        };
    }
}
