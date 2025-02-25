public enum CustomerType {
    REGULAR("Regular", 0.05),
    PREMIUM("Premium", 0.1),
    VIP("VIP", 0.2);

    String type;
    double value;

    CustomerType(String type, double v) {
        this.type = type;
        this.value = v;
    }

    public String getType() {
        return type;
    }

    public double getValue() {
        return value;
    }

    public static double getEnumByType(String type) {
        for (CustomerType customerType : CustomerType.values()) {
            if ( customerType.getType().equals(type)) {
                return customerType.getValue();
            }
        }
        return 0.0;
    }
}
