package umlTest;

public abstract class Customer extends Person {
    public Customer(String name) {
        super(name);
    }

    public abstract void printCustomerName(String Customer);

    @Override
    public String toString() {
        return "Customer{}";
    }
}
