/* Toan Nguyen 	
 * CST-235
 * Jackson Jevon
 * */
package beans;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@ManagedBean
@ViewScoped
public class User
{ 
	// Annotation validation control of the property 
	
	@NotNull(message = "Please enter a First Name. This is REQUIRED!!")
	@Size(min=2, max=20)
	String firstName = "";
	
	@NotNull(message = "Please enter a Last Name. This is REQUIRED!!")
	@Size(min=2, max=20)
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
