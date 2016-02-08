package com.dhiru.weka;

import java.io.File;

import weka.core.Instances;
import weka.core.converters.ArffSaver;
import weka.core.converters.CSVLoader;

public class CSV2Arff {
	public static void main(String[] args) throws Exception {
		// Load CSV 
		CSVLoader loader = new CSVLoader();
		loader.setSource(new File("file path"));
		Instances data = loader.getDataSet();
		
		// Save ARFF
		ArffSaver arffSaver = new ArffSaver();
		arffSaver.setInstances(data); // set the data set we want to convert
		arffSaver.setFile(new File("file path to saved"));
		arffSaver.writeBatch();
		
	}

}
