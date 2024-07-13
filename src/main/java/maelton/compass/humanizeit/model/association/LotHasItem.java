package maelton.compass.humanizeit.model.association;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.MapsId;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.FetchType;

import lombok.Setter;
import maelton.compass.humanizeit.model.entity.Lot;
import maelton.compass.humanizeit.model.interfaces.Item;

@Setter
@Entity
@Table(name="tab_lot_has_item")
public class LotHasItem {
    @EmbeddedId
    private LotHasItemId id;

    @ManyToOne(fetch = FetchType.LAZY)
    @MapsId("lotId")
    @JoinColumn(name="id_lot")
    private Lot lot;

//    @ManyToOne(fetch = FetchType.LAZY)
//    @MapsId("itemId")
//    @JoinColumn(name="id_item")
//    private <T implements Item> item;
//    private int quantity;
}

