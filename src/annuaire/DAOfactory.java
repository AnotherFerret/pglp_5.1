package annuaire;

import java.sql.Connection;

public class DAOfactory {

	
	public static DAO<Personnel> getPersonnelDAO(Connection connect)
	{
		return new DAOPersonnel(connect);
	}
	

}
