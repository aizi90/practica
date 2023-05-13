public class Main {
    public static void main(String[] args) {




        /*                         3
         * 1. Contact деген класс тузунуз, полелери(contactName, phoneNumber).
         *       2. Phone деген класс тузунуз полелери:
         *        brand, model, price, phonesUserName, contacts[])
         *       (бренд, модель, баасы, телефондун колдонучусунун аты, контакттар[]).
         *       3. Phone класстын ичинде getContactCount();
         *       метод болсун, ал метод телефондун колдонучусунун аты жана
         *       ушул телефондун ичинде канча контакт бар экенин санап кайтарып берет.
         *       4. main ден Contact класстын 4 , Phone класстын объекттерин 2 тузуп,
         *       маанилер мн толтуруп, тиби Phone болгон массив тузуп
         *       телефондорду ошол массивге салыныз.
         *      5. цикл дын жардамы мн массивдин ар бир элементине кайрылып,
         *      жанагы Phone класста тузулгон getContactCount(); чакырып алыныз.
         *  (Объектге маанилерди сеттер жардамы мн бериниз)
         * */

        Contact contact1 = new Contact("Begimay Mamytova",
                "0997997997");
        Contact contact2 = new Contact("Aizat Ysmanova",
                "0777100200");
        Contact contact3 = new Contact("Erjigit Gairatov",
                "0222300400");
        Contact contact4 = new Contact("Kanat Saparbaev",
                "07774000400");

        Contact[] contacts = new Contact[]{contact1, contact2};

        Contact[] contacts2 = new Contact[]{contact3, contact4, contact1, contact2};

        Phone phone1 = new Phone("iphone", "14", 1500,
                "Aijamal", contacts);
        Phone phone2 = new Phone("samsung", "galaxy s20", 1000,
                "Mukhammed", contacts2);

        Phone[] phones = new Phone[]{phone1, phone2};

        for (Phone phone : phones) {

            System.out.println(phone.getContactCount());
            System.out.println("__________________________");

            System.out.println(phone);
            System.out.println("______________________");
        }

        for (Contact contact : contacts) {
            System.out.println(contact.getInfo());
            System.out.println("__________________");
        }
    }
}








            

