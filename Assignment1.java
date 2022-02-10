import java.io.IOException;

public class Assignment1 {

    public static void main(String[] args) throws IOException {
        System.out.println("Hello world - this is assignment 1 in Java!");
        //Let's declare some classes
        Class1 class1 = new Class1();
        Class2 class2 = new Class2();
        //Now let's do some stuff. The second dothething is overridden.
        class1.DoTheThing();
        class2.DoTheThing();
        //Class1 can add two numbers!
        System.out.println(class1.AddTwoNumbers(2, 4));
        //Class2 can concatenate two strings!
        System.out.println(class2.Concatenate("String 1 - ", "String 2"));
    }
}