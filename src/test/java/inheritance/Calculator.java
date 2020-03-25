package inheritance;

public class Calculator {

    int z=0;
    public Calculator(){

        System.out.println("This is super class");
    }


    public void add(int a, int b){
        z=a+b;
        System.out.println(z+"super class");
    }


    public void sub(int a, int b){
        z=a-b;
        System.out.println(z);
    }

}
