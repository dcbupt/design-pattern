package factory.simplefactory;

import factory.INBATeam;

public class App {
    public static void main(String[] args) {
        INBATeam nbaTeam = NBATeamFactory.getNBATeam(1);
        System.out.println(nbaTeam.getBestPlayer());
    }
}
