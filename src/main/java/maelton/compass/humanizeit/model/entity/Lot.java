package maelton.compass.humanizeit.model.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import maelton.compass.humanizeit.model.dto.LotDTO;
import maelton.compass.humanizeit.model.entity.item.Item;
import maelton.compass.humanizeit.enums.DonationCenter;
import maelton.compass.humanizeit.enums.LotStatus;
import maelton.compass.humanizeit.model.interfaces.AppEntity;

import java.time.LocalDateTime;

@Entity
@Table(name="tab_lot")
@Getter
@Setter
public class Lot<T extends Item> implements AppEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String category;
    private int quantityOfItems;

    @Enumerated(EnumType.STRING)
    private LotStatus status;

    @Enumerated(EnumType.STRING)
    private DonationCenter manager;
    private LocalDateTime lastTimeEdited;

    protected Lot() {}

    public Lot(Class<T> category, DonationCenter manager) {
        this.name = "default";
        this.category = category.getSimpleName();
        this.quantityOfItems = 0;
        this.status = LotStatus.OPEN;
        this.manager = null;
        this.lastTimeEdited = LocalDateTime.now();
    }

    public Lot(String name, Class<T> category, DonationCenter manager) {
        this.name = name;
        this.category = category.getSimpleName();
        this.quantityOfItems = 0;
        this.status = LotStatus.OPEN;
        this.manager = null;
        this.lastTimeEdited = LocalDateTime.now();
    }

    @Override
    public String toString() {
        return "ID: " + this.id +
               " NAME: " + this.name +
               " CATEGORY: " + this.category;
    }

    @Override
    public LotDTO toDTO() {
        return new LotDTO(this.id, this.category, this.name);
    }
}
