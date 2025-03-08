package presentation;

import dao.DaoImpl;
import ext.DaoImplV2;
import metier.MetierImpl;

public class pres_statique {
    public static void main(String[] args) {
        DaoImplV2 dao = new DaoImplV2();
        MetierImpl metier = new MetierImpl();
        metier.setDao(dao);
        System.out.println("Res : "+metier.Calcul());
    }
}
