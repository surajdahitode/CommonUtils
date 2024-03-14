package Commonutils;

import java.util.Random;

public class JavaUtil {

  public int getRandomNumber() {
	  
	  
	  //Create the object of random 
	  Random   r = new Random();
	  
      int  ran  = r.nextInt(400);
      return ran;

	}

}
