package factory.abstractfactory;

/**
 * 工厂制造器，可以制造很多工厂类
 * 这里只示例了一类工厂，还可以扩展
 */
public class FactoryMaker {

    public static INBATeamFactory createNBATeamFactory(int type) {
        switch (type) {
            case 0 :
                return new LakersINBATeamFactory();
            case 1 :
                return new BullsINBATeamFactory();
            default :
                // 或者是defaultFactory
                return null;
        }
    }
}
