public class Contact {
    private String ContactName;
    private String phoneNumber;

    public Contact() {

    }
    public Contact(String contactName,String phoneNumber ){
        this.ContactName=contactName;
        this.phoneNumber=phoneNumber;

    }

    public String getContactName(){
        return ContactName;
    }
    public void setContactName(String contactName) {
        this.ContactName = contactName;
    }
    public String getPhoneNumber() {
        return phoneNumber;

    }
    public void setPhoneNumber(String phoneNumber){
        this.phoneNumber=phoneNumber;
    }
    public String getInfo(){
        return String .format("""
               Contact name:%s
               Phone  number:%s
                 """,ContactName,phoneNumber);

    }

    @Override
    public String toString() {
        return "Contact{" +
                "ContactName='" + ContactName + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                '}';
    }
}
