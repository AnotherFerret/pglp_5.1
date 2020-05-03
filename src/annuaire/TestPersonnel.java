package annuaire;

import static org.junit.Assert.*;

import java.time.LocalDate;
import java.util.HashSet;

import org.junit.Before;
import org.junit.Test;

public class TestPersonnel {

	private Personnel p1;
	private Personnel p2;
	@Before
	public void init()
	{
	LocalDate d = LocalDate.of(1975, 03, 19);
	HashSet<PhoneNumber> t = new HashSet<PhoneNumber>();
	t.add(new PhoneNumber("0123456789"));
	t.add(new PhoneNumber("9876543210"));
	
	
				p1 = new Personnel
				.Builder("name", "name2")
				.build();
	
					p2 = new Personnel
					.Builder("name3", "name4")
					.fonction("random task")
					.datenaissance(d)
					.telephone(t)
					.build();
	}
	
	@Test
	public void BuilderEmptyTest() {
		String test1 = "namename2employé"+LocalDate.now()+"00 00 00 00 00, ";
		assertEquals(p1.ShowValues(), test1);
	}
	
	@Test
	public void BuilderFullTest() {
		String test1 = "name3name4random task1975-03-199876543210, 0123456789, ";
		assertEquals(p2.ShowValues(), test1);
	}

}
