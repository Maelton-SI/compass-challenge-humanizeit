package maelton.compass.humanizeit.model.association;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

import lombok.Setter;

import java.io.Serializable;

@Setter
@Embeddable
public class LotHasItemId implements Serializable {
    @Column(name="lot_id")
    private Long lotId;

    @Column(name="item_id")
    private Long itemId;
}