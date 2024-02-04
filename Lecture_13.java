import java.util.*;

public class Lecture_13 {
    public static void main(String[] args){
        try{
        Scanner sc=new Scanner(System.in);
        int n1=sc.nextInt();
        int n2=sc.nextInt();
        int div=n1/n2;
        System.out.println("Your value for the division is:"+div);
        }
        catch(Exception e){
            System.err.println(e);
        }

    }
}
