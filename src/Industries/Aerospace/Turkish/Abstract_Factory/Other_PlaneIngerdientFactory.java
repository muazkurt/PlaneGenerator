package Industries.Aerospace.Turkish.Abstract_Factory;

public class Other_PlaneIngerdientFactory implements PlaneIngredientFactory
{
	@Override
	public SeatingCover getSeatingCover()
	{
		return SeatingCover.Leather;
	}

	@Override
	public EngineInjectionType getEngineInjectionType()
	{
		return EngineInjectionType.Geared_Turbofan;
	}
}
