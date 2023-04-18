class A {
    void hello() { System.out.println("Hello World"); }
}
class B extends A {
    @Override
    void hello() { System.out.println("Hello 2021"); }
}
public class HelloWorld {
    public static void main(String args[]) {
        B b = new B();
        b.hello();
    }
}