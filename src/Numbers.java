public class Numbers {
    public int[] numbers;
    public Numbers(int[] nrs) {
        this.numbers = nrs;
    }
    //punkt 1
    public int findMax(){
        int max = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (max < numbers[i]) {
                max = numbers[i];
            }
        }
        return max;
    }

    //punkt 2
    public int findMin(){
        int min = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (min > numbers[i]) {
                min = numbers[i];
            }
        }
        return min;
    }

    public int findSum(){
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];

        }
        return sum;
    }

    //punkt 3
    public int maxSum(){
        int min = findMin();
        return findSum() - min;
    }

    //punkt 4
    public int minSum(){
        int max = findMax();
        return findSum() - max;
    }
}
