package maelton.compass.humanizeit.model.entity.item;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.Table;
import jakarta.persistence.UniqueConstraint;

import maelton.compass.humanizeit.model.enums.*;
import maelton.compass.humanizeit.model.interfaces.AppDTO;

import java.time.LocalDateTime;

@Entity
@Table(name="tab_clothing_item",
       uniqueConstraints = {
            @UniqueConstraint(
                    name = "tab_clothing_item_un",
                    columnNames = {"type", "gender", "size"}
            )
       })
public class ClothingItem extends Item {
    @Enumerated(EnumType.STRING)
    private ClothingType type;

    @Enumerated(EnumType.STRING)
    private ClothingGender gender;

    @Enumerated(EnumType.STRING)
    private ClothingSize size;

    public ClothingItem() {}
    public ClothingItem(ClothingType type) {
        this.type = type;
        this.gender = ClothingGender.DEFAULT;
        this.size = ClothingSize.DEFAULT;

        this.category = ItemCategory.CLOTHING;
    }

    //TO BE USED IN THE FUTURE
    public ClothingItem(ClothingType type, ClothingGender gender, ClothingSize size) {
        this.type = type;
        this.gender = gender;
        this.size = size;
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
