package Lesson_8;

public class Main {
    public static void main(String[] args) {
        String[] arr = {"Book", "Swim", "Pool", "Red", "Taxi",
                "Book", "Class", "Workbook", "Next", "Up", "Down", "Pool"};
        Words.convertArrayToUniqueWords(arr);
        Words.countWords(arr);

        System.out.println("\n" + "Телефонный Справочник: " + "\n");
        PhoneBook phoneBook = new PhoneBook();
        phoneBook.add(295438874, "Ivanov");
        phoneBook.add(296986811, "Ivanov");
        phoneBook.add(296721845, "Karpovich");
        phoneBook.add(296721815, "Mirko");
        phoneBook.add(296721716, "Mirko");
        phoneBook.add(295226227, "Mirko");

        phoneBook.get("Ivanov");
        phoneBook.get("Karpovich");
        phoneBook.get("Mirko");
        phoneBook.get("Petuhov");
    }
}
