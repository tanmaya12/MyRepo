package singleton.full;

import java.io.Serializable;

public class SingletonClass implements Serializable, Cloneable {
	
	private static final long serialVersionUID = 1L;
	private static SingletonClass obj;
	
	private SingletonClass() throws InstantiationError{
		if (obj!=null) {  //overcome reflection api
			throw new InstantiationError("creating object not allowed.");
		}		
	}
	public static SingletonClass getInstance() {		
		synchronized (SingletonClass.class) {
			if (obj==null) {
				try {
					return obj= new SingletonClass();
				}catch(Exception e){
					e.printStackTrace();
				}
			}
		}
		return obj;
	}
	
	protected Object readResolve() //overcome Serializable
	{
		return obj;
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException //overcome Cloneble
	{
		return obj;
	}
	

}
