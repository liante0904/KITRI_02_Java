package world.asia;

public class korea {
	/*public int population;
	String capital;
	private String language;
	*/
	
	private int population;
	private String capital;
	private String language;

	
	public void setPopulation(int population){
		if(population < 1){
			System.out.println("인구는 1이상이어야 합니다.");
			return; // 인구값이 1보다 작을경우 메세지를 출력하고 종료한다.
		}
		this.population = population;
		// 실제 population값은 private로 접근제한을 시켜주고,
		// setPopulation 는 population 변수의 값을 세팅하는 메소드이다.
	}
	
	public void print(){
		System.out.println("KOREA의 인구" + population);
		System.out.println("KOREA의 수도" + capital);
		System.out.println("KOREA의 언어" + language);
	}
}
