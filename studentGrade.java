import java.util.*;
public class studentGrade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of subjects : ");
        int n = sc.nextInt();
        int a[] = new int[n];
        int tmarks = 0;
        System.out.println("Enter thr marks for each subject : ");
        for(int i = 0;i<n;i++)
        {
            a[i]=sc.nextInt();
            tmarks += a[i];
        }
        int avg = tmarks/n;
        System.out.println("Total marks obtained : "+ tmarks);
        System.out.println("The avarage marks obtained : "+avg);
        System.out.println("The grade is : ");
        if(avg>=90&&avg<=100)
        {
            System.out.println("A");
        }
        else if(avg>=80&&avg<=89)
        {
            System.out.println("B");
        }
        else if(avg>=70&&avg<=79)
        {
            System.out.println("C");
        }
        else if(avg>=60&&avg<=69)
        {
            System.out.println("D");
        }
        else
        {
            System.out.println("Fail the exam !!!!");
        }
        sc.close();
    }
}
