package factory.abstractfactory;

import factory.INBATeam;
import factory.BULLS;

public class BullsINBATeamFactory implements INBATeamFactory {

    @Override
    public INBATeam getNBATeam() {
        return new BULLS();
    }
}
