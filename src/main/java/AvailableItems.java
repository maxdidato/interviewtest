public enum AvailableItems {
    BOOK(29.49),
    CD(15.99),
    SNACK(0.80),
    PARACETAMOL(0.50),
    BOX_OF_PINS(1.43);

    private double price;

    AvailableItems(double price) {
        this.price = price;
    }
    public double getPrice(){
        return price;
    }
}
