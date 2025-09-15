
class mobile_phone {
    String brand;
    String model;
    double price;

    // method to display mobile phone details
    public void displayPhone() {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Price: " + price);
    }

    public static void main(String[] args) {
        mobile_phone phone = new mobile_phone();
        phone.brand = "Samsung";
        phone.model = "Galaxy S24";
        phone.price = 79999;

        phone.displayPhone();
    }
}
