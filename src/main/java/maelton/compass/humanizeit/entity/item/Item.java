package maelton.compass.humanizeit.entity.item;

import maelton.compass.humanizeit.entity.AppEntity;
import maelton.compass.humanizeit.enums.ItemCategory;
import maelton.compass.humanizeit.enums.UnitOfMeasurement;

import java.util.Date;

public abstract class Item implements AppEntity {
    private Long id;
    private ItemCategory category;
    private UnitOfMeasurement unitOfMeasurement;
    private Date expirationDate;
}
