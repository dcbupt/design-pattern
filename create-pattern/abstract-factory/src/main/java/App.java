import component.Component1;
import component.Component2;

public class App {

    private Component1 component1;
    private Component2 component2;

    public void createSystem(SystemFactory systemFactory) {
        setComponent1(systemFactory.createComponent1());
        setComponent2(systemFactory.createComponent2());
    }

    public Component1 getComponent1() {
        return component1;
    }

    public void setComponent1(Component1 component1) {
        this.component1 = component1;
    }

    public Component2 getComponent2() {
        return component2;
    }

    public void setComponent2(Component2 component2) {
        this.component2 = component2;
    }

    public static class FactoryMaker {

        public enum SystemEnum {
            system1, system2
        }

        public static SystemFactory makeFactory(SystemEnum type) {
            switch (type) {
                case system1:
                    return new S1Factory();
                case system2:
                    return new S2Factory();
                default:
                    throw new IllegalArgumentException("KingdomType not supported.");
            }
        }
    }

    public static void main(String[] args) {
        App app = new App();

        app.createSystem(FactoryMaker.makeFactory(FactoryMaker.SystemEnum.system1));
        System.out.println(app.getComponent1().getDescription());
        System.out.println(app.getComponent2().getDescription());

        app.createSystem(FactoryMaker.makeFactory(FactoryMaker.SystemEnum.system2));
        System.out.println(app.getComponent1().getDescription());
        System.out.println(app.getComponent2().getDescription());
    }
}
