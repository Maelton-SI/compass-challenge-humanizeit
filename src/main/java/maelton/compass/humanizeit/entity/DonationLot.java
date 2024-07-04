package maelton.compass.humanizeit.entity;

import maelton.compass.humanizeit.enums.DonationCenter;
import maelton.compass.humanizeit.enums.DonationLotStatus;
import maelton.compass.humanizeit.enums.donation_item.ItemCategory;

import java.time.LocalDateTime;

public class DonationLot<T extends ItemCategory> {
    private Long id;
    private String name;
    private T category;
    private int quantityOfItems;
    private DonationLotStatus status;
    private DonationCenter manager;
    private LocalDateTime lastTimeEdited;
}
