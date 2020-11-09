package factory.abstractfactory;

import factory.LAKERS;
import factory.INBATeam;

public class LakersINBATeamFactory implements INBATeamFactory {
    @Override
    public INBATeam getNBATeam() {
        return new LAKERS();
    }
}
