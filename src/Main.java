import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("podaj imie i nazwisko");
        Student student1 = new Student(scanner.next(), scanner.next());

        System.out.println("scientePoints: ");
        student1.learn(LocalDate.of(2023,3,9), LocalDate.of(2023, 3, 10));
        student1.getScientePoints();


        System.out.println("lifePoints: ");
        student1.party(LocalDate.of(2023,3,9), LocalDate.of(2023, 4, 10));
        student1.getLifePoints();


        student1.isGoodStudent();



    }
}