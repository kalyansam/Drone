package com.tmv.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class FileUtilities {
	
	public String  getProperties(String value) throws IOException {
		File file = new File("C:\\Users\\t160670\\Downloads\\TMV Details\\TMV_Eclipse\\TMVSample\\resources\\data.properties");
		FileInputStream fi = new FileInputStream(file);
		Properties prop = new Properties();
		prop.load(fi);
		return prop.getProperty(value);
	}

}
