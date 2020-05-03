package annuaire;

import java.time.LocalDate;
import java.util.HashSet;

enum Application {
	ENVIRONNEMENT;
	
	
	
	public static void main(String[] args) {

		LocalDate d = LocalDate.of(1975, 03, 19);
		HashSet<PhoneNumber> t = new HashSet<PhoneNumber>();
		t.add(new PhoneNumber("0123456789"));
		t.add(new PhoneNumber("9876543210"));
		
		
		Personnel p1 = new Personnel
					.Builder("name", "name2")
					.build();
		
		Personnel p2 = new Personnel
						.Builder("name3", "name4")
						.fonction("random task")
						.datenaissance(d)
						.telephone(t)
						.build();
		
		GroupePersonnel gp1 = new GroupePersonnel();
		GroupePersonnel gp2 = new GroupePersonnel();
		GroupePersonnel gpall = new GroupePersonnel();
		
		gp1.AddPersonnel(p1);
		gp1.AddPersonnel(p2);
		
		gp2.AddPersonnel(p1);
		
		gpall.AddPersonnel(gp1);
		gpall.AddPersonnel(gp2);
		
		System.out.println(gpall.ShowValues());
		gp1.ShowValues();
		p1.ShowValues();
	}					
			

}
