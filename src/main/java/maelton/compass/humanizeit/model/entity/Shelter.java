package maelton.compass.humanizeit.model.entity;

import maelton.compass.humanizeit.model.interfaces.AppDTO;
import maelton.compass.humanizeit.model.interfaces.AppEntity;

public class Shelter implements AppEntity {
    private Long id;
    private String name;
    private String address;
    private String responsible;
    private String phone;
    private String email;
    private Integer capacity;
    private static final int MAX_CAPACITY_PER_ITEM = 200;

    @Override
    public AppDTO toDTO() {
        return null;
    }
}
