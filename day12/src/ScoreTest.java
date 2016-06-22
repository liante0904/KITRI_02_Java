import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 * scores.txt파일의 사원들 사내교육평가 점수를  구하시오.
 * 각학생의 이름과 평균을 출력하시오. 단 시험미응시인경우 0점으로 변환하여 계산한다.
 * e.g)구엘지:87::66 ==> 평균은 51.0이다 
 */

// 사원 정보를 갖는 Employee 객체
class Employee {
	String name;
	String db;
	String java;
	String web;
	double avg;
	
	public Employee(String[] arr) {
		name = arr[0];
		db = arr[1];
		java = arr[2];
		web = arr[3];
		
		int sum = 0;
		for(int i = 1; i < arr.length; i++) {
			if(!arr[i].equals(""))
				sum += Integer.parseInt(arr[i]);
		}
		avg = (double) sum / 3;
	}
}


public class ScoreTest {

	public static void main(String[] args) {
		try {
			// 파일 불러오기
			BufferedReader br = new BufferedReader(new FileReader("scores.txt"));
			
			// 첫 라인 출력
			System.out.println(br.readLine());
			
			// 사원점수를 저장하는 employeeList 생성
			ArrayList<Employee> employeeList = new ArrayList<Employee>();
			
			// 사원 점수를 Employee 객체로 생성하여 employeeList에 저장
			String str;
			while((str = br.readLine()) != null)
				employeeList.add(new Employee(str.split(":")));
			
			
//			// 내림차순 정렬
//			Collections.sort(employeeList, new Comparator<Employee>() {
//				@Override
//				public int compare(Employee o1, Employee o2) {
//					return (o1.avg > o2.avg) ? -1 : (o1.avg < o2.avg) ? 1 : 0;
//				}
//			});
			
			// Selection sort
			for(int i = 0; i < employeeList.size() - 1; i++) {
				int max = i;
				for(int j = i + 1; j < employeeList.size(); j++) {
					if(employeeList.get(max).avg < employeeList.get(j).avg)
						max = j;
				}
				Employee temp = employeeList.get(i);
				employeeList.set(i, employeeList.get(max));
				employeeList.set(max, temp);
			}
			
			// 출력
			for(Employee e : employeeList) {
				System.out.println(e.name + ":" + e.db + ":" + e.java + ":" + e.web + " ==> 평균은 " + e.avg + "이다.");
			}
			
			br.close();
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}
}