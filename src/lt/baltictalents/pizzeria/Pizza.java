package lt.baltictalents.pizzeria;/*
String name;

	public Pizza(String name) 
	{
	
		this.name= name;
	
	}
	
	public String getName() 
	{
		
		return name;
    
	}
	public String toString() {
	        
		return name;
	    
	}
	
}

*/

class Pizza {
    private final String name;

    Pizza(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return name;
    }
}