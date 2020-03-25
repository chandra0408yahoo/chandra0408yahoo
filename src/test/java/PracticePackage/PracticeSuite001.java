package PracticePackage;

public class PracticeSuite001 extends PracticeSuite000 {

public PracticeSuite001(int x){
    super(x);
}
public void method1(){

    System.out.println("this is form child class");
}



    public static void main(String args[]){


        PracticeSuite001 k= new PracticeSuite001(2);
        k.testmethod();
        System.out.println(k.y);
        k.method1();

    }
}
