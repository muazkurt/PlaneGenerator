package Industries.Aerospace.Turkish.Abstract_Factory.IngredientFactory;

import Industries.Aerospace.Turkish.Abstract_Factory.EngineInjectionType;
import Industries.Aerospace.Turkish.Abstract_Factory.Market;
import Industries.Aerospace.Turkish.Abstract_Factory.SeatingCover;

/**
 *  An intrface to supply market dependent necessarities of
 *  planes.
 **/
public interface PlaneIngredientFactory
{
	/**
	 * Generates an enum, Market, to give the current market's name.
	 * @return Market name of the ingredient factory.
	 **/
	Market getMarket();
	/**
	 * Generates an enum, Seating Cover, to supply market dependent ones.
	 * @return Seating Cover type of the market
	 **/
	SeatingCover getSeatingCover();


	/**
	 * Generates an enum, Engine Injection Type, to supply market dependent ones.
	 * @return Engine injection type of the market.
	 */
	EngineInjectionType getEngineInjectionType();
}
