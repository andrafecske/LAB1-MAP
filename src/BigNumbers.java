public class BigNumbers {
   int[] number1, number2;
   public BigNumbers(int[] nr1, int[] nr2) {
       number1 = nr1;
       number2 = nr2;

   }

   public BigNumbers(int[] nr1){
       number1 = nr1;
   }

   //punkt 1
   public int[] sum(){
       int[] result = new int[number1.length + 1];
       int carry = 0;

       for(int i = number1.length - 1; i >= 0; i--){
           int sum = number1[i] + number2[i] + carry;
           result[i + 1] = sum % 10;
           carry = sum / 10;
       }

       result[0] = carry;
       if(result[0] == 0)
       {
           int[] newRes = new int[number1.length];
           for (int i = 0; i < number1.length; i++) {
               newRes[i] = result[i + 1];
           }
           return newRes;
       }
    return result;
   }

   //punkt 2

    public int[] difference(){
       int[] result = new int[number1.length];
       int borrow = 0;
       for(int i = number1.length - 1; i >= 0; i--){
           int diff = number1[i] - number2[i] - borrow;
           if(diff < 0)
           {
               diff += 10;
               borrow = 1;
           }
           else{
               borrow = 0;
           }
           result[i] = diff;
       }

       int zeroes = 0;
       while (zeroes < number1.length -1 && result[zeroes] == 0){
           zeroes++;
       }
       int[] newRes = new int[number1.length - zeroes];
       for (int i = 0; i < newRes.length; i++) {
           newRes[i] = result[i + zeroes];
       }

       return newRes;
    }

    //punkt 3

    public int[] mulDigit(int mul){
       int[] result = new int[number1.length + 1];
       int carry = 0;

       for(int i = number1.length - 1; i >= 0; i--){
           int product = number1[i] * mul +carry;
           result[i + 1] = product % 10;
           carry = product / 10;
       }
       result[0] = carry;
        if(result[0] == 0)
        {
            int[] newRes = new int[number1.length];
            for (int i = 0; i < number1.length; i++) {
                newRes[i] = result[i + 1];
            }
            return newRes;
        }
        return result;

    }

    public int[] divDigit(int divisor){
       int[] result = new int[number1.length];
       int r = 0; //rest
       for(int i = 0; i< number1.length; i++){
           r = r*10 + number1[i];
           result[i] = r/divisor;
           r=r%divisor;
       }
        int zeroes = 0;
        while (zeroes < number1.length -1 && result[zeroes] == 0){
            zeroes++;
        }
        int[] newRes = new int[number1.length - zeroes];
        for (int i = 0; i < newRes.length; i++) {
            newRes[i] = result[i + zeroes];
        }

        return newRes;

    }

}
