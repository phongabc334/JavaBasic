package fa.training.services;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

import fa.training.entity.*;
import fa.training.utils.InvalidIdException;

public class AirportService {
	public static final int EXIT = 3;
	public List<Airports> createAirport(Scanner sc){
		
		String loop ,loop2;
		String id, name, runwaySize, maxFixedwing, maxRoatedwing, maxHelicopter;
		int ch;
		double size =0;
		
		Airports airport;
		Set<Fixedwing> fixedwings = new HashSet<Fixedwing>();
		Set<Helicopter> helicopters = new HashSet<Helicopter>();
		List<Airports> airports = new ArrayList<Airports>();
		FixedwingService fixedwingService = new FixedwingService();
		HelicopterService helicopterService = new HelicopterService();
		
		do {
			airport = new Airports();
			do {
				System.out.println("Enter airport id: ");
				id = sc.next();
				try {
					airport.setId(id);
				}catch (InvalidIdException e) {
					continue;
				}
				break;
			}while(true);
			
			System.out.println("Enter airport name: ");
			name = sc.next();
			airport.setName(name);
			
			System.out.println("Enter runway size: ");
			runwaySize = sc.next();
			airport.setRunwaySize(Double.parseDouble(runwaySize));
			
			System.out.println("Enter max fixed wing parking place: ");
			maxFixedwing = sc.next();
			airport.setMaxRotatedwing(Integer.parseInt(maxFixedwing));
			
			System.out.println("---------Fixedwing------------");
			fixedwings = fixedwingService.createFixedwing(sc,Double.parseDouble(runwaySize), Integer.parseInt(maxFixedwing));
			airport.setListOfFixedwings(fixedwings);
			
			System.out.println("Enter max rotated wing parking place: ");
			maxRoatedwing = sc.next();
			airport.setMaxRotatedwing(Integer.parseInt(maxRoatedwing));
			
			System.out.println("----------Helicopter-----------");
			helicopters = helicopterService.createHelicopter(sc,Integer.parseInt(maxRoatedwing));
			airport.setListOfHelicopters(helicopters);
			airports.add(airport);
	
			System.out.println("Do you want continue to input the airport (Y/N)?:");
			loop = sc.next();
			
		}while(loop.charAt(0) == 'Y' || loop.charAt(0) == 'y');
		return airports;
	}
	
	public String save(List<Airports> airports) throws Exception{
		ObjectOutputStream objectOutputStream = null;
		try {
			objectOutputStream = new ObjectOutputStream(new FileOutputStream("airport.dat"));
			objectOutputStream.writeObject(airports);
		}catch (Exception e) {
			throw new Exception();
		}finally {
			if(objectOutputStream != null) {
				objectOutputStream.close();
			}
		}
		return "SUCCESS";
	}
	
	@SuppressWarnings("unchecked") 
	public List<Airports> getAll( ) throws IOException{
		ObjectInputStream objectInputStream = null;
		List<Airports> airports;
		try {
			objectInputStream = new ObjectInputStream(new FileInputStream("airport.dat"));
			airports = (List<Airports>) objectInputStream.readObject();
		}catch (Exception e) {
			throw new IOException();
		}finally {
			if(objectInputStream != null) {
				objectInputStream.close();
			}
		}
		return airports;
	}
	
	public void Display(List<Airports> airports) {
		Collections.sort(airports, new AirportIdCompare());
		System.out.println("--------------AIRPORT LIST---------------");
		for(Airports airport : airports) {
			System.out.format("%s%10s%10.2f%100s%100s%n",airport.getId(), airport.getName(), airport.getRunwaySize(), airport.getListOfFixedwings(), airport.getListOfHelicopters());
					
		}
	}
	
	public List<Airports> getByIdAirport(String airportID) throws IOException{
		List<Airports> airports = getAll();
		List<Airports> airportsByID = new ArrayList<Airports>();
		
		if(airports !=null) {
			for(Airports airport : airports) {
				if(airportID.equalsIgnoreCase(airport.getId())) {
					airportsByID.add(airport);
				}
			}
		}
		return airportsByID;
	}
	
	public List<Airports> getFixedwing() throws IOException{
		List<Airports> airports = getAll();
		List<Airports> airportsByFixedwing = new ArrayList<Airports>();
		
		if(airports !=null) {
			for(Airports airport : airports) {
				if(airport.getListOfFixedwings()!=null) {
					airportsByFixedwing.add(airport);
				}
			}
		}
		return airportsByFixedwing;
	}
	
	public List<Airports> getHelicopter() throws IOException{
		List<Airports> airports = getAll();
		List<Airports> airportsByHelicopter = new ArrayList<Airports>();
		
		if(airports !=null) {
			for(Airports airport : airports) {
				if(airport.getListOfHelicopters()!=null) {
					airportsByHelicopter.add(airport);
				}
			}
		}
		return airportsByHelicopter;
	}
	
	public String remove(String id) throws Exception {  
		boolean removed = false;  
		
		List<Airports> airports = getAll();  
		if (airports == null) {  
			throw new IOException();  
		}  
		Iterator<Airports> iterator = airports.iterator();  
		while (iterator.hasNext()) {  
			Airports airport = iterator.next();  
			if (id.equalsIgnoreCase(airport.getId())) {  
				iterator.remove();  
				removed = true;  
				break;  
			}  
		}  
		
		if (removed) {  
			try {  
				save(airports);  
			} catch (Exception e) {  
				throw new Exception();  
			}  
		
			return "SUCCESS";  
		}  
		return "FAIL";  
	}
	
	
}

