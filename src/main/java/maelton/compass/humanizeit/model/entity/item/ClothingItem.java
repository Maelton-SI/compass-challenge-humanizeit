package maelton.compass.humanizeit.model.entity.item;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.persistence.UniqueConstraint;
import jakarta.persistence.Enumerated;
import jakarta.persistence.EnumType;
import jakarta.persistence.Transient;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Column;

import lombok.Getter;

import maelton.compass.humanizeit.model.enums.*;

import maelton.compass.humanizeit.model.interfaces.AppDTO;

@Getter
@Entity
@Table(name="tab_clothing_item",
       uniqueConstraints = {
            @UniqueConstraint(
                    name = "tab_clothing_item_un",
                    columnNames = {"type", "gender", "size", "unit_of_measurement"}
            )
       })
public class ClothingItem extends Item {
    @Transient
    @Enumerated(EnumType.STRING)
    private final ItemCategory CATEGORY = ItemCategory.CLOTHING;

    @Column(name="unit_of_measurement")
    @Enumerated(EnumType.STRING)
    private UnitOfMeasurement unitOfMeasurement;

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
        this.unitOfMeasurement = UnitOfMeasurement.DEFAULT;

        this.category = CATEGORY;
    }

    @Override
    public String toString() {
        return "ID: " + this.id +
                " TYPE: " + this.type +
                " CATEGORY: " + this.CATEGORY;
    }

    @Override
    public AppDTO toDTO() {
        return null;
    }

    @Override
    public ItemCategory getCategory() {
        return this.CATEGORY;
    }
}
