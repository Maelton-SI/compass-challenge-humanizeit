package maelton.compass.humanizeit.model.enums;

public enum UnitOfMeasurement {
    KILOGRAM("kg"),
    GRAM("g"),
    LITER("l"),
    MILLILITER("ml"),
    UNIT("unit");

    private final String symbol;
    private final int quantity;

    UnitOfMeasurement(String symbol) {
        this.symbol = symbol;
        this.quantity = 1; // Default to 1 for non-bundle units
    }

    UnitOfMeasurement(String symbol, int quantity) {
        this.symbol = symbol;
        this.quantity = quantity;
    }

    public String getSymbol() {
        return symbol;
    }

    public int getQuantity() {
        return quantity;
    }
}
