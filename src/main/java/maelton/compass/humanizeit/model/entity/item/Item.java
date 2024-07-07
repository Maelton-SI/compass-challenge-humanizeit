package maelton.compass.humanizeit.model.entity.item;

import maelton.compass.humanizeit.model.interfaces.AppEntity;
import maelton.compass.humanizeit.enums.ItemCategory;
import maelton.compass.humanizeit.enums.UnitOfMeasurement;

import java.util.Date;

public abstract class Item implements AppEntity {
    private Long id;
    private ItemCategory category;
    private UnitOfMeasurement unitOfMeasurement;
    private Date expirationDate;
}
