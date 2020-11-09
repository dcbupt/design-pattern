package factory.factorykit;

import factory.BULLS;
import factory.LAKERS;

public class App {

    public static void main(String[] args) {
        INBATeamFactory factory = INBATeamFactory.createFactory(nbaTeamBuilder -> {
            nbaTeamBuilder.addNBATeam(0, LAKERS::new);
            nbaTeamBuilder.addNBATeam(1, BULLS::new);
        });
        System.out.println(factory.createNBATeam(0).getBestPlayer());
        System.out.println(factory.createNBATeam(1).getBestPlayer());
    }

}
