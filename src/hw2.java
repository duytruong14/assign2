import java.util.Scanner;
public class hw2 {
    public static void main(String[] args){
        int N;
        Student S=new Student();
        Scanner input=new Scanner(System.in);
        System.out.println("How many student's data you want to enter: ");
        N=input.nextInt();

        input.nextLine();
        Student[] s = new Student[N];
        System.out.println("Enter student detail one by one:");
        int counter=1;
        for (int j=0;j<N;j++){
            s[j]=new Student();


         s[j].getInfo();

        }
        System.out.println(" “Students Details, Department of ILT”.");
        for (int j=0;j<N;j++){
            System.out.println("Student number "+counter);
            s[j].displayInfo();
            counter=counter+1;
        }
        S.studentNumber(N);






        }


    }

