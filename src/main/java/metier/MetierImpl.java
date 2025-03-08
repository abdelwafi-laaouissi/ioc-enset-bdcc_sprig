package metier;

import dao.IDao;

public class MetierImpl implements IMetier {
    private IDao dao;

    public MetierImpl(IDao dao) {
        this.dao = dao;
    }

    public MetierImpl() {
    }

    @Override
    public double Calcul() {
        double t=dao.getData();
        double res=t*15;
        return res;
    }

    public void setDao(IDao dao) {
        this.dao = dao;
    }
}
