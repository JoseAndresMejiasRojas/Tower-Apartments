package actions;

public abstract class ActionDevice
{	
	protected StrategyAction strategy;
	
	public abstract void execute();
	
	public String generateKey()
	{
		return strategy.generateKey();
	}
	
}