package com.bridgelabz.fellowshipprogram.oops.Stock;

import java.util.List;

public class CustomerList {
public List<CustomerInfo> CustomerList;

/*public CustomerList(List<CustomerInfo> customerList) {
	
	CustomerList = customerList;
}*/

public List<CustomerInfo> getCustomerList() {
	return CustomerList;
}

public void setCustomerList(List<CustomerInfo> customerList) {
	CustomerList = customerList;
}

}
