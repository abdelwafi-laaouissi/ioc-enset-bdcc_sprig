package metier;

import dao.IDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

//@Component("metier")
@Service("metiar")
public class MetierImpl implements IMetier {
   // @Autowired
    private IDao dao;

    public MetierImpl(@Qualifier("dao2") IDao dao ) {
        this.dao = dao;
    }

   // public MetierImpl() {    }

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
