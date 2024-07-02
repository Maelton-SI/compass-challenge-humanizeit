package maelton.compass.humanizeit.enums;

public enum UnitOfMeasurement {
    KILOGRAM("kg"),
    GRAM("g"),
    LITER("l"),
    MILLILITER("ml"),
    UNIT("unit"),
    PACKAGE("package", 10), // Example: 10 units per package
    BOX("box", 12),         // Example: 12 units per box
    BAG("bag", 5000);       // Example: 5000 grams per bag

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
