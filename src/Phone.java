import java.util.Arrays;

public class Phone {
    private String brand;
    private String model;
    private double price;
    private String phoneUserName;
    private Contact[] contacts;

    public Phone() {
    }


    public Phone(String brand, String model, double price, String phoneUserName, Contact[] contacts) {
        this.brand = brand;
        this.model = model;
        this.price = price;
        this.phoneUserName = phoneUserName;
        this.contacts = contacts;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getPhoneUserName() {
        return phoneUserName;
    }

    public void setPhoneUserName(String phoneUserName) {
        this.phoneUserName = phoneUserName;
    }

    public Contact[] getContacts() {
        return contacts;
    }

    public void setContacts(Contact[] contacts) {
        this.contacts = contacts;
    }

        /* Phone класстын ичинде getContactCount();
            метод болсун, ал метод телефондун колдонучусунун аты жана
           ушул телефондун ичинде канча контакт бар экенин санап кайтарып берет.*/

        public String getContactCount(){
            int result = 0;
            if (contacts != null) {
                result = contacts.length;
            }

            return "Phone User name: " + this.phoneUserName + " count contact: " + result;
        }
        public String toString() {
            return "Phone{" +
                    "brand='" + brand + '\'' +
                    ", model='" + model + '\'' +
                    ", price=" + price +
                    ", phoneUserName='" + phoneUserName + '\'' +
                    ", contacts=" + Arrays.toString(contacts) +
                    '}';

        }
}






