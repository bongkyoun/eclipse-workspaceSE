package com.itwill.address.test;

import java.util.List;

import com.itwill.address.Address;
import com.itwill.address.AddressService;

public class AddressServiceTestMain {

	public static void main(String[] args)throws Exception {
		AddressService addressService=new AddressService();
		Address newAddress=
				new Address(0, "guard44", "가아드", "33-2323", "서울시민");
		System.out.println("1.주소록 쓰기");
		System.out.println(">> "+addressService.insert(newAddress));
		System.out.println("2.주소록 삭제");
		System.out.println(">> "+addressService.deleteByNo(2));
		System.out.println("3.주소록 수정");
		Address updateAddress=
				new Address(47, "", "가아드", "33-2323", "서울시민");
		System.out.println(">>"+addressService.updateByNo(updateAddress));
		System.out.println("4. 주소록 번호로 검색");
		System.out.println(addressService.selectByNo(3));
		System.out.println(addressService.selectByNo(5));
		System.out.println("5. 주소록리스트 검색");
		List<Address> addressList=
				addressService.selectAll();
		for (Address address : addressList) {
			System.out.println(address);
		}
	}

}