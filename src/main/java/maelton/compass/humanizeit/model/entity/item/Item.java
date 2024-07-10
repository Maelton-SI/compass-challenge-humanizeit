package maelton.compass.humanizeit.model.entity.item;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Inheritance;
import jakarta.persistence.GenerationType;
import jakarta.persistence.InheritanceType;
import jakarta.persistence.Table;

import maelton.compass.humanizeit.model.interfaces.AppEntity;
import maelton.compass.humanizeit.model.enums.ItemCategory;
import maelton.compass.humanizeit.model.enums.UnitOfMeasurement;

import java.util.*;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
@Table(name="tab_item")
public abstract class Item implements AppEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    protected Long id;
    protected ItemCategory category;
    protected UnitOfMeasurement unitOfMeasurement;
    protected Date expirationDate;
}
