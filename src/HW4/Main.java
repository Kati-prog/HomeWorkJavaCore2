package HW4;

public class Main {

    public static void main(String[] args) {
        doPhoneBook();
        WordsArray wordsArray = new WordsArray(createArrayWords());
        wordsArray.doArrayWords();
    }

    private static void doPhoneBook() {
        PhoneBook phoneBook = new PhoneBook();
        phoneBook.addElementPhoneBook("Panina","89570049109");
        phoneBook.addElementPhoneBook("Kozlov","89780049110");
        phoneBook.addElementPhoneBook("Panina","89654049111");
        phoneBook.addElementPhoneBook("Art","888888");
        phoneBook.addElementPhoneBook("Art","888888");
        phoneBook.addElementPhoneBook("Art","8  8  8 888     ");

        System.out.println("Panina: " + phoneBook.getPhonesByName("Panina"));
        System.out.println("Kozlov: " + phoneBook.getPhonesByName("Kozlov"));
        System.out.println("Fedorov: " + phoneBook.getPhonesByName("Fedorov"));
    }

    private static String[] createArrayWords() {
        String[] strings = new String[10];
        strings[0] = "Apple";
        strings[1] = "Banana";
        strings[2] = "Kiwi";
        strings[3] = "Melon";
        strings[4] = "Mango";
        strings[5] = "Lime";
        strings[6] = "Kiwi";
        strings[7] = "Banana";
        strings[8] = "Plum";
        strings[9] = "Apple";
        return strings;
    }
}
