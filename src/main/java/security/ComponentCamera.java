package security;

import java.util.List;

public interface ComponentCamera 
{
	public void setState(Camera state);
	public void setDirection(DirectionCamera direction);
	// Los gets no tienen sentido. Son para testing.
	public List<ComponentCamera> getSetCamera();
	public PropertiesCamera getProperties();
}
