import java.util.Scanner;
import java.util.Arrays;

public class Grades {
    public static void main(String[] args) {
        // Creating the array of grades
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of students : ");
        int n = sc.nextInt();

        double[] grades = new double[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter th grade of student " + (i + 1) + " : ");
            grades[i] = sc.nextDouble();
        }

        // Question 01:
        Arrays.sort(grades);

        System.out.println("\nSorted notes :");
        for (double grade : grades) {
            System.out.print(grade + "\n");
        }

        // Question 02:
        double sum = 0;
        for (double grade : grades) {
            sum += grade;
        }

        double average = sum / grades.length;
        System.out.println("\n\nAverage of grades : " + average);

        // Question 03:
        double min = grades[0];
        double max = grades[grades.length - 1];

        System.out.println("Minimum grade : " + min);
        System.out.println("Maximum grade : " + max);

        // Question 04:
        System.out.print("\nEnter a grade to search : ");
        double search = sc.nextDouble();

        int count = 0;
        for (double grade : grades) {
            if (grade == search) {
                count++;
            }
        }
        System.out.println("Number of students with the grade " + search + " : " + count);

    }
}