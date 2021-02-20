package business;

import java.util.List;

import javax.ejb.Local;

import beans.Order;
import beans.Orders;

@Local
public interface OrdersBusinessInterface 
{
	//Add public void test()
	public void test();
	public List<Order> getOrders();
	public void setOrders(List<Order> orders); 
}
