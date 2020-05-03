package annuaire;

import java.sql.Connection;

public abstract class DAO<T> {
	  protected Connection connect = null;
	   
	  public DAO(Connection connect){
	    this.connect = connect;
	  }
	   
	  public abstract boolean create(T p);
	  public abstract boolean read(int id);
	  public abstract boolean delete(T p);
	  public abstract boolean update(T p);
	}