package annuaire;


public class DAOPersonnel extends DAO<Personnel> {
	
	private static final long serialVersionUID = 9116647166855351702L;

	public DAOPersonnel()
	{
		super();
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
