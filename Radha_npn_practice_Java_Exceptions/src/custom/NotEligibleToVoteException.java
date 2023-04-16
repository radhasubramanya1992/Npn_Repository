package custom;

public class NotEligibleToVoteException extends Exception
{
	public NotEligibleToVoteException(String message)
	{
		super(message);
	}
}
