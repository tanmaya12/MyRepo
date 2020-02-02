package singleton.type;

class Early {
	private static Early obj=new Early();//Early, instance will be created at load time  
	
	private Early()
	{}  
	   
	 public static Early getExample(){  
	  return obj;  
	 }  
	  
	 public void doSomething(){  
	 //write your code  
	 }  

}
