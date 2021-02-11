package controllers;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;

import beans.User;

@ManagedBean
@ViewScoped
public class FormController {

	public String onSubmit(User user)
	{
		// Forward to TestResponse.xhtml View along with the User Managed Bean
		FacesContext.getCurrentInstance().getExternalContext().getRequestMap().put("user", user);
		return "TestResponse.xhtml";
	}
	
	public String onFlash(User user)
	{
		// Forward to TestResponse2.xhtml View along with User Managed Bean using Flashscope
		FacesContext.getCurrentInstance().getExternalContext().getFlash().put("user", user);
		return "TestResponse2.xhtml?faces-redirect=true";
	}
	
	public String onReturn()
	{
		// Return back to the JSF Login page or the TestForm page
		return "TestForm.xhtml";
	}
}
