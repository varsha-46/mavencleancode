package EPAMassignment.CleanCode;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
class CompoundandSimpleInterest {
	double SimpleInterest(int principal,double rateofInterest,int timeperiod) {
		double SimpleInterest=(principal*rateofInterest*timeperiod)/100;
    return SimpleInterest;
}
double CompoundInterest(int principal,double rateofInterest,int timeperiod) {
	double d=(1+(rateofInterest/100));
    double CompoundInterest=principal*Math.pow(d, timeperiod);
    return CompoundInterest;
    }
}
public class CompoundSimpleInterest {
	public static void main(String args[])throws IOException {

	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
	
	System.out.println("enter the principal ,rateofInterest,timeperiod");
	int principal =Integer.parseInt(br.readLine());
	double rateofInterest=Double.parseDouble(br.readLine());
	int timeperiod = Integer.parseInt(br.readLine());
	CompoundandSimpleInterest c=new CompoundandSimpleInterest();
	bw.write("SimpleInterest="+c.SimpleInterest(principal, rateofInterest, timeperiod)+"\n");
	bw.write("CompoundInterest="+c.CompoundInterest(principal, rateofInterest, timeperiod)+"\n");
	bw.flush();
	}
}
