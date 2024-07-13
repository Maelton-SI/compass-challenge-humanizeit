package maelton.compass.humanizeit.model.entity.item;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.persistence.UniqueConstraint;
import jakarta.persistence.Enumerated;
import jakarta.persistence.EnumType;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Column;

import lombok.Getter;

import maelton.compass.humanizeit.model.enums.FoodType;
import maelton.compass.humanizeit.model.enums.ItemCategory;
import maelton.compass.humanizeit.model.enums.UnitOfMeasurement;
import maelton.compass.humanizeit.model.interfaces.AppDTO;
import maelton.compass.humanizeit.model.interfaces.Item;

import java.time.LocalDateTime;

@Getter
@Entity
@Table(name="tab_food_item",
       uniqueConstraints = {
            @UniqueConstraint(
                    name = "tab_food_item_un",
                    columnNames = {"type", "unit_of_measurement"}
            )
       })
public class FoodItem implements Item {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Enumerated(EnumType.STRING)
    private final ItemCategory CATEGORY = ItemCategory.FOOD;

    @Enumerated(EnumType.STRING)
    private FoodType type;

    @Column(name="unit_of_measurement")
    @Enumerated(EnumType.STRING)
    private UnitOfMeasurement unitOfMeasurement;

    @Column(name="expiration_date")
    private LocalDateTime expirationDate;

    @Override
    public String toString() {
        return "ID: " + this.id +
                " TYPE: " + this.type +
                " CATEGORY: " + this.CATEGORY;
    }

    public FoodItem(){}
    public FoodItem(FoodType type) {
        this.type = type;
        this.unitOfMeasurement = UnitOfMeasurement.DEFAULT;
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
