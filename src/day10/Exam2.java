package day10;

public class Exam2 {
    public static void main(String[] args) {
        
    }
} // class end
class A{
    A(){System.out.println("[1]A객체생성");}
}
class B extends A{
    B(){System.out.println("[2]B객체생성");}
}
class C extends A{
    C(){System.out.println("[3]C객체생성");}
}
class D extends B{
    D(){System.out.println("[4]D객체생성");}
}
class E extends C{
    E(){System.out.println("[5]E객체생성");}
}