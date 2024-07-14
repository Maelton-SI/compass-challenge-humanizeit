package maelton.compass.humanizeit.model.entity.item;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.persistence.UniqueConstraint;
import jakarta.persistence.Column;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.EnumType;

import lombok.Getter;

import maelton.compass.humanizeit.model.enums.ItemCategory;
import maelton.compass.humanizeit.model.interfaces.AppEntity;

@Getter
@Entity
@Inheritance(strategy = InheritanceType.JOINED)
@Table(name = "tab_item",
       uniqueConstraints =
            @UniqueConstraint(
               name="tab_item_un",
               columnNames = {"id", "item_category"}
            )
)
public abstract class Item implements AppEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    @Column(name = "item_category")
    @Enumerated(EnumType.STRING)
    ItemCategory category;

    public Item(){}
    public Item(ItemCategory itemCategory) {
        this.category = itemCategory;
    }

    public abstract ItemCategory getCategory();
}
