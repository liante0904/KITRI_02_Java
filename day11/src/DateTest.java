
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateTest {

	public static void main(String[] args) {
		Date dt;
		dt = new Date();
		System.out.println(dt); //dt.toString() 자동 호출됨
		
		//dt = new Date()
	
		long time = System.currentTimeMillis();
				dt = new Date(time);
				System.out.println(dt);

				Calendar c;		// 객체 생성 불가능
				c = Calendar.getInstance();
				int h = c.get(Calendar.HOUR);
				int m =c.get(Calendar.MINUTE);
				int s =c.get(Calendar.SECOND);
				int y =c.get(Calendar.YEAR);
				int mo = c.get(Calendar.MONTH);
				int d = c.get(Calendar.DATE);

				System.out.println(y+"년" + mo +"월" + d + "일");
				System.out.println(h+"시" + m +"분" + s + "초");
	
				
				c.set(Calendar.YEAR, 2017); //년도를 2017로 설정
				c.set(2017, 03, 01);
				switch(c.get(Calendar.DAY_OF_WEEK)){
				case Calendar.SUNDAY: System.out.println("일요일"); break;
				case Calendar.MONDAY: System.out.println("월요일"); break;
				case Calendar.TUESDAY: System.out.println("화요일"); break;
				case Calendar.WEDNESDAY: System.out.println("수요일"); break;
				case Calendar.THURSDAY: System.out.println("목요일"); break;
				case Calendar.FRIDAY: System.out.println("금요일"); break;
				case Calendar.SATURDAY: System.out.println("토요일"); break;
				}
				
				int lastDate= c.getActualMaximum(Calendar.DATE);
				System.out.println(lastDate);
				
				SimpleDateFormat sdf;
				String pattern = "yyyy-mm-dd a hh:mm:ss";
				sdf = new SimpleDateFormat(pattern);
				String nowStr = sdf.format(new Date());
				System.out.println(nowStr);
	}

}
