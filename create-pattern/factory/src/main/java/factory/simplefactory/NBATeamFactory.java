package factory.simplefactory;

import factory.LAKERS;
import factory.INBATeam;
import factory.BULLS;

public class NBATeamFactory {
    public static INBATeam getNBATeam(int type)
    {
        if (type == 0)
        {
            return new LAKERS();
        }
        else if (type == 1)
        {
            return new BULLS();
        }
        else {

            System.out.println("请输入正确类型！");
            return null;
        }
    }
}
