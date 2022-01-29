package fa.training.services;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

import fa.training.entity.Helicopter;
import fa.training.utils.InvalidIdException;
import fa.training.utils.Vadilator;

public class HelicopterService {
	public Set<Helicopter> createHelicopter(Scanner sc, int maxPlace){
		String loop ="";
		String id, model, speed, emptyWeight, maxWeight, runwaySize, range, flyMethod;
		Helicopter helicopter;
		int count = 0;
		boolean addStatus = false;
		
		Set<Helicopter> helicopters = new HashSet<Helicopter>();
		do {
			helicopter = new Helicopter();
			if(count<maxPlace) {
				System.out.println("Do you want continue to input the helicopter (Y/N)?:");
				loop = sc.next();
			}else {
				loop = "N";
			}
			
			if (loop.charAt(0) != 'Y' && loop.charAt(0) != 'y') {  
				Vadilator.getIds().clear();  
				break;
			}
			do {
				System.out.println("Enter helicopter id: ");
				id = sc.next();
				try {
					helicopter.setId(id);
				}catch (InvalidIdException e) {
					continue;
				}
				break;
			}while(true);
			
			do {
				System.out.println("Enter model: ");
				model = sc.next();
				helicopter.setModel(model);
			}while(!Vadilator.isModel(model));
			
			System.out.println("Enter cruise speed: ");
			speed = sc.next();
			helicopter.setCruiseSpeed(Double.parseDouble(speed));
			
			System.out.println("Enter empty weight: ");
			emptyWeight = sc.next();
			helicopter.setEmptyWeight(Double.parseDouble(emptyWeight));
			do {
				System.out.println("Enter max takeoff weight(<1.5*emptyWeight): ");
				maxWeight = sc.next();
				helicopter.setMaxWeight(Double.parseDouble(maxWeight));
			}while(Double.parseDouble(maxWeight)>Double.parseDouble(emptyWeight)*1.5);
			
			
			System.out.println("Enter  min needed runway size: ");
			runwaySize = sc.next();
			helicopter.setMinRunwaySize(Double.parseDouble(runwaySize));
			
			System.out.println("Enter range: ");
			range = sc.next();
			helicopter.setRange(Double.parseDouble(range));
			
			System.out.println("Enter fly method: ");
			flyMethod = sc.next();
			helicopter.setFlyMethod(flyMethod);
			
			
			
			addStatus = helicopters.add(helicopter);
			count++;
			if(!addStatus) {
				System.out.println("Fixedwing existed");
			}
			
		}while(loop.charAt(0) == 'Y' || loop.charAt(0) == 'y');
		return helicopters;
	}
}
