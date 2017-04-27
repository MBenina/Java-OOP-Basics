package pr01.ClassBox;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;



public class Main 
{
	public static void main(String[] args) throws IOException
	{

	    
	    	Class boxClass = Box.class;
		    Field[] fields = boxClass.getDeclaredFields();
		    System.out.println(Arrays.asList(fields)
		            .stream()
		            .filter(f -> Modifier.isPrivate(f.getModifiers())).count());
		    
		    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		    
	    try
		{		    
	    	double  length = Double.parseDouble(reader.readLine());
	    	double  width = Double.parseDouble(reader.readLine());
	    	double  height = Double.parseDouble(reader.readLine());
	 	    
		 	Box box = new Box(length, width, height);	
		 	
		 	System.out.printf("Surface Area – %.2f\n", 
            		box.calculateSurfaceArea(box.getLength(), box.getWidth(), box.getHight()));
            System.out.printf("Lateral Surface Area – %.2f\n",
            		box.calculateLateralSurfaceArea(box.getLength(), box.getWidth(), box.getHight()));
            System.out.printf("Volume – %.2f\n", box.calculateVolume(box.getLength(), box.getWidth(), box.getHight()));
            
	    }
	    catch(IllegalArgumentException iae)
	    {
	    	System.out.println(iae.getMessage()); 
	    }
	   

        
	}

}
