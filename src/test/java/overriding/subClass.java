package overriding;

public class subClass extends superClass{

    public subClass(){
        bark();
    }

    @Override
    public void method1() {
        //super.method1();

        System.out.println("this is method 2");

    }

    public void bark(){
        System.out.println("test");
    }

    public static void main(String args[]){

        superClass s1= new superClass();
        superClass s2= new subClass();

        s1.method1();
        ((subClass) s2).bark();
    }



    // look for polymorphism, abstraction and encapsulation at tutorial point java

}
