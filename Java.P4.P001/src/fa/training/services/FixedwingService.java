package fa.training.services;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

import fa.training.entity.Fixedwing;
import fa.training.utils.InvalidIdException;
import fa.training.utils.Vadilator;

public class FixedwingService {
	public Set<Fixedwing> createFixedwing(Scanner sc, double maxSize, int maxPlace){
		String loop ="";
		String id, model, type, speed, emptyWeight, maxWeight, runwaySize, flyMethod;
		Fixedwing fixedwing;
		boolean addStatus = false;
		int count = 0;
		
		Set<Fixedwing> fixedwings = new HashSet<Fixedwing>();
		do {
			if(count<maxPlace) {
				System.out.println("Do you want continue to input the fixedwing (Y/N)?:");
				loop = sc.next();
			}else {
				loop = "N";
			}
			
			if (loop.charAt(0) != 'Y' && loop.charAt(0) != 'y') {  
				Vadilator.getIds().clear(); 
				break;
			}
			fixedwing = new Fixedwing();
			
			do {
				System.out.println("Enter fixedwing id: ");
				id = sc.next();
				try {
					fixedwing.setId(id);
				}catch (InvalidIdException e) {
					continue;
				}
				break;
			}while(true);
			do {
				System.out.println("Enter model: ");
				model = sc.next();
				fixedwing.setModel(model);
			}while(!Vadilator.isModel(model));
			
			do {
				System.out.println("Enter plane type(VAG/ LGR/ PRV): ");
				type = sc.next();
				fixedwing.setPlaneType(type);
			}while(!Vadilator.isFixedwing(type));
			
			
			System.out.println("Enter cruise speed: ");
			speed = sc.next();
			fixedwing.setCruiseSpeed(Double.parseDouble(speed));
			
			System.out.println("Enter empty weight: ");
			emptyWeight = sc.next();
			fixedwing.setEmptyWeight(Double.parseDouble(emptyWeight));
			
			System.out.println("Enter max weight: ");
			maxWeight = sc.next();
			fixedwing.setMaxWeight(Double.parseDouble(maxWeight));
			
			do {
				System.out.println("Enter  min needed runway size(< airport runway size): ");
				runwaySize = sc.next();
				fixedwing.setMinRunwaySize(Double.parseDouble(runwaySize));
			}while(Double.parseDouble(runwaySize)>maxSize);
			
			System.out.println("Enter fly method: ");
			flyMethod = sc.next();
			fixedwing.setFlyMethod(flyMethod);
			
			
			addStatus = fixedwings.add(fixedwing);
			count++;
			if(!addStatus) {
				System.out.println("Fixedwing existed");
			}
			
		}while(loop.charAt(0) == 'Y' || loop.charAt(0) == 'y');
		return fixedwings;
	}
	
}	
