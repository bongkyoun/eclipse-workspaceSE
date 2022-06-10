/*
switch 문
		 - 형식
		    switch(변수){
		    	case 값_1:
		    	  stmt1;
		    	  break;
		    	case 값_2:
		    	  stmt2;
		    	  break;  
		        case 값_n:
		          stmt3;
		    	  break;
		        default:
		          stmt4;
		    }
		    
		switch(변수)  변수값은 byte,short,int char,String 
		              값이올수있다.(long 은안됨)
 */
public class SwitchTest1 {

	public static void main(String[] args) {
		int level=5;//게임레벨 1~5사이의 정수

		switch(level) {
		case 1:
			System.out.println("초보");
			System.out.println("초보");
			System.out.println("초보");
			System.out.println("초보");
			System.out.println("초보");
			break;
		case 2:
			System.out.println("중수");
			System.out.println("중수");
			System.out.println("중수");
			System.out.println("중수");
			System.out.println("중수");
			break;
		case 3:
		case 4:
		case 5:
			System.out.println("고수");
			System.out.println("고수");
			System.out.println("고수");
			System.out.println("고수");
			System.out.println("고수");
			break;
		default:
			System.out.println("레벨은 1~5사이의 정수입니다.");
			break;
		}
		
		
	}

}










