public class Grades {
    public int[] grades;

    public Grades(int[] grd) {
        this.grades = grd;
    }
    //punkt1
    public int[] notSufficient() {
        int[] res = new int[grades.length];
        int k = 0;
        for (int grade : this.grades) {
            if(grade<40)
            {
                res[k] = grade;
                k++;
            }
        }

        int[] newRes = new int[k];
        for (int i = 0; i < newRes.length; i++) {
            newRes[i] = res[i];
        }


        return newRes;
    }

    //punkt 2
    public double averageGrade() {
        double sum = 0.0;
        for (int grade : grades) {
            sum += grade;
        }
        return sum / grades.length;  // length works for arrays
    }

    //punkt 3
    public int[] rounded() {
        int[] res = new int[grades.length];
        for (int i = 0; i < grades.length; i++) {
            int add=0;

            for (int j = 1; j <= 3; j++) {
                if(grades[i] < 38)
                    break;

                if ((grades[i] + j) % 5 == 0) {
                    add =  j;
                    break;
                }
            }
            res[i] = grades[i] + add;

        }
        return res;
    }

    //punkt 4
     public int maxGrade(){
        int[] roundedGrades = this.rounded();
        int max = -1;
        for(int i = 0; i<roundedGrades.length; i++)
        {
            if(roundedGrades[i]>max)
                max = roundedGrades[i];
        }
        return max;
     }
}
