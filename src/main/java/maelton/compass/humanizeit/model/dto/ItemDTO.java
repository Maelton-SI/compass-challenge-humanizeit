package maelton.compass.humanizeit.model.dto;

public record ItemDTO(Long id, String type, String unityOfMeasurement) {
    @Override
    public String toString() {
        return "ID: " + this.id +
                " TYPE: " + this.type +
                " UNITY OF MEASUREMENT: " + this.unityOfMeasurement;
    }
}
