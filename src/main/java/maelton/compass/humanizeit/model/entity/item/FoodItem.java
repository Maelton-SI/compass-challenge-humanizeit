package maelton.compass.humanizeit.model.entity.item;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import maelton.compass.humanizeit.model.enums.FoodType;
import maelton.compass.humanizeit.model.interfaces.AppDTO;

@Entity
@Table(name="tab_food_item")
public class FoodItem extends Item {
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
    }

    @Override
    public AppDTO toDTO() {
        return null;
    }
}
