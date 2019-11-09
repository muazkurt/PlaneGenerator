package Industries.Aerospace.Turkish.Abstract_Factory;

public class Domestic_PlaneIngerdientFactory implements PlaneIngredientFactory
{
	@Override
	public SeatingCover getSeatingCover()
	{
		return SeatingCover.Velvet;
	}

	@Override
	public EngineInjectionType getEngineInjectionType()
	{
		return EngineInjectionType.Turbojet;
	}
}
