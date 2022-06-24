package dao.address.first;

public class AddressDaoTestMain {

	public static void main(String[] args) throws Exception{
		AddressDao addressDao=
				new AddressDao();
		System.out.println("1.insert");
		addressDao.insert("guard", "강경호", "023-561-9084", "서울시민");
		addressDao.insert("xxxx", "심경호", "567-561-9084", "북한시민");

		System.out.println("2.selectByNo");
		addressDao.selectByNo();
		System.out.println("3.selectByAll");
		addressDao.selectAll();
		System.out.println("4.update");
		addressDao.updateByNo();
		System.out.println("5.delete");
		addressDao.deleteByNo();
		
		

	}

}