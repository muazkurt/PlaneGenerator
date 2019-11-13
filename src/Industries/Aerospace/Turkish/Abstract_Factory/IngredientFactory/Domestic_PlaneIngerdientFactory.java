package Industries.Aerospace.Turkish.Abstract_Factory.IngredientFactory;

import Industries.Aerospace.Turkish.Abstract_Factory.EngineInjectionType;
import Industries.Aerospace.Turkish.Abstract_Factory.Market;
import Industries.Aerospace.Turkish.Abstract_Factory.SeatingCover;

/**
 * A subclass for generate Domestic Market's special needs.
 **/
public class Domestic_PlaneIngerdientFactory implements PlaneIngredientFactory
{
	@Override
	public Market getMarket()
	{
		return Market.Domestic;
	}

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
