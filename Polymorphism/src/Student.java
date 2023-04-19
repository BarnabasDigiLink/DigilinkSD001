public class Student {
    //declaring variables
    private String name;
    private String surmane;
    private int stNumber;
    private float marks;

    //constructor for student
    public Student(String name, String surname,int stNumber, float marks){
        System.out.println("Constructing a student.");
        //assign instance variables
        this.name = name;
        this.surmane = surname;
        this.stNumber =  stNumber;
        this.marks = marks;
    }

    //checking the student details method
    public void studentCheck(){
        System.out.println("Student checking:" + this.name + " " + this.surmane + " " + this.stNumber + " " + this.marks );
    }
     public String toString(){
        return  name + " " + surmane + " " + stNumber + " " + marks;
     }

    //getters method
    public String getName(){
        return name;
    }
    public String getSurmane(){
        return surmane;
    }
    public int getStNumber(){
        return stNumber;
    }
    public float getMarks(){
        return marks;
    }

    //setters methods
    public void setStNumber(int stNumber){
        this.stNumber = stNumber;
    }
}


