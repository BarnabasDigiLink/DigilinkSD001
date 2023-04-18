// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {


    public static void main(String[] args) {
        //object creation
        Test encap = new Test();

        encap.setName("Barnabas");
        encap.setSurname("Moloi");
        encap.setAge(24);
        //output
        System.out.println("Name is: " + encap.getName() +
                "\n" + "Surname is: " + encap.getSurname() +
                "\n" + "Age is: " + encap.getAge() );

        }
    }
