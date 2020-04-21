package day54_Polymorphism;

class  A{
    public void method1(){
        System.out.println("method1");
    }
}

class  B extends A {
    public void method2() {
        System.out.println("method2");
    }
}
//---------ABSTRACT--------
abstract class C {
    public void method3() {
        System.out.println("method3");
    }
}
class D extends C implements E{
    }
//----------INTERFACE------
interface E {

}
abstract class F implements E{
                                             /* B    extend    A
                                            Subclass        Superclass
                                             B           obj      =      new A();
                                     Reference Type     ref-name           Object
                                            */
}

public class Abstract {
    public static void main(String[] args) {

        A obj1= new A();
              obj1.method1(); //-->method1
        B obj2=new B();
              obj2.method2(); //-->method2
              obj2.method1();//-->method1
        A obj3= new B();//==>Polymorphism
               obj3.method1(); //-->method1==> Reference type decides what can be accessible!!
           //  obj3.method2();
     // B obj4=new A(); ==>child class cannot be the reference to parent class object!
//===================Abstract Example=====
     // C obj5=new C(); ==>Abstact class(C) can not referans Type!!
        C obj6=new D(); //==>If we make the abstract class(C) as reference Type, object MUST be creat from sub class(D)!!!
        obj6.method3(); //-->metdod3
//=================Interface===========
              //  E obj7=new E();
              //  D obj7=new E(); We cannot create object from the interface
              //  D obj7=new E() --->E is interface and E CAN NOT  object
             //   E obj7=new C()--> C is abstract class and can not be object! abstraction not concrete
                  E obj7=new D();
                 // F obj8=new E();--> E is interface and can not object
                 //   E obj8=new F();-->F is abstract nad abstract can not object

/*>>>> IS A: inherited/implemented relation between class
               Dog extend Animal
               Pitbull extend Dog

               Dog is An Animal
               Pitbull is a Dog





 */
    }
}
