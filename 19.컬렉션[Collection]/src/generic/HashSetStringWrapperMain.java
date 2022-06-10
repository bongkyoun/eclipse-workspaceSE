package generic;

import java.util.HashSet;

public class HashSetStringWrapperMain {

	public static void main(String[] args) {
		System.out.println("################ String ################");
		HashSet<String> nameSet = new HashSet<String>();
		nameSet.add("KIM");
		nameSet.add("JIM");
		nameSet.add("GIM");
		nameSet.add("SIM");
		System.out.println(nameSet);
		boolean isAdd = nameSet.add("KIM");
		System.out.println("추가여부 : " + isAdd);
		System.out.println(nameSet);
		
		System.out.println("################ Wrapper ###############");
		HashSet<Integer> lottoSet = new HashSet<Integer>();
		System.out.println(lottoSet);
		lottoSet.add(new Integer(34));
		lottoSet.add(23);
		lottoSet.add(12);
		lottoSet.add(43);
		lottoSet.add(1);
		System.out.println(lottoSet);
		isAdd = lottoSet.add(34);
		System.out.println("추가여부 : "+isAdd);
		System.out.println(lottoSet);
		
		
		
		
		
		
	}

}
