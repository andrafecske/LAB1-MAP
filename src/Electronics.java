public class Electronics {
    int[] keyboardPrices;
    int[] USBPrices;
    int budget;
    Electronics(int[]kPrices, int[]USBPrices, int budget) {
        this.keyboardPrices = kPrices;
        this.USBPrices = USBPrices;
        this.budget = budget;
    }

    //punkt 1
    public int cheapestKeyboard(){
        int min = keyboardPrices[0];
        for (int i = 1; i < keyboardPrices.length; i++) {
            if (keyboardPrices[i] < min) {
                min = keyboardPrices[i];
            }
        }
        return min;
    }

    //punkt 2
    public int mostExpensiveProduct(){
        int max = USBPrices[0];
        for (int i = 1; i < USBPrices.length; i++) {
            if (USBPrices[i] > max) {
                max = USBPrices[i];
            }
        }

        for (int i = 0; i<keyboardPrices.length; i++) {
            if (keyboardPrices[i] > max) {
                max = keyboardPrices[i];
            }
        }
        return max;

    }

    //punkt 3
    public int affordableUSB(){
        int max = USBPrices[0];
        for (int i = 1; i < USBPrices.length; i++) {
            if (USBPrices[i] > max && USBPrices[i] < budget) {
                max = USBPrices[i];
            }
        }
        return max;
    }

    //punkt 4
    public int maxSum(){
        int maxSum = -1;
        for(int kPrice : keyboardPrices) {
            for(int usbPrice : USBPrices) {
                int total = kPrice + usbPrice;
                if (total > maxSum && total <= budget) {
                    maxSum = total;
                }
            }
        }
        return maxSum;
    }
}
