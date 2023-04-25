//overriding
//Male class
class Male {
    //male method
    public void male() {
        System.out.println("I am a male");
    }
}

//Female class
class Female extends Male {
    //female method
    public void male() {
        System.out.println("I am a female");
    }
}

public class Main {
    public static void main(String[] args) {
        Male monna = new Male();
        Male mosadi = new Female();

        //calling the methods
        monna.male();
        mosadi.male();

    }
}