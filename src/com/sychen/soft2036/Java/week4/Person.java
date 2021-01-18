package soft2036.Java.week4;

/**
 * @ClassName Person
 * @Description TODO
 * @Author msi
 * @Date 2020-10-26
 **/
public abstract class Person implements Fly, Travel {
    @Override
    public int speed() {
        return 0;
    }

    @Override
    public String go(String destination) {
        return null;
    }
}
