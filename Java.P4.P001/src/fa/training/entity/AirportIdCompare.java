package fa.training.entity;

import java.util.Comparator;

public class AirportIdCompare implements Comparator<Airports> {

	@Override
	public int compare(Airports o1, Airports o2) {
		return o1.getId().compareToIgnoreCase(o2.getId());
	}

}
