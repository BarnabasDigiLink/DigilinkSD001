import java.util.AbstractMap;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        //populating args
        Student a = new Student("Barnabas", "Moloi", 176404160, 20.0f);
        Marks b = new Marks("Grace", "Farell", 1865046, 50.5f, 1);
        //getting results
        a.studentCheck();
        b.studentCheck();
    }
}