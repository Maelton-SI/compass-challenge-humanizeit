package maelton.compass.humanizeit.model.entity.item;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.Table;
import jakarta.persistence.UniqueConstraint;

import maelton.compass.humanizeit.model.enums.FoodType;
import maelton.compass.humanizeit.model.enums.ItemCategory;
import maelton.compass.humanizeit.model.interfaces.AppDTO;

@Entity
@Table(name="tab_food_item",
       uniqueConstraints = {
            @UniqueConstraint(
                    name = "tab_food_item_un",
                    columnNames = "type"
            )
       })
public class FoodItem extends Item {
    @Enumerated(EnumType.STRING)
    private FoodType type;

    @Override
    public String toString() {
        return "ID: " + this.id +
                " TYPE: " + this.type +
                " CATEGORY: " + this.category;
    }

    public FoodItem() {}
    public FoodItem(FoodType type) {
        this.type = type;

        this.category = ItemCategory.FOOD;
    }

    @Override
    public AppDTO toDTO() {
        return null;
    }
}
