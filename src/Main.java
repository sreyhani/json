import com.google.gson.Gson;
import model.*;
import model.Buff.Buff;
import model.Buff.Kind;
import model.Buff.StunBuff;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Gson gson = new Gson();
        ArrayList<Minion> minions = new ArrayList<Minion>();
        ArrayList<Buff> buffs = new ArrayList<>();
        Minion camandareFars = new Minion(101,"camandareFarse",300,2,4,6,SoldierTypes.RANGED,7,null,null);
        minions.add(camandareFars);
        String json = gson.toJson(minions);
        System.out.println(json);
        buffs.add(new StunBuff(Kind.POSITIVE,1,false));
        Minion shamshirZaneFars = new Minion(102,"shamshir zane fars",400,2,6,4,SoldierTypes.MELEE,0,AbilityCastTime.ON_ATTACK,buffs);
        minions.add(shamshirZaneFars);
    }
}
