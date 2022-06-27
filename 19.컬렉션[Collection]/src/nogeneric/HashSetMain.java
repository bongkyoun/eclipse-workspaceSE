package nogeneric;

import java.util.HashSet;

public class HashSetMain {

	public static void main(String[] args) {
		Account acc1=new Account(1111, "BING", 33000, 0.5);
		Account acc2=new Account(2222, "KING", 23000, 0.1);
		Account acc3=new Account(3333, "KING", 89000, 0.2);
		Account acc4=new Account(4444, "YONG", 12000, 0.5);
		Account acc5=new Account(5555, "SANG", 99000, 0.8);
		
		
		HashSet accountSet = new HashSet();
		System.out.println("# set size : "+accountSet.size());
		
		System.out.println("-----------------1. add----------------------------");
		accountSet.add(acc1);
		accountSet.add(acc2);
		accountSet.add(acc3);
		accountSet.add(acc4);
		accountSet.add(acc5);
		System.out.println("# set size : "+accountSet.size());
		System.out.println(accountSet);
		
		System.out.println("---------------2. set[중복객체]----------------------");
		/*
		 * Object의 equals 메쏘드[주소비교] 를 사용해서 중복체크를 한다.
		 */
		boolean isAdd = accountSet.add(acc1);
		System.out.println("추가여부 : "+ accountSet.size());
		System.out.println("# set size : "+accountSet.size());
		System.out.println(accountSet);
		
		System.out.println("--------------3. remove[객체 삭제]-------------------");
		boolean isRemove = accountSet.remove(acc4);
		System.out.println("삭제여부 : "+isRemove);
		System.out.println("# set size : "+accountSet.size());
		System.out.println(accountSet);
		
		System.out.println("###################iteration[전체출력]####################");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
