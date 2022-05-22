

import weka.classifiers.evaluation.Evaluation;
import weka.classifiers.functions.LinearRegression;
import weka.classifiers.trees.M5P;
import weka.core.DenseInstance;
import weka.core.Instance;
import weka.core.Instances;
import weka.core.converters.CSVLoader;
import weka.filters.Filter;
import weka.filters.unsupervised.attribute.Remove;

import java.io.File;
import java.util.Random;

public class WekaRegression {
	LinearRegression model;
	
	
	public WekaRegression(String dataset_path)
	{
		/*
		 * Load data
		 */
		try {
		CSVLoader loader = new CSVLoader();
		loader.setFieldSeparator(",");
		loader.setSource(new File("energy.csv"));
		Instances data = loader.getDataSet();

		/*
		 * Build regression models
		 */
		// set class index to Y1 (heating load)
		data.setClassIndex(data.numAttributes() - 1);


		// build a regression model
		model = new LinearRegression();
		model.buildClassifier(data);
		System.out.println(model);

		Evaluation eval = new Evaluation(data);

		
		// 10-fold cross-validation
		eval.crossValidateModel(model, data, 10, new Random(1), new String[] {});
		System.out.println(eval.toSummaryString());
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
	}
	
	public void predict(Instance sample) throws Exception {
		
		double class1 = model.classifyInstance(sample);
 
		System.out.println("Energy predict: " + class1);
}	
	
	
	public Instance createFromEnergy(Energy e)
	{
		 Instance energyInstance  = new DenseInstance(8);


		     //energyInstance.setValue(0 , e.getId());
		     energyInstance.setValue(0 , e.getX1());
		     energyInstance.setValue(1 , e.getX2());
		     energyInstance.setValue(2 , e.getX3());
		     energyInstance.setValue(3 , e.getX4());
		     energyInstance.setValue(4 , e.getX5());
		     energyInstance.setValue(5 , e.getX6());
		     energyInstance.setValue(6 , e.getX7());
		     energyInstance.setValue(7 , e.getX8());

		 
		 return energyInstance;
	}
	
	public static void main(String[] args) throws Exception {

		
		WekaRegression predictor=new WekaRegression("energy.csv");


	}

}