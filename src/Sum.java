import java.util.Scanner;

public class Sum
{
        void func(){
            Scanner sc = new Scanner(System.in);
            int x= sc.nextInt();
            int y=sc.nextInt();
            //int x=10;
            //int y=20;
            int res = x+y;
            System.out.println(res);
        }
        public static void main(String args[]){
            Sum obj = new Sum();
            obj.func();
        }
    }

