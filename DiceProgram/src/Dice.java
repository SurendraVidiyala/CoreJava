    public class Dice
    {	
    	//Declaration of variables.
    	private int numFaces; 
    	private int upValue;
    	
    	//Declaration of a constructor and Initialization of variables
    	public Dice()
    	{	
    		numFaces = 6;
    		upValue = 1;
    	}
    	//Declaration of Parameterized Constructor and setting values
    	public Dice(int faces)
    	{	
    		numFaces = faces;
    		upValue = 1;
    	}
    	//Declaration and Initialization of setter method roll().
    	public void roll()
     	{	
    		upValue = ((int)(Math.random() * numFaces)) + 1; 
     	}
    	 
    	//Declaration and Initialization of getter method getUPValue() that returns integer type upValue.
    	public int getUpValue() 
    	{	
    		return upValue;	
    	}
    }