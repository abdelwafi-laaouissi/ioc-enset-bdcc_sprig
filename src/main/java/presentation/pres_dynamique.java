package presentation;

import dao.IDao;
import metier.IMetier;

import java.io.File;
import java.lang.reflect.Method;
import java.util.Scanner;

public class pres_dynamique {
    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(new File("config.txt"));
            String daoClassName = scanner.nextLine();
            Class cDao =Class.forName(daoClassName);
            IDao dao = (IDao) cDao.getConstructor().newInstance();
            String metierClassName = scanner.nextLine();
            Class cMetier =Class.forName(metierClassName);
            //IMetier metier = (IMetier) cMetier.getConstructor(IDao.class).newInstance(dao);
            IMetier metier = (IMetier) cMetier.getConstructor().newInstance();

            Method setDao = cMetier.getDeclaredMethod("setDao", IDao.class);
            setDao.invoke(metier, dao);

            System.out.println(metier.Calcul());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
