package security;

public enum StateCamera 
{
	ON
	{

		@Override
		public void setDirection(DirectionCamera direction) 
		{
			this.direction = direction;
			System.out.println("Se cambi� la direcci�n a " + this.direction);
		}
		
	},
	OFF
	{

		@Override
		public void setDirection(DirectionCamera direction)
		{
			System.out.println("No se puede cambiar la direcci�n estando la c�mara apagada.");
		}
		
	};

	protected DirectionCamera direction;
	
	StateCamera()
	{
		// By default, the direction is center.
		direction = DirectionCamera.CENTER;
	}
	
	public DirectionCamera getDirection()
	{
		return direction;
	}
	
	public abstract void setDirection(DirectionCamera direction);
}
