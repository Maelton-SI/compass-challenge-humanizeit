package maelton.compass.humanizeit.model.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.EnumType;
import jakarta.persistence.Column;
import jakarta.persistence.OneToMany;

import lombok.Getter;
import lombok.Setter;

import maelton.compass.humanizeit.model.association.LotHasItem;
import maelton.compass.humanizeit.model.dto.LotDTO;
import maelton.compass.humanizeit.model.entity.item.Item;
import maelton.compass.humanizeit.model.enums.DonationCenter;
import maelton.compass.humanizeit.model.enums.LotStatus;
import maelton.compass.humanizeit.model.interfaces.AppEntity;

import java.time.LocalDateTime;
import java.util.Set;

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

    @Column(name="last_edited")
    private LocalDateTime lastTimeEdited;

    @OneToMany(mappedBy = "lot")
    private Set<LotHasItem> itemRegistry;

    protected Lot() {}
    public Lot(Class<T> category, DonationCenter manager) {
        this.name = "default";
        this.category = category.getSimpleName();
        this.quantityOfItems = 0;
        this.status = LotStatus.OPEN;
        this.manager = manager;
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
