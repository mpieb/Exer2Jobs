package exceptions;

public class SueldoJuniorException extends Exception{
	
	private static final String JUNIOR_EXCEPTION = "El sou d´un Junior entre 900 i 1600€";
	
	public SueldoJuniorException() {
		super(JUNIOR_EXCEPTION);
	}

}

