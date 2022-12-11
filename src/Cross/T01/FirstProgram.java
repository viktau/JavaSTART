package Cross.T01;

public class FirstProgram {
    public static void main (String[] args){
        SloganAction firstObject = new SloganAction();
        firstObject.printSlogan();
    }
}
class SloganAction {
    void printSlogan(){
        System.out.println("Hello ");
    }
}