import java.sql.SQLOutput;

public class madnessWithMethods {

    public static void main(String[] args){

        String name=", I am Mario";
        helloThere(name);

        System.out.println(" ");

        int num1=24;
        int num2=45;
        System.out.println(addTwoInts(num1,num2));

    }
    static void helloThere(String aName){
        System.out.println("Hello "+aName);
}
    static int addTwoInts(int num1, int spaghetti){
        return num1+spaghetti;
    }

}


