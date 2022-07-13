package test;

public class Apps {
	
	 int OrderId;
	public int getOrderId() {
		return OrderId;
	}

	public void setOrderId(int orderId) {
		OrderId = orderId;
	}

	public String getOrderName() {
		return OrderName;
	}

	public void setOrderName(String orderName) {
		OrderName = orderName;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	 String OrderName;
	 String state;
	
	public Apps(int orderId, String orderName, String state) {
		this.OrderId = orderId;
		this.OrderName = orderName;
		this.state = state;
	}

}
