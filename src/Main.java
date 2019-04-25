import model.*;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Minion> minions = new ArrayList<Minion>();
        Minion camandareFars = new Minion(101,"camandareFarse",300,2,4,6,SoldierTypes.RANGED,7,null);
        minions.add(camandareFars);
    }
}
