package maelton.compass.humanizeit.entity.donation_item;

import maelton.compass.humanizeit.enums.donation_item.ItemCategory;
import maelton.compass.humanizeit.enums.donation_item.UnitOfMeasurement;

import java.util.Date;

public class DonationItem {
    private Long id;
    private ItemCategory category;
    private UnitOfMeasurement unitOfMeasurement;
    private Date expirationDate;
    //DonationLot 1 <----> n DonationItem
    private Long donationLotId;
}
