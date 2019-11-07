package cameras_management;

public class CameraIdentifier implements AutoIdentifier
{
	
	public boolean canIdentify(Camera camera, String ID)
	{
		if (camera.properties.containID(ID) == true)
			return true;
		else
			return false;
	}
	
	public String identify(Camera camera, String ID)
	{
		return "La c�mara en " + camera.properties.getLocation() + " identific� al ID: " + ID; 
	}
}
