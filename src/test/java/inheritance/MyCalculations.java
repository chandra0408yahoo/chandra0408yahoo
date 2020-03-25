package inheritance;

public class MyCalculations extends Calculator {

    public MyCalculations(){
        System.out.println("This is sub class");
    }


    public void mul(int a, int b){
        z=a+b;
        System.out.println(z);
    }

    public void add(int a, int b){
        z=a+b;
        System.out.println(z+"sub class");
    }

    public void method(){
        MyCalculations pointer= new MyCalculations();

        pointer.add(10,20);
        super.add(10,20);
    }

    public static void main(String args[]){

        MyCalculations pointer= new MyCalculations();
        pointer.mul(10,20);

    }



}
