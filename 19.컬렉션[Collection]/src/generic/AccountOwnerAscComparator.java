package generic;

import java.util.Comparator;

import nogeneric.Account;

public class AccountOwnerAscComparator 
				implements Comparator<Account>{
	@Override
	public int compare(Account acc1, Account acc2) {
		if(acc1.getOwner().compareTo(acc2.getOwner())> 0 ) {
			return 1;
		}else {
			return -1;
		}
	}
}
			
