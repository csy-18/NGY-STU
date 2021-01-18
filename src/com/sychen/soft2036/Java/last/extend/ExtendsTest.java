package soft2036.Java.last.extend;

public class ExtendsTest {
    public static void main(String[] args) {
        B b=new B();
    }

}
class A{
    public String aaa="AAA";
    public void showA(){
        System.out.println("This is A");
    }
}
class B extends A{
    public B() {
        super();
        super.aaa="BBB";
        System.out.println(aaa);
    }
}
