package construction_devices;

import management.MediatorApartment;

public class MovementSensor extends Device
{
	public MovementSensor(MediatorApartment mediator) 
	{
		super(mediator);
	}


	private boolean motion;
	
	
	public boolean getMotion()
	{
		return motion;
	}
	
	
	public void detectMotion()
	{
		motion = true;
	}
}
