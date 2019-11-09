package Industries.Aerospace.Turkish.Abstract_Factory;

public class Eurasia_PlaneIngerdientFactory implements PlaneIngredientFactory
{
	@Override
	public SeatingCover getSeatingCover()
	{
		return SeatingCover.Linen;
	}

	@Override
	public EngineInjectionType getEngineInjectionType()
	{
		return EngineInjectionType.Turbofan;
	}
}
