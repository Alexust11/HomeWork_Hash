import java.util.Objects;

public class Product {
    private  final String name;// наименование продукта
    private float weight;// вес покупки продукта
    private boolean purchased=false; // куплен товар или нет

    public Product(String name, float weight) {
        this.name = name;
        this.weight = weight;
        if (this.name == null|| this.name.isEmpty()||this.name.isBlank()) {
            throw new NullPointerException("Не корректно указано название продукта");
        }
        if (this.weight<=0) {
            throw new NullPointerException("Не корректно указана масса приобретаемого продукта");
        }


    }
    public void checkPurchased( boolean purchased1 ) {
        purchased=purchased1;
    }
    public String getName() {
        return name;
    }

    public float getWeight() {
        return weight;
    }

    public void isPurchased() {
        if (purchased) {
            System.out.println("Продукт "+getName()+" куплен");
        } else {
            System.out.println("Продукт "+getName()+" не куплен");
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return name.equals(product.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    @Override
    public String toString() {
        return "Продукт {" +
                "название='" + name + '\'' +
                ", вес покупки=" + weight +
                '}';
    }
}
