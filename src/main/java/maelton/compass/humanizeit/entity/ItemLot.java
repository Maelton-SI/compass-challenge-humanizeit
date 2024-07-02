package maelton.compass.humanizeit.entity;

import maelton.compass.humanizeit.entity.items.DonationItem;
import java.util.List;

public class ItemLot<T extends DonationItem> {
    private Long id;
    private List<T> items;
}
