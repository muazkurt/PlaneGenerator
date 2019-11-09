package Industries.Aerospace.Turkish.Abstract_Factory;

public class Domestic_PlaneStore extends PlaneStore
{
	public Domestic_PlaneStore()
	{
		my_factory = new Domestic_TFXFactory();
	}
}
