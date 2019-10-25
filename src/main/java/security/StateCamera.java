package security;

public enum StateCamera 
{
	ON
	{

		@Override
		public boolean setDirection(DirectionCamera direction) 
		{
			this.direction = direction;
			System.out.println("Se cambi� la direcci�n a " + this.direction);
			return true;
		}
		
	},
	OFF
	{

		@Override
		public boolean setDirection(DirectionCamera direction)
		{
			System.out.println("No se puede cambiar la direcci�n estando la c�mara apagada.");
			return false;
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
	
	public abstract boolean setDirection(DirectionCamera direction);
}
