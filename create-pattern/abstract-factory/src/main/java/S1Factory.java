import System1.S1Component1;
import System1.S1Component2;
import component.Component1;
import component.Component2;

public class S1Factory implements SystemFactory {

    public Component1 createComponent1() {
        return new S1Component1();
    }

    public Component2 createComponent2() {
        return new S1Component2();
    }
}
