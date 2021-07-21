package exceptions;

public class SueldoSeniorException extends Exception{
	
	private static final String SENIOR_EXCEPTION = "El sou d´un senior entre 2700 i 4000€";
	
	public SueldoSeniorException() {
		super(SENIOR_EXCEPTION);
	}

}


