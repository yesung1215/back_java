package exceptTask;

public class SpecialCharacterException extends RuntimeException {
	public SpecialCharacterException() {;}
	public SpecialCharacterException(String errorMessage) {
		super(errorMessage);
	}
	
}
