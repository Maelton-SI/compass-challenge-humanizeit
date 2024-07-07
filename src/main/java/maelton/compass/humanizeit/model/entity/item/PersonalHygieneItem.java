package maelton.compass.humanizeit.model.entity.item;

import maelton.compass.humanizeit.enums.PersonalHygieneType;
import maelton.compass.humanizeit.model.interfaces.AppDTO;

public class PersonalHygieneItem extends Item {
    PersonalHygieneType  type;

    @Override
    public AppDTO toDTO() {
        return null;
    }
}
