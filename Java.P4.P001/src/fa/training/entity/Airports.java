package fa.training.entity;

import java.io.Serializable;
import java.util.List;
import java.util.Set;

import fa.training.utils.InvalidIdException;
import fa.training.utils.Vadilator;

public class Airports implements Serializable{
	private String id;
	private String name;
	private double runwaySize;
	private int maxFixwing;
	private Set<Fixedwing> listOfFixedwings;
	private int maxRotatedwing;
	private Set<Helicopter> listOfHelicopters;
	
	public Airports() {
		super();
	}
	public Airports(String id, String name, double runwaySize, int maxFixwing, Set<Fixedwing> listOfFixedwings,
			int maxRotatedwing, Set<Helicopter> listOfHelicopters) {
		super();
		this.id = id;
		this.name = name;
		this.runwaySize = runwaySize;
		this.maxFixwing = maxFixwing;
		this.listOfFixedwings = listOfFixedwings;
		this.maxRotatedwing = maxRotatedwing;
		this.listOfHelicopters = listOfHelicopters;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) throws InvalidIdException{
		if((Vadilator.isAirportId(id)) && (Vadilator.isExistsed(id))) {
			this.id = id;
		}else {
			throw new InvalidIdException("Id is invalid!");
		}
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getRunwaySize() {
		return runwaySize;
	}
	public void setRunwaySize(double runwaySize) {
		this.runwaySize = runwaySize;
	}
	public int getMaxFixwing() {
		return maxFixwing;
	}
	public void setMaxFixwing(int maxFixwing) {
		this.maxFixwing = maxFixwing;
	}
	public Set<Fixedwing> getListOfFixedwings() {
		return listOfFixedwings;
	}
	public void setListOfFixedwings(Set<Fixedwing> listOfFixedwings) {
		this.listOfFixedwings = listOfFixedwings;
	}
	public int getMaxRotatedwing() {
		return maxRotatedwing;
	}
	public void setMaxRotatedwing(int maxRotatedwing) {
		this.maxRotatedwing = maxRotatedwing;
	}
	public Set<Helicopter> getListOfHelicopters() {
		return listOfHelicopters;
	}
	public void setListOfHelicopters(Set<Helicopter> listOfHelicopters) {
		this.listOfHelicopters = listOfHelicopters;
	}
	
	
}
