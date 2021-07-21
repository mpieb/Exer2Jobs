package exceptions;

public class SueldoMidException extends Exception{
	
	private static final String MID_EXCEPTION = "El sou d´un Mid entre 1800 i 2500€";
	
	public SueldoMidException() {
		super(MID_EXCEPTION);
	}

}

