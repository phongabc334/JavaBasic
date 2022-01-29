package fa.training.entity;

import java.io.Serializable;

import fa.training.utils.InvalidIdException;
import fa.training.utils.Vadilator;

public class Helicopter implements Serializable {
	private String id;
	private String model;
	private double cruiseSpeed;
	private double emptyWeight;
	private double maxWeight;
	private double minRunwaySize;
	private double range;
	private String flyMethod;
	
	public Helicopter() {
		super();
	}
	public Helicopter(String id, String model, double cruiseSpeed, double emptyWeight, double maxWeight,
			double minRunwaySize, double range, String flyMethod) {
		super();
		this.id = id;
		this.model = model;
		this.cruiseSpeed = cruiseSpeed;
		this.emptyWeight = emptyWeight;
		this.maxWeight = maxWeight;
		this.minRunwaySize = minRunwaySize;
		this.range = range;
		this.flyMethod = flyMethod;
	}

	public String getId() {
		return id;
	}
	public void setId(String id) throws InvalidIdException {
		if(Vadilator.isHelicopterId(id)) {
			this.id = id;
		}else {
			throw new InvalidIdException("Id is invalid!");
		}
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public double getCruiseSpeed() {
		return cruiseSpeed;
	}
	public void setCruiseSpeed(double cruiseSpeed) {
		this.cruiseSpeed = cruiseSpeed;
	}
	public double getEmptyWeight() {
		return emptyWeight;
	}
	public void setEmptyWeight(double emptyWeight) {
		this.emptyWeight = emptyWeight;
	}
	public double getMaxWeight() {
		return maxWeight;
	}
	public void setMaxWeight(double maxWeight) {
		this.maxWeight = maxWeight;
	}
	public double getMinRunwaySize() {
		return minRunwaySize;
	}
	public void setMinRunwaySize(double minRunwaySize) {
		this.minRunwaySize = minRunwaySize;
	}
	public String getFlyMethod() {
		return flyMethod;
	}
	public void setFlyMethod(String flyMethod) {
		this.flyMethod = flyMethod;
	}
	public double getRange() {
		return range;
	}

	public void setRange(double range) {
		this.range = range;
	}

	@Override
	public String toString() {
		return "Helicopter [id=" + id + ", model=" + model + ", cruiseSpeed=" + cruiseSpeed + ", emptyWeight="
				+ emptyWeight + ", maxWeight=" + maxWeight + ", minRunwaySize=" + minRunwaySize + ", range=" + range
				+ ", flyMethod=" + flyMethod + "]";
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Helicopter other = (Helicopter) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
	
	
}
