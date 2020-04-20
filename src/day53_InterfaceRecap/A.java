package day53_InterfaceRecap;


interface B{
void method1();
}

public interface A extends B {// if both type is same use the extend kewword!!! B is called supertype, A is subtype
                              // A is inhered all from B interface
    void method2();
    void method3();
   //void method1();        //==>you cant see but you still have method(1) abstract method


}

class C implements A {// if both type is different use the implemnets keyword!!!
                    // now we have 3 absract method  overrideeeee
    @Override
    public void method1() {

    }

    @Override
    public void method2() {

    }

    @Override
    public void method3() {

    }
}

class D extends C implements A{

}