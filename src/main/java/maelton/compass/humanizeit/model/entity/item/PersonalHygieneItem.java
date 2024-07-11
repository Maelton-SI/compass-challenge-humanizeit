package maelton.compass.humanizeit.model.entity.item;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.Table;
import jakarta.persistence.UniqueConstraint;

import maelton.compass.humanizeit.model.enums.ItemCategory;
import maelton.compass.humanizeit.model.enums.PersonalHygieneType;
import maelton.compass.humanizeit.model.interfaces.AppDTO;

@Entity
@Table(name="tab_personal_hygiene_item",
        uniqueConstraints = {
                @UniqueConstraint(
                        name = "tab_personal_hygiene_item_un",
                        columnNames = "type"
                )
        })
public class PersonalHygieneItem extends Item {
    @Enumerated(EnumType.STRING)
    PersonalHygieneType  type;

    public PersonalHygieneItem() {}
    public PersonalHygieneItem(PersonalHygieneType type) {
        this.type = type;

        this.category = ItemCategory.PERSONAL_HYGIENE;
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
