package generic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

import nogeneric.Account;
public class CollectionsMain {
	public static void main(String[] args) {
		/*
		 * Collections 클래스
		 *   - Collection객체들의 utility메쏘드제공
		 */
		ArrayList<Integer> intList=new ArrayList<Integer>();
		intList.add(34);
		intList.add(45);
		intList.add(78);
		intList.add(90);
		intList.add(23);
		intList.add(10);
		intList.add(99);
		intList.add(20);
		
		ArrayList<String> stringList=new ArrayList<String>();
		stringList.add("유재석");
		stringList.add("조세호");
		stringList.add("김경호");
		stringList.add("이효리");
		stringList.add("유재식");
		
		ArrayList<Account> accountList=new ArrayList<Account>();
		accountList.add(new Account(4523, "BING", 33000, 0.5));
		accountList.add(new Account(2367, "KING", 23000, 0.1));
		accountList.add(new Account(8909, "KING", 89000, 0.2));
		accountList.add(new Account(1234, "YONG", 99000, 0.7));
		accountList.add(new Account(2789, "SANG", 12000, 0.3));
		
		
		System.out.println("-----------------sort-------------------");
		System.out.println(intList);
		Collections.sort(intList);//sort
		System.out.println("sort    -->"+intList);
		Collections.reverse(intList);//reverse
		System.out.println("reverse -->"+intList);
		Collections.shuffle(intList);//shuffle
		System.out.println("shuffle -->"+intList);
		
		System.out.println(stringList);
		Collections.sort(stringList);
		System.out.println("sort    -->"+stringList);
		Collections.reverse(stringList);
		System.out.println("reverse -->"+stringList);
		Collections.shuffle(stringList);
		System.out.println("shuffle -->"+stringList);
		
		System.out.println(">>>정렬전[Comparable]");
		for(Account account:accountList) {
			account.print();
		}
		/*
		 << Collections.sort(accountList) >>
		    - List안에있는 element(Account) 는 
		      반드시 Comparable interface를 구현해야한다.
		    - Collections.sort(accountList)메쏘드 정렬메카니즘
		        
			    A. 첫번째Account객체와 두번째Account객체를 비교한다. 
			     	Account firstAccount=accountList.get(0);
			     	Account secondAccount=accountList.get(1);
			        int result=firstAccount.compareTo(secondAccount);
			    B. 비교의 결과값 정수가 양수이면 첫번째와 두번째를 교환   한다. 
			       비교의 결과값 정수가 음수이면 첫번째와 두번째를 교환 안한다. 
			   
			    A. 두번째Account객체와 세번째Account객체를 비교한다. 
			     	Account secondAccount=accountList.get(1);
			    	Account thirdAccount=accountList.get(2);
			       int result=secondAccount.compareTo(thirdAccount);
			    B. 비교의 결과값 정수가 양수이면 두번째와 세번째를 교환   한다. 
			       비교의 결과값 정수가 음수이면 두번째와 세번째를 교환 안한다. 
		 */
		//Collections.sort(accountList); 왜 안됌?
		
		
		System.out.println(">>>정렬후[Comparable]");
		for (Account account : accountList) {
			account.print();
		}
		/*
		 Comparator interface
		  << Collections.sort(List,Comparator) >>
		 */
		Collections.sort(accountList, 
				new AccountBalanceDescComparator());
		System.out.println(">>잔고내림차순정렬후[Comparator]");
		for (Account account : accountList) {
			account.print();
		}
		
		Collections.sort(accountList, 
				new AccountOwnerAscComparator());
		System.out.println(">>이름오름차순정렬후[Comparator]");
		for (Account account : accountList) {
			account.print();
		}
		
		
		
	}

}