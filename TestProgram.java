import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TestProgram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Library> libraryResources = new ArrayList<>();
        libraryResources.add(new Book("To Kill a MockingBird"));
        libraryResources.add(new Book("The Hunger Games"));
        libraryResources.add(new Book("Catching Fire"));
        libraryResources.add(new Book("Mockingjay"));
        libraryResources.add(new Journal("The Diary of a Young Girl"));
        libraryResources.add(new Journal("The Journals of Sylvia Plath"));
        libraryResources.add(new Journal("The Reagan Diaries"));

        System.out.print("\nStudent name: ");
        String studentName = scanner.nextLine();

        System.out.print("Student ID: ");
        int studentID = scanner.nextInt();

        Student student = new Student(studentName, studentID);

        System.out.println("\nAvailable resources in the library:");
        for (int i = 0; i < libraryResources.size(); i++){
            System.out.println((i + 1) + ". " + libraryResources.get(i).getTitle());
        }

        System.out.print("\nWhat are you borrowing? (Enter number) ");
        int choice = scanner.nextInt();

        Library chosen = libraryResources.get(choice -1);
        student.borrow(chosen);

        System.out.println("\nStudent borrowing: " + studentName + " (" + studentID + ")");
        System.out.println("Borrowed: " + chosen);

        // this is for adding a new resource type
        Library eJournal = new Journal("Journal of Interdisciplinary Perspectives");
        libraryResources.add(eJournal);
        student.borrow(eJournal);

        System.out.println("\nTest adding new resource type" + "\nNewly added: " + eJournal + "\n");
        
        scanner.close();
    }
    
}
