package annuaire;

import java.sql.Connection;

public class DAOPersonnel extends DAO<Personnel> {
	
	public DAOPersonnel(Connection connect)
	{
		super(connect);
	}
	
	@Override
	public boolean create(Personnel p)
	{
		return true;
	}
	@Override
	public boolean read(int id)
	{
		return true;
	}
	@Override
	public boolean update(Personnel p)
	{
		return true;
	}
	
	@Override
	public boolean delete(Personnel p)
	{
		return true;
	}
}
