public class ReverseNumber{

	public int reverse(int x) {
        double reversedNumber = 0;
        while(x != 0){
            reversedNumber = reversedNumber*10 + x%10;
            x /= 10;
        }
        if(reversedNumber > Integer.MAX_VALUE){
            return 0;
        }
        if(reversedNumber < Integer.MIN_VALUE){
            return 0;
        }
        return (int)reversedNumber;
    }
	
}
