package maelton.compass.humanizeit.model.entity.item;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.Table;
import maelton.compass.humanizeit.model.enums.PersonalHygieneType;
import maelton.compass.humanizeit.model.interfaces.AppDTO;

@Entity
@Table(name="tab_personal_hygiene_item")
public class PersonalHygieneItem extends Item {
    @Enumerated(EnumType.STRING)
    PersonalHygieneType  type;

    public PersonalHygieneItem() {}
    public PersonalHygieneItem(PersonalHygieneType type) {
        this.type = type;
    }

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
