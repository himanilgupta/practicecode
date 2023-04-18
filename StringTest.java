class A {
    static int index = 0;
}
class B extends A {
    public int method(int index){
        index = index;
        return index;
    }
}
class C {
    C() {
        String a = "ABCDEFG";
        String b;
        b = a = a.replace("A","Z");
        System.out.println(a + " - " + b);
    }
}
public class StringTest {
    public static void main(String args[]) {
        B b = new B();
        System.out.println(b.method(10));
    }
}