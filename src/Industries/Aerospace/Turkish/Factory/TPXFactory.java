package Industries.Aerospace.Turkish.Factory;

import Industries.Aerospace.Turkish.Model;

public class TPXFactory
{
	Plane createPlane(Model type) throws Error
	{
		Plane return_val;
		switch (type)
		{
			case TPX100:
				return_val = new TPX100();
				break;
			case TPX200:
				return_val = new TPX200();
				break;
			case TPX300:
				return_val = new TPX300();
				break;
			default:
				throw new Error("Unknown plane type");
		}
		return_val.constructSkeleton();
		return_val.placeEngines();
		return_val.placeSeats();
		return return_val;
	}
}
