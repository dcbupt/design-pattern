package factory.factorykit;

import factory.INBATeam;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Consumer;
import java.util.function.Supplier;

public interface INBATeamFactory {

    INBATeam createNBATeam(int type);

    static INBATeamFactory createFactory(Consumer<NBATeamBuilder> consumer) {
        Map<Integer, Supplier<INBATeam>> map = new HashMap();
        // 调用consumer，执行业务方通过Builder向工厂提供产品的逻辑
        // 工厂自己实现Builder，实现接收产品的方式
        consumer.accept(map::put);
        // lambda表达式作为INBATeamFactory的实现类，返回由业务方完成产品填充后的工厂
        return type -> map.get(type).get();
    }
}
