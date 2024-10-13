public class Main {
    public static void main(String[] args) {
        int[] gradesArray = {29, 37, 38, 41, 84, 67};
        Grades grade = new Grades(gradesArray);
        int res[] = grade.notSufficient();

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
    }
}
