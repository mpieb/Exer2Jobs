package exceptions;

public class SueldoBossException extends Exception{
	
	private static final String BOSS_EXCEPTION = "El sou del Boss per sobre de 8000€";
	
	public SueldoBossException() {
		super(BOSS_EXCEPTION);
	}

}

