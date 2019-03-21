import System2.S2Component1;
import System2.S2Component2;
import component.Component1;
import component.Component2;

public class S2Factory implements SystemFactory {

    public Component1 createComponent1() {
        return new S2Component1();
    }

    public Component2 createComponent2() {
        return new S2Component2();
    }
}
