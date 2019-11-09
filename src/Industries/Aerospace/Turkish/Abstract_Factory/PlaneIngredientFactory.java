package Industries.Aerospace.Turkish.Abstract_Factory;

public interface PlaneIngredientFactory
{
	SeatingCover getSeatingCover();
	EngineInjectionType getEngineInjectionType();
}
