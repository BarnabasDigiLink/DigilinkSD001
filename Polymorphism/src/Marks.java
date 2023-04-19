public class Marks extends Student{
    //declaring a variable
    private int grade;
    //constructor for marks
    public Marks(String name, String surname, int stNumber, float marks, int grade) {
        super(name, surname, stNumber, marks);

    }
    //student checking
    public void studentCheck(){
        System.out.println("Within studentCheck of the grade marks class");
        System.out.println("Marks checking to:" + getName() + " with " + grade);
    }
    //getters and setters for grade
    public int getGrade(){
        return grade;
    }

    public void setGrade(int newGrade){
        if( newGrade >= 0 ) {
            this.grade = newGrade;
            }
        }
}
