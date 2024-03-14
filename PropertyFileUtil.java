package Commonutils;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertyFileUtil {

	public String getDataFromPropertyFile(String key) throws IOException {
		
		
		//Step1:Create the object of FileInputSteram construtor pass the path external of property File
		FileInputStream FIS = new FileInputStream("src\\test\\resources\\LoginCredinitial.properties");
		
		//Step2:Create the object of properties class 
		Properties p = new Properties();
		
		//Step3:You have call a method Called Load(inputstream);
		p.load(FIS);
		
		//Step4: Call a method call getProperty(String key)
         String Value= p.getProperty(key);
		
		return Value;
		

	}

}
