package business;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.Local;
import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.enterprise.inject.Alternative;

import beans.Order;

/**
 * Session Bean implementation class AnotherOrdersBusinessService
 */
@Alternative
@Stateless
@Local(OrdersBusinessInterface.class)
@LocalBean
public class AnotherOrdersBusinessService implements OrdersBusinessInterface {

	
	List<Order> orders = new ArrayList<Order>();
    /**
     * Default constructor. 
     */
    public AnotherOrdersBusinessService() {
    	orders.add(new Order("000", "Product 1", (float)1.00,1));
		orders.add(new Order("001", "Product 2", (float)2.00,2));
		orders.add(new Order("002", "Product 3", (float)3.00,3));
		orders.add(new Order("003", "Product 4", (float)4.00,4));
		orders.add(new Order("004", "Product 5", (float)5.00,5));
		orders.add(new Order("005", "Product 6", (float)6.00,6));
    }
    
    @Override
	public List<Order> getOrders() {
    	return orders;
	}

	@Override
	public void setOrders(List<Order> orders) {
		this.orders= orders;
	}

	/**
     * @see OrdersBusinessInterface#test()
     */
    public void test() {
        System.out.println("Hello from the AnotherOrdersBusinessService");
    }

	

}
