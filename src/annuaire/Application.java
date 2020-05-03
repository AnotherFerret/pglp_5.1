package annuaire;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
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
		
		//gp1.AddPersonnel(p1);
		//gp1.AddPersonnel(p2);
		
		//gp2.AddPersonnel(p1);
		
		//gpall.AddPersonnel(gp1);
		//gpall.AddPersonnel(gp2);
		
		//System.out.println(gpall.ShowValues());
		//gp1.ShowValues();
		//p1.ShowValues();
		
		System.out.println("---Serializing---");
		
		File f = new File("tmp");
		try {
			ObjectOutputStream oos =  new ObjectOutputStream(new FileOutputStream(f)) ;
			oos.writeObject(p1);
			oos.writeObject(p2);
			oos.close();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		System.out.println("---Deserializing---");
		
		FileInputStream file;
		try {
			file = new FileInputStream("tmp");
			ObjectInputStream in = new ObjectInputStream(file);
			Personnel p3 = (Personnel)in.readObject();
			Personnel p4 = (Personnel)in.readObject();
			in.close();
			file.close();
			
			System.out.println(p1.ShowValues());
			System.out.println(p2.ShowValues());
			System.out.println(p3.ShowValues());
			System.out.println(p4.ShowValues());
			
		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}					
}
