package maelton.compass.humanizeit.model.entity.database;

import jakarta.persistence.*;
import maelton.compass.humanizeit.model.entity.Lot;
import maelton.compass.humanizeit.model.entity.item.Item;

import java.io.Serializable;

@Entity
@Table(name="tab_lot_has_item")
public class LotHasItem {
    @EmbeddedId
    private LotHasItemId id;

    @ManyToOne(fetch = FetchType.LAZY)
    @MapsId("lotId")
    @JoinColumn(name="id_lot")
    private Lot lot;

    @ManyToOne(fetch = FetchType.LAZY)
    @MapsId("itemId")
    @JoinColumn(name="id_item")
    private Item item;
    private int quantity;
}

@Embeddable
class LotHasItemId implements Serializable {
    @Column(name="lot_id")
    private Long lotId;

    @Column(name="item_id")
    private Long itemId;
}

