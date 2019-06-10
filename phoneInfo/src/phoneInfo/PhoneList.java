package phoneInfo;
import java.util.Iterator;
import java.util.TreeSet;

import org.omg.CORBA.Current;

import java.text.SimpleDateFormat;

public class PhoneList {
	private TreeSet<Phone> setPhone;
	
	PhoneList(){
		setPhone = new TreeSet<Phone>();
	};
	public boolean add(Phone o) {
		if(setPhone.contains(o)) {
			return false;
		}
		else {
			setPhone.add(o);
			return true;
		}
	}
	public TreeSet<Landline> getListLandline(){
		TreeSet<Landline> obj = new TreeSet<Landline>();
		Iterator<Phone> itr = setPhone.iterator();
		while(itr.hasNext()) {
			Phone current = itr.next();
			if(current instanceof Landline) {
				obj.add((Landline)current);
			}
		}
		return obj;
	}
	//Complete Implementation
	public void printFormatted() {
		Iterator<Phone> iterator = setPhone.iterator();
	    SimpleDateFormat formatter = new SimpleDateFormat("MMM dd, yyyy");
	    
	    System.out.println("-----------------------------------------------------------------------------------------------------------------");
	    System.out.printf("|%-12s|%-12s|%-12s       |%10s         |%20s       |%21s|%n","Type", "ID", "Brand", "Price","Date Available","Notes");
        while (iterator.hasNext()) {
        	for(int i = 0; i < setPhone.size(); i++) {
        	    System.out.println("-----------------------------------------------------------------------------------------------------------------");
        		
	        	Phone current = iterator.next();
	        	System.out.printf("|%-12s|", current.getName());
	        	System.out.printf("%-12s|", current.getId());
	        	System.out.printf("%-12s|", current.getBrand());
	        	System.out.printf("%18.2f|", current.getPrice());
	        	
	        	String strDate = formatter.format(current.getDateAvailable());
	        	System.out.printf("%20s|", strDate);
	        	//Notes Section
	        	if(current instanceof Wireless) {
	        		System.out.printf("%21.2f|", ((Wireless) current).getRange());
	        	}
	        	else if(current instanceof IPPhone) {
	        		System.out.printf("%21s|", ((IPPhone) current).getProtocol());
	        	}
	        	else if(current instanceof Smart) {
	        		System.out.printf("%21.2f|", ((Smart) current).getCpuSpeed());
	        	}
	        	System.out.println();
	        }
        }
	}
}
