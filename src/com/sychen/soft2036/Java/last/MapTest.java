package soft2036.Java.last;

import java.util.HashMap;
import java.util.Map;

public class MapTest {
    public static void main(String[] args) {
        Map<String,Integer> map=new HashMap<>();
    }
}
interface A{
    int M=100;
    int ee();
}
class B implements A{
    @Override
    public int ee() {
        return M+100;
    }
}
abstract class C{
    abstract void  CC();
    final public void CCC(){

    }
}
