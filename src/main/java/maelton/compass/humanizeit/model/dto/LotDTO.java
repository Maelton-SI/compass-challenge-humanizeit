package maelton.compass.humanizeit.model.dto;

import maelton.compass.humanizeit.model.interfaces.AppDTO;

public record LotDTO(Long id, String category, String name) implements AppDTO {
    @Override
    public String toString() {
        return "ID: " + this.id +
                " CATEGORY: " + this.category +
                " NAME: " + this.name;
    }
}
