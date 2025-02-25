class Customer {
    String name;
    String type;
    double discount;

    public Customer(String name, String type) {
        this.name = name;
        this.type = type;
        setDiscount();
    }

    private void setDiscount() {
        discount = CustomerType.getEnumByType(type);
    }
}

