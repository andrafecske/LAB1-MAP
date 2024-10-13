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

        int[] numbersArray = {4 , 8, 3, 10, 17};
        Numbers numbers = new Numbers(numbersArray);
        System.out.println(numbers.findMin());
        System.out.println(numbers.findMax());
        System.out.println(numbers.minSum());
        System.out.println(numbers.maxSum());
    }
}
