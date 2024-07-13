package maelton.compass.humanizeit.model.interfaces;

import maelton.compass.humanizeit.model.enums.ItemCategory;

public interface Item extends AppEntity {
    ItemCategory getCategory();
}
