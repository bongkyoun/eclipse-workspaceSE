package dao.address.third;

import java.sql.SQLIntegrityConstraintViolationException;

public class AddressDao3TestMain {

	public static void main(String[] args) throws Exception{
		/*
		 * AddressDao3TestMain에서 
		 * AddressDao3로 파라메타를 전달
		 */
		AddressDao3 addressDao=
				new AddressDao3();
		System.out.println("1.insert");
		try {
			//addressDao.insert("guard","강경호","023-561-9084","서울시민");
			Address InsertAddress = 
					new Address(0,"tomato", "토마토", "222-5656", "머구");
			addressDao.insert(InsertAddress);
		
		}catch (SQLIntegrityConstraintViolationException e) {
			System.out.println(">>이미존재하는 아이디입니다.");
		}
	
		System.out.println("2.selectByNo");
		addressDao.selectByNo(7);
		addressDao.selectByNo(8);
		addressDao.selectByNo(2134213);
		
		System.out.println("3.selectByAll");
		addressDao.selectAll();
		
		
		System.out.println("4.update");
		Address updateAddress = new Address(100, null, "김변경", "888-8888", "경남 산청");
		addressDao.updateByNo(updateAddress);
		
		System.out.println("5.delete");
		addressDao.deleteByNo(3);
		addressDao.deleteByNo(4);
		addressDao.deleteByNo(5);
		
		

	}

}