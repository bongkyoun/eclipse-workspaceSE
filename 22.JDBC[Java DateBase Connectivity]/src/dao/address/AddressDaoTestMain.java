package dao.address;

import java.util.List;

public class AddressDaoTestMain {
	
	public static void main(String[] args) throws Exception{
		AddressDao addressDao = new AddressDao();
		System.out.println("1. insert");
		Address insertAddress = 
				new Address(0, "apple2", "김사과", "333-3333", "서울시");
		//System.out.println(" >> +addressDao.insert(insertAddress))";
		
		System.out.println("2. deleteByNo");
		System.out.println(">>row count : "+addressDao.deleteByNo(3));
		System.out.println("3. updateByNo");
		Address updateAddress = 
				new Address(10, null, "김애플", "123-4567", "캘리포니아");
		System.out.println(" > row count : "+ addressDao.updateByNo(updateAddress));
		System.out.println("4. selectByNo");
		Address findAddress = 
				addressDao.selectByNo(17);
		System.out.println(findAddress);
		System.out.println(addressDao.selectByNo(9));
		System.out.println("5. selectAll");
		List<Address> addressList = 
				addressDao.selectAll();
		System.out.println(addressList);
		
	}
}
