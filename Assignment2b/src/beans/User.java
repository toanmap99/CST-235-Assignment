package beans;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

@ManagedBean
@ViewScoped
public class User
{ 
	String firstName = "";
	String lastName = "";
	
	//Default Value inside of the constructor
	public User()
	{
		firstName = "Toan";
		lastName = "Nguyen";
	}
	
	// Setters and getters 
	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	

}
