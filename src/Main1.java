class A{
    int x=10;
    A(){
        x+=5;
    }
}
class B extends A{
    B(){
        x+=3;
    }
}


public class Main1 {
    public static void main(String[] args) {
        B b = new B();
        System.out.println(b.x);
    }
}
