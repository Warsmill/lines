import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        String firstName = "Ivan";
        String middleName = "Ivanovich";
        String lastName = "Ivanov";
        String fullName = lastName + " " + firstName + " " + middleName;
        System.out.println("Ф. И. О. сотрудника — " + fullName + ".");

        String fullNameUpperCase = fullName.toUpperCase();
        System.out.println("Данные Ф. И. О. сотрудника для заполнения отчета — " + fullNameUpperCase + ".");

        fullName = "Иванов Семён Семёнович";
        fullName = fullName.replace("ё","e").replace("Ё","E");
        System.out.println(fullName);
    }
}