

public class Class2 extends Class1 {
    @Override
    public void DoTheThing(){
        System.out.println("Class 2 - do the thing. This method is overridden in this class!");
    }

    public String Concatenate(String one, String two){
        return one + two;
    }
}