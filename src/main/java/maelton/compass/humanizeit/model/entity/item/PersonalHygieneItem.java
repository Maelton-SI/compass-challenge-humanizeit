package maelton.compass.humanizeit.model.entity.item;

import maelton.compass.humanizeit.model.enums.PersonalHygieneType;
import maelton.compass.humanizeit.model.interfaces.AppDTO;

public class PersonalHygieneItem extends Item {
    PersonalHygieneType  type;

    @Override
    public String toString() {
        return "ID: " + this.id +
                " TYPE: " + this.type +
                " CATEGORY: " + this.category;
    }

    @Override
    public AppDTO toDTO() {
        return null;
    }
}
