package actions;

import construction_devices.Device;
import construction_devices.TempSensor;

public class TempAction extends ActionDeviceCommand
{
	private int tempTrigger;
	
	
	public TempAction(int tempTrigger, Device tempSensor)
	{
		super(tempSensor);
		this.tempTrigger = tempTrigger;
	}

	@Override
	public void execute()
	{
		((TempSensor) device).setTemperature(tempTrigger);
	}

	@Override
	protected String getImplementedKey() 
	{
		return getPartialKey() + "_" + tempTrigger;
	}
}