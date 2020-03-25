package inheritance;

public class SubClassTest extends SuperClassTest{

    public SubClassTest(int age){
        super(age);
    }


    public static void main(String args[]){

        SubClassTest Test1=new SubClassTest(24);

        Test1.getAge();
    }

}
