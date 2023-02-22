class Customer{
	private int customer_id = 1111;
	private String customer_name = "Johnson";
	public int number_of_orders = 25;

	public void setCustomer(int cId,String cName,int nOrders){
		customer_id = cId;
		customer_name = cName;
		number_of_orders = nOrders;
	}

	private void getCustomer(){
		System.out.println("CUSTOMER ID      - "+customer_id);
		System.out.println("CUSTOMER NAME    - "+customer_name);
		System.out.println("NUMBER OF ORDERS - "+number_of_orders);
	}
}

class AccessSpecifiers {
	public static void main(String[] args) {
		Customer c = new Customer();
		
		/*c.setCustomer(101,"Shweta",2);*/
		c.getCustomer();
		
	}
}