package maelton.compass.humanizeit.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import maelton.compass.humanizeit.entity.item.Item;
import maelton.compass.humanizeit.enums.DonationCenter;
import maelton.compass.humanizeit.enums.LotStatus;

import java.time.LocalDateTime;

@Entity
@Table(name="tab_lot")
@Getter
@Setter
public class Lot<T extends Item> implements AppEntity{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String category;
    private int quantityOfItems;
    private LotStatus status;
    private DonationCenter manager;
    private LocalDateTime lastTimeEdited;

    protected Lot() {}

    public Lot(Class<T> category) {
        this.name = "default";
        this.category = category.getSimpleName();
        this.quantityOfItems = 0;
        this.status = LotStatus.OPEN;
        this.manager = null;
        this.lastTimeEdited = LocalDateTime.now();
    }

    public Lot(String name, Class<T> category) {
        this.name = name;
        this.category = category.getSimpleName();
        this.quantityOfItems = 0;
        this.status = LotStatus.OPEN;
        this.manager = null;
        this.lastTimeEdited = LocalDateTime.now();
    }

    @Override
    public String toString() {
        return "Lot ID: " + this.id + " Name: " + this.name;
    }
}
