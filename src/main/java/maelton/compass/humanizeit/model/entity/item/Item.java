package maelton.compass.humanizeit.model.entity.item;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Inheritance;
import jakarta.persistence.GenerationType;
import jakarta.persistence.InheritanceType;
import jakarta.persistence.Table;
import jakarta.persistence.Column;
import jakarta.persistence.UniqueConstraint;
import jakarta.persistence.Enumerated;
import jakarta.persistence.EnumType;

import maelton.compass.humanizeit.model.interfaces.AppEntity;
import maelton.compass.humanizeit.model.enums.ItemCategory;
import maelton.compass.humanizeit.model.enums.UnitOfMeasurement;

import java.time.LocalDateTime;


@Entity
@Inheritance(strategy = InheritanceType.JOINED)
@Table(name="tab_item",
       uniqueConstraints = {
            @UniqueConstraint(
                       name="tab_item_un",
                       columnNames = {"item_id", "category", "unit_of_measurement"}
            )
       })
public abstract class Item implements AppEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="item_id")
    protected Long id;

    @Column(name="category")
    @Enumerated(EnumType.STRING)
    protected ItemCategory category;

    @Column(name="unit_of_measurement")
    @Enumerated(EnumType.STRING)
    protected UnitOfMeasurement unitOfMeasurement;

    @Column(name="expiration_date")
    protected LocalDateTime expirationDate;

    public Item(){
        this.unitOfMeasurement = UnitOfMeasurement.DEFAULT;
        this.expirationDate = LocalDateTime.of(2000, 1, 1, 0, 0);
    }
}
