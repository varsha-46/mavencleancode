package EPAMassignment.CleanCode;
//import java.util.*;
import java.io.*;
class CostDetection {
	double cost(String ms,double sf) {
		double cost=0.0;
		if(ms.equals("standardmaterial")) {
			cost=1200*sf;
		}
		else if(ms.equals("abovestandardmaterial")) {
			cost=1500*sf;
		}
		else if(ms.equals("highstandardmaterial")) {
			cost=1800*sf;
		}
		else {
			cost=2500*sf;
		}
		return cost;
	}
}
public class CostEstimation {
	
	
	public static void main(String[] args)throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		double squarefeet=Double.parseDouble(br.readLine());
		String materialstandards = br.readLine();
		CostDetection cd = new CostDetection();
		bw.write("Total cost : "+cd.cost(materialstandards,squarefeet));
		bw.flush();
		
	}
}
