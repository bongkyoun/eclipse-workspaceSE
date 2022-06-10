package generic;

import java.util.Arrays;

import nogeneric.Account;

public class ArraysMain {

	public static void main(String[] args) {
		int[] intArray1= {1,3,5,7,9};
		int[] intArray2= {1,3,5,7,9};
		
		String[] strArray1= {"one","two","three"};
		String[] strArray2= {"one","two","three"};
		
		int[] scoreArray= {90,67,88,23,56,12,34};
		String[] nameArray= {"공경호","홍경호"," JAMES","장경호","김경호","九경호"};
		
		Account[] accounts= {
				new Account(1111,"DIM",67000,2.3),	
				new Account(2222, "AIM", 45000, 2.7),
				new Account(3333, "XIM", 34000, 3.7),
				new Account(4444, "ZIM", 12000, 1.7),
				new Account(5555, "SIM", 97000, 5.7),
				new Account(6666, "BIM", 88000, 3.7),
				new Account(7777, "CIM", 11000, 9.7),
				new Account(8888, "YIM", 21000, 8.7),
				new Account(9999, "QIM", 71000, 2.7)
		};
		
		System.out.println("1.배열내용비교");
		boolean isSame=Arrays.equals(intArray1, intArray2);
		System.out.println(isSame);
		isSame=Arrays.equals(strArray1, strArray2);
		System.out.println(isSame);
		
		System.out.println("2.배열원소채우기");
		Arrays.fill(intArray1, 1);
		for (int e : intArray1) {
			System.out.print(e+", ");
		}
		System.out.println();
		
		System.out.println("3.배열복사");
		int[] intArray3=Arrays.copyOf(intArray2, 20);
		for (int element : intArray3) {
			System.out.print(element+" ");
		}
		System.out.println();
		
		System.out.println("3.배열복사");
		Account[] newAccounts=Arrays.copyOf(accounts, 20);
		for (Account account : newAccounts) {
			System.out.println(account);
		}
		System.out.println("3.배열복사");
		Account[] destAccounts=new Account[accounts.length];
		System.arraycopy(accounts, 0, destAccounts, 0, accounts.length);
		for (Account account : destAccounts) {
			account.print();
		}
		
		System.out.println("4. sort[기본타입]");
		Arrays.sort(scoreArray);
		for (int score : scoreArray) {
			System.out.print(score+ " ");
		}
		System.out.println();
		
		System.out.println("4. sort[String]");
		Arrays.sort(nameArray);
		for (String name : nameArray) {
			System.out.print(name+" ");
		}
		System.out.println();
		
		System.out.println("4. sort[Integer]");
		Integer[] wia= {89,45,66,12,34,78,23,60};
		Arrays.sort(wia);
		for (Integer integer : wia) {
			System.out.print(integer+ " ");
		}
		System.out.println();
		
		System.out.println("4. sort[Account]-Comparable");
		Arrays.sort(accounts);
		for (Account account : accounts) {
			account.print();
		}
		System.out.println("4. sort[Account]-Comparable");
		Arrays.sort(accounts, new AccountOwnerAscComparator());
		for (Account account : accounts) {
			account.print();
		}
		
		
		
		
		
		
	}
}