import com.google.gson.Gson;
import model.*;
import model.Buff.Buff;
import model.Buff.Kind;
import model.Buff.StunBuff;

import java.lang.reflect.Member;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Gson gson = new Gson();
        ArrayList<Minion> minions = new ArrayList<Minion>();
        ArrayList<Buff> buffs = new ArrayList<>();

        createMinions(minions, buffs);

        String json = gson.toJson(minions);
        System.out.println(json);
    }

    private static void createMinions(ArrayList<Minion> minions, ArrayList<Buff> buffs) {
        Minion camandareFars = new Minion(101,"camandareFarse",300,2,4,6, SoldierTypes.RANGED,7,null,null);
        minions.add(camandareFars);

        buffs.add(new StunBuff(Kind.POSITIVE,1,false));
        Minion shamshirZaneFars = new Minion(102,"shamshir zane fars",400,2,6,4,SoldierTypes.MELEE,0, AbilityCastTime.ON_ATTACK,buffs);
        minions.add(shamshirZaneFars);

        Minion neyzeDareFars = new Minion(103,"neyzedare Farse",500,1,3,5,SoldierTypes.HYBRID,3,null,null);
        minions.add(neyzeDareFars);

        Minion asbSavarFars = new Minion(104,"asbsavare Fars",200,4,6,10,SoldierTypes.MELEE,0,null,null);
        minions.add(asbSavarFars);

//        buffs = new ArrayList<>();
//        Buff buff = new buff()
        Minion pahlavaneFarse = new Minion(105,"pahlavane Fars",600,9,6,24, SoldierTypes.MELEE,0,null,null);
        minions.add(pahlavaneFarse);
//
    }
}
