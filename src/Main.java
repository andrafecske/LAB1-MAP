public class Main {
    public static void main(String[] args) {
        int[] gradesArray = {29, 37, 38, 41, 84, 67};
        Grades grade = new Grades(gradesArray);
        int res[] = grade.notSufficient();

        System.out.println("Aufgabe 1:");
        //punkt 1
        for(int i = 0; i<res.length; i++)
        {
            System.out.print(res[i] + " ");
        }

        //punkt2
        System.out.println();
        double val = grade.averageGrade();
        System.out.printf("%.2f", val);

        //punkt3
        System.out.println();
        int res2[] = grade.rounded();
        for(int i = 0; i<res2.length; i++)
        {
            System.out.print(res2[i] + " ");
        }
        System.out.println();

        //punkt 4

        System.out.println(grade.maxGrade());


        //Aufgabe 2

        System.out.println("Aufgabe 2:");
        int[] numbersArray = {4 , 8, 3, 10, 17};
        Numbers numbers = new Numbers(numbersArray);
        System.out.println(numbers.findMin());
        System.out.println(numbers.findMax());
        System.out.println(numbers.minSum());
        System.out.println(numbers.maxSum());

        //Aufgabe 3

        System.out.println("Aufgabe 3:");
        //punkt1
        int[] bigNr1 = {1, 3, 0, 0, 0 , 0 , 0 , 0 ,0}, bigNr2 = {8, 7 , 0 , 0, 0 , 0, 0, 0,0};
        BigNumbers bigNumbers = new BigNumbers(bigNr1, bigNr2);
        int[] sumNr= bigNumbers.sum();
        for (int i = 0; i < sumNr.length; i++)
        {
            System.out.print(sumNr[i] + " ");
        }

        //punkt2
        bigNr1 = new int[]{8, 3, 0, 0, 0, 0, 0, 0, 0};
        bigNr2 = new int[] {5, 4, 0 , 0, 0 , 0, 0, 0,0};
        BigNumbers bigNumbers2 = new BigNumbers(bigNr1, bigNr2);
        int[] diffNr = bigNumbers2.difference();
        for (int i = 0; i < diffNr.length; i++)
        {
            System.out.print(diffNr[i] + " ");
        }
        System.out.println();

        //punkt 3
        bigNr1 = new int[]{2, 3, 6, 0, 0, 0, 0, 0, 0};
        BigNumbers bigNumbers3 = new BigNumbers(bigNr1);
        int[]mulNr = bigNumbers3.mulDigit(2);

        for (int i = 0; i < mulNr.length; i++)
        {
            System.out.print(mulNr[i] + " ");
        }

        //punkt 4

        System.out.println();
        int[] divNr = bigNumbers3.divDigit(2);
        for (int i = 0; i < divNr.length; i++)
        {
            System.out.print(divNr[i] + " ");
        }
        System.out.println();

        //Aufgabe 4
        System.out.println("Aufgabe 4:");
        int[] keyboardPrices = {40, 35, 70, 15, 45};
        int[] USBprices = {20, 15, 40, 15};

        //punkt 1
        Electronics electronics = new Electronics(keyboardPrices, USBprices, 50);
        System.out.println(electronics.cheapestKeyboard());

        //punkt 2
        keyboardPrices = new int[]{15, 20, 10, 35};
        Electronics electronics1 = new Electronics(keyboardPrices, USBprices, 60);
        System.out.println(electronics1.mostExpensiveProduct());

        //punkt 3
        System.out.println(electronics1.affordableUSB());

        //punkt 4
        keyboardPrices = new int[]{40, 50, 60};
        USBprices = new int[]{8, 12};
        Electronics electronics2 = new Electronics(keyboardPrices, USBprices, 60);
        System.out.println(electronics2.maxSum());


    }
}
