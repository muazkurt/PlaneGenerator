package Industries.Aerospace.Turkish.Abstract_Factory.IngredientFactory;

import Industries.Aerospace.Turkish.Abstract_Factory.EngineInjectionType;
import Industries.Aerospace.Turkish.Abstract_Factory.Market;
import Industries.Aerospace.Turkish.Abstract_Factory.SeatingCover;

/**
 * A subclass for generate Eurosia Market's special needs.
 **/
public class Eurasia_PlaneIngerdientFactory implements PlaneIngredientFactory
{
	@Override
	public Market getMarket()
	{
		return Market.Eurasia;
	}

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
