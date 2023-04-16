package custom_exceptions;

public class NotEligibleToVoteException extends Exception
{
	public NotEligibleToVoteException(String message)
	{
		super(message);
	}
}
