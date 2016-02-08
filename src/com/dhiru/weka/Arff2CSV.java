package com.dhiru.weka;

import java.io.File;

import weka.core.Instances;
import weka.core.converters.ArffLoader;
import weka.core.converters.CSVSaver;

public class Arff2CSV {
	public static void main(String[] args) throws Exception {
		
		// Load Arff
		ArffLoader loader = new ArffLoader();
		loader.setSource(new File("C:/Users/dheeru/Desktop/Spring 2016/IE 583/Assignment/credit-g.arff"));
		System.out.println("Conversion started!");
		Instances data = loader.getDataSet(); // get instances object
		// Save CSV
		CSVSaver csvsa = new CSVSaver();
		csvsa.setInstances(data);
		csvsa.setFile(new File("C:/Users/dheeru/Desktop/Spring 2016/IE 583/Assignment/credit-g.csv"));
		csvsa.writeBatch();
		
		System.out.println("Conversion done!");
	}
}
