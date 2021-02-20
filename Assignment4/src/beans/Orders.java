package beans;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

@ManagedBean
@ViewScoped

public class Orders 
{
	List<Order> orders = new ArrayList<Order>();
	
	public Orders()
	{
		// Initialized with list of products
		
		orders.add(new Order("000", "Product 1", (float)1.00,1));
		orders.add(new Order("001", "Product 2", (float)2.00,2));
		orders.add(new Order("002", "Product 3", (float)3.00,3));
		orders.add(new Order("003", "Product 4", (float)4.00,4));
		orders.add(new Order("004", "Product 5", (float)5.00,5));
		orders.add(new Order("005", "Product 6", (float)6.00,6));
	}

	public List<Order> getOrders() {
		return orders;
	}

	public void setOrders(List<Order> orders) {
		this.orders = orders;
	}
	

}
