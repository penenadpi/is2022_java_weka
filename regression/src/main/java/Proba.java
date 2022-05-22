import weka.core.DenseInstance;
import weka.core.Instance;

public class Proba {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EnergyServiceImpl s=new EnergyServiceImpl();
		Energy e1 = new Energy(5, 2.0, 3.0, 4.0, 5.0, 5.0, 6.0, 7.0, 8.0, 0);
		WekaRegression r=new WekaRegression("energy.csv");
		
		int i;
		 //assuming we already have arff loaded in a variable called dataset
		 Instance newInstance  = new DenseInstance(9);
		 for(i = 0 ; i < 9 ; i++)
		 {

		     newInstance.setValue(i , i);
		     //i is the index of attribute
		     //value is the value that you want to set
		 }
		 
		 try {
			//r.predict(newInstance);
			r.predict(r.createFromEnergy(e1));
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.print(e.getMessage());
			e.printStackTrace();
		}
		 //add the new instance to the main dataset at the last position
		 //repeat as necessary		
		
	}

}
