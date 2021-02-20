package controllers;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;
import javax.inject.Inject;

import beans.User;
import business.MyTimerService;
import business.OrdersBusinessInterface;

@ManagedBean
@ViewScoped
public class FormController {
	
	@Inject
	OrdersBusinessInterface service;
	
	@EJB
	MyTimerService timer;
	
		
	public String onSubmit(User user)
	{
		// Call Business Service (for testing and demo CDI)
		service.test();
		
		//Call Timer Service (for testing Programmatic Timer)
		timer.setTimer(10000);
		
		// Forward to TestResponse.xhtml View along with the User Managed Bean
		FacesContext.getCurrentInstance().getExternalContext().getRequestMap().put("user", user);
		return "TestResponse.xhtml";
	}
	
	public String onFlash(User user)
	{
		// Call Business Service (for testing and demo CDI)
		service.test();
				
		// Forward to TestResponse2.xhtml View along with User Managed Bean using Flashscope
		FacesContext.getCurrentInstance().getExternalContext().getFlash().put("user", user);
		return "TestResponse2.xhtml?faces-redirect=true";
	}
	
	public String onReturn()
	{
		// Return back to the JSF Login page or the TestForm page
		return "TestForm.xhtml";
	}
	
	public OrdersBusinessInterface getService()
	{
		return service;
	}
}
