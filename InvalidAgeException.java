package exceptions;

public class InvalidAgeException extends RuntimeException {
	InvalidAgeException(String msg)
	{
		super (msg);
	}

}
