
import java.util.List;

import javax.ejb.Remote;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

@Remote(EnergyService.class)
@Stateless
public class EnergyServiceImpl implements EnergyService {
	
	/*
	@PersistenceContext(name = "EmployeePU")
	private EntityManager em;
	*/
	
public EnergyServiceImpl()
{
	   EntityManagerFactory emf = Persistence
               .createEntityManagerFactory("EnergyPU");
       em = emf.createEntityManager();
}
private EntityManager em;

public void addEnergy(int id, double x1, double x2, double x3, double x4, double x5, double x6, double x7, double x8, double y1) {
		em.getTransaction().begin();
		Energy e1=new Energy(id, x1, x2, x3, x4, x5, x6, x7, x8, 0);
		em.persist(e1);
        em.getTransaction().commit();
		
	}
	public void updateEnergy(int id, double y1) {
		// TODO Auto-generated method stub
	       Energy energy = em.find(Energy.class, id);
	       em.getTransaction().begin();
	       energy.setY1(y1);
	       em.getTransaction().commit();		
	}


	
	
	
	

}
