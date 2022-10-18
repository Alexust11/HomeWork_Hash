public enum ListProduct {
    PRODUCT1("мороковь"),
    PRODUCT2("свекла"),
    PRODUCT3("сельд"),
    PRODUCT4("мясо"),
    PRODUCT5("орех"),
    PRODUCT6("лук"),
    PRODUCT7("лимон"),
    PRODUCT8("корейская морковь"),
    PRODUCT9("майонез");
    private String product;

    ListProduct(String product) {
        this.product = product;
    }

    public String getProduct() {
        return product;
    }

    @Override
    public String toString() {
        return   product; }
}
