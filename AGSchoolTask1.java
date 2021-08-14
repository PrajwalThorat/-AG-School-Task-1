import java.util.Scanner;

public class AGSchoolTask1{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of Student : ");
        int numberOfStudent = scanner.nextInt();
        String[] name = new String[numberOfStudent];
        String[] rollNumber = new String[numberOfStudent];
        int[] math = new int[numberOfStudent];
        int[] science = new int[numberOfStudent];
        int[] english = new int[numberOfStudent];
        int[] language = new int[numberOfStudent];
        int[] socialStudies = new int[numberOfStudent];
        int[] totalMarks = new int[numberOfStudent];
        double[] Average = new double[numberOfStudent];
        for(int i=0 ; i<numberOfStudent ; i++){
            System.out.println("Enter the "+(i+1)+" Student Details");
            System.out.print("Enter the Name       : ");
            name[i] = scanner.next();
            System.out.print("Enter the Roll Number : ");
            rollNumber[i] = scanner.next();
            System.out.println("Enter the Marks of the Student out of 100");
            System.out.println("Subject    Max. Marks       Marks Obtains");
            System.out.print(" Math           100                ");
            math[i] = scanner.nextInt();
            System.out.print("Science         100                ");
            science[i] = scanner.nextInt();
            System.out.print("English         100                ");
            english[i] = scanner.nextInt();
            System.out.print("Language        100                ");
            language[i] = scanner.nextInt();
            System.out.print("Social Studies  100                ");
            socialStudies[i] = scanner.nextInt();
            System.out.println("--------------------------------------");
            totalMarks[i] = math[i] + science[i] + english[i] + language[i] + socialStudies[i];
            System.out.println("Total          600                 "+totalMarks[i]);
            Average[i] = totalMarks[i]/5;
            System.out.println("Average        : "+Average[i]);
        }
        int Lenght = Average.length;
        double topper = Average[0];
        for(int j=0 ; j<Lenght ; j++){
            if(Average[j]>topper){
                topper= Average[j];
            }

        }for(int i=0 ; i<Lenght ; i++){
            if(topper==Average[i]){
                System.out.println("Topper\nName\tRollNo.");
                System.out.println("-----------------------");
                System.out.print(""+name[i]+"\t"+rollNumber[i]);
            }
        }
    }
}