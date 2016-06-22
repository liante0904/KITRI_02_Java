import world.asia.korea;
import world.europe.uk;
/*import java.lang.String;
import java.lang.System*/


public class PackageTest {

	public static void main(String[] args) {
		/*world.asia.korea k;
		k = new world.asia.korea();
		*/
		korea k;
		k = new korea();
		// k.population = -1;
		k.setPopulation(-1);
		k.setPopulation(5000);
		//k.capital = "평양";
		//k.language= "일본어";
		k.print();
		
		uk uk;
		uk = new uk();
		
	}

}
