package play;

public class ConvertToBinary {
	
	
	public int convertBinary(int N) {
		int answer=0;
		 if (N == 0) {
		        return answer;
		    }

		    StringBuilder binaryNumber = new StringBuilder();
		    Integer quotient = N;

		    while (quotient > 0) {
		        int remainder = quotient % 2;
		        binaryNumber.append(remainder);
		        quotient /= 2;
		    }

		    binaryNumber = binaryNumber.reverse();
		    answer=Integer.valueOf(binaryNumber.toString());
		    return answer;
	}

}
