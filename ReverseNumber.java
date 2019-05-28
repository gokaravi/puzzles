public class ReverseNumber{

	public int reverse(int x) {
        
        int reversedNumber = 0;
        int upperlimit = 214748364;
        int lowerlimit = -214748364;
        
        while(x != 0){
            if(reversedNumber > upperlimit){
              return 0;
            }
            if(reversedNumber < lowerlimit){
              return 0;
            }
            reversedNumber = reversedNumber*10 + x%10;
            
            x /= 10;
        }
        return reversedNumber; 
        
    }
	
}
