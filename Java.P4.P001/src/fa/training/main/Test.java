package fa.training.main;

import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import fa.training.entity.*;
import fa.training.services.AirportService;

public class Test {
	private static List<Airports> listNewAirport;
	private static List<Airports> listAirport;
	
	public static void main(String[] args) {
		String status, airportId;
		Scanner sc = new Scanner(System.in);
		AirportService airportService = new AirportService();
		List<Airports> airportById;
		int choise;
		
		do {
			System.out.println("=====================MENU======================");
			System.out.println("1. Input data");
			System.out.println("2. Display list of all airport information(sort by ID)");
			System.out.println("3. Display the status of one airport, selected by airport ID");
			System.out.println("4. Display list of all fixed wing airplanes with its parking airport ID and name");
			System.out.println("5. Display list of all helicopters with its parking airport ID and name");
			System.out.println("6. Delete one airport by id");
			System.out.println("7. Exit");
			System.out.println("Please enter your choise: ");
			choise = sc.nextInt();
			
			switch(choise) {
				case 1:
					if(listNewAirport != null) {
						listNewAirport.clear();
					}
					listNewAirport = airportService.createAirport(sc);
					System.out.println("Input done!");
					
					try {
						if(listNewAirport == null) {
							throw new Exception();
						}
						status = airportService.save(listNewAirport);
						System.out.println("Save: "+status);
					}catch (Exception e) {
						System.out.println("Save fail");
					}
					break;
				case 2:
					if(listAirport != null) {
						listAirport.clear();
					}
					try {
						listAirport = airportService.getAll();
						if(listAirport == null) {
							throw new IOException();
						}
						airportService.Display(listAirport);
					}catch (IOException e) {
						System.out.println("no data");
					}
					
					break;
				case 3:
					System.out.println("=============SEARCH============");
					try {
						System.out.println("Enter Airport id: ");
						String idAirport = sc.next();
						airportById = airportService.getByIdAirport(idAirport);
						
						if(airportById == null) {
							throw new IOException();
						}
						System.out.println("----Airport----");
						for(Airports airport : airportById) {
							System.out.println(airport.getId()+"\t" +airport.getName()+"\t"+
									airport.getRunwaySize()+"\t"+ airport.getListOfFixedwings());
						}
					}catch (IOException e) {
						System.out.println("No data");
					}
					break;
				case 4:
					System.out.println("=============FIXEDWING==============");
					try {
						listAirport = airportService.getFixedwing();
						if(listAirport == null) {
							throw new IOException();
						}
						System.out.println("------------------------");
						for(Airports airport : listAirport) {
							for(Fixedwing fixedwing : airport.getListOfFixedwings()) {
								System.out.println(airport.getId()+"\t"+airport.getName()+"\t"+fixedwing.toString());
							}
						}
					}catch (IOException e) {
						System.out.println("no data");
					}
					break;
				case 5:
					System.out.println("=============HELICOPTER============");
					try {
						listAirport = airportService.getHelicopter();
						if(listAirport == null) {
							throw new IOException();
						}
						System.out.println("------------------------");
						for(Airports airport : listAirport) {
							for(Helicopter helicopter : airport.getListOfHelicopters()) {
								System.out.println(airport.getId()+"\t"+airport.getName()+"\t"+helicopter.toString());
							}
						}
					}catch (IOException e) {
						System.out.println("no data");
					}
					break;
				case 6:
					System.out.println("Enter airport id to delete: ");  
			 		airportId = sc.next();  
	 
			 		try {  
			 			status = airportService.remove(airportId);  
			 			System.out.println("Remove: " + status);  
			 		} catch (Exception e) {  
			 			System.out.println("Remove Fail!");  
			 		}  
					break;
				default:
					System.exit(0);
					break;
			}
		}while(choise!=0);
		
		
	}
}
