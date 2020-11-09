package factory.factorykit;

import factory.INBATeam;

import java.util.function.Supplier;

/**
 * 工厂类和业务方的桥接，通过Builder，业务方向工厂提供产品
 *
 * 作为Consumer的参数，暴露给业务方来消费（向工厂提供产品）
 * 通过Supplier接口由业务方自定义产品的实现方式
 * 工厂如何接收产品，交给工厂自己去实现Builder
 */
public interface NBATeamBuilder {

    void addNBATeam(int type, Supplier<INBATeam> team);
}
