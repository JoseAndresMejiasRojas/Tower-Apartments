package cameras_management;

import java.util.ArrayList;

public abstract class Camera 
{
	protected PropertiesCamera properties;
	
	public Camera()
	{
		// By default, the direction is center.
		properties = new PropertiesCamera();		
	}
	
	public DirectionCamera getDirection()
	{
		return properties.getDirection();
	}
	
	public PropertiesCamera getProperties()
	{
		return this.properties;
	}
	
	public void setProperties(PropertiesCamera properties)
	{
		this.properties = properties;
	}
	
	public abstract void setDirection(DirectionCamera direction);
	
	
	public class PropertiesCamera
	{
		// Aqui podria haber mas propiedades como las personas enfocadas, etc...
		private DirectionCamera direction;
		private LocationCamera location;
		private ArrayList<String> personasIdentificadas;
		
		public PropertiesCamera()
		{
			direction = DirectionCamera.CENTER;
			location = LocationCamera.LIVINGROOM;
			personasIdentificadas = new ArrayList<String>();
		}
		
		public DirectionCamera getDirection()
		{
			return direction;
		}
		
		public void setDirection(DirectionCamera direction)
		{
			this.direction = direction;
		}
		
		public LocationCamera getLocation()
		{
			return this.location;
		}
		
		public void setLocation(LocationCamera location)
		{
			this.location = location;
		}

		public void addID(String ID) 
		{
			personasIdentificadas.add(ID);
		}
		
		public boolean containID(String ID)
		{
			return personasIdentificadas.contains(ID);
		}
		
	}
}