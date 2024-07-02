package maelton.compass.humanizeit.entity;

public class Shelter {
    private Long id;
    private String name;
    private String address;
    private String responsible;
    private String phone;
    private String email;
    private Integer capacity;
    private static final int MAX_CAPACITY_PER_ITEM = 200;
}
