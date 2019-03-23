import java.math.BigInteger;

public class Zahl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String b = "8778405442862239";
		String a= "8866128975287528";
		String d = "2736111468807040";
		BigInteger c = ((BigInteger.valueOf(Long.valueOf(d)).multiply(BigInteger.valueOf(Long.valueOf(d)))).multiply(BigInteger.valueOf(Long.valueOf(d))));//.subtract((BigInteger.valueOf(Long.valueOf(b)).multiply(BigInteger.valueOf(Long.valueOf(b)))).multiply(BigInteger.valueOf(Long.valueOf(b)))).subtract((BigInteger.valueOf(Long.valueOf(d)).multiply(BigInteger.valueOf(Long.valueOf(d)))).multiply(BigInteger.valueOf(Long.valueOf(d))));
		System.out.println(c);
	}
	

}

