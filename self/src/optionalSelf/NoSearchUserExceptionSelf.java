package optionalSelf;

public class NoSearchUserExceptionSelf extends RuntimeException {

	public NoSearchUserExceptionSelf() {;}
	
	public NoSearchUserExceptionSelf(String message) {
		super(message);
	}
	
}
