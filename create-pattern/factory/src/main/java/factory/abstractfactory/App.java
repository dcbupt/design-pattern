package factory.abstractfactory;

public class App {

    public static void main(String[] args) {
        INBATeamFactory teamFactory = FactoryMaker.createNBATeamFactory(0);
        System.out.println(teamFactory.getNBATeam().getBestPlayer());

        teamFactory = FactoryMaker.createNBATeamFactory(1);
        System.out.println(teamFactory.getNBATeam().getBestPlayer());
    }

}
