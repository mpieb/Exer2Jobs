package exceptions;

public class SueldoVolunteerException extends Exception{

	private static final String VOLUNTEER_EXCEPTION = "Volunteers cannot get paid";
	
	public SueldoVolunteerException() {
		super(VOLUNTEER_EXCEPTION);
	}
}