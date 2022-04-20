import java.util.Scanner;

public class Student
{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String s1=sc.nextLine();
        String s2=sc.nextLine();
        int n1=s1.length();
        int n2=s2.length();
        if(n1!=n2){
            System.out.println("Not an Anagram");
        }
        else
            System.out.println("Anagram");
    }
}
