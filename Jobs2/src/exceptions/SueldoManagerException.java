package exceptions;

public class SueldoManagerException extends Exception{
	
	private static final String MANAGER_EXCEPTION = "El sou d´un Manager entre 3000 i 5000€";
	
	public SueldoManagerException() {
		super(MANAGER_EXCEPTION);
	}

}


