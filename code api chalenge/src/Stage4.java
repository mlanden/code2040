import java.util.Calendar;
import java.util.Date;


public class Stage4 {

	/**
	 * @param args
	 */
	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calendar now = Calendar.getInstance();
		now.set(2020,9,23,11,14,00 );
		System.out.println(now.getTime());
		now.add(Calendar.SECOND, 307799324);
		System.out.print(now.getTime());
	}

}
