import java.util.*;
abstract class Doctor{
    abstract void treatPatients();
        
    
}
class Physician extends Doctor{
    
    @Override
    void treatPatients() {
        
        System.out.println("I am a physician \nI treat patients with medicines");
    }

}
class Surgeon extends Doctor{
    @Override
    void treatPatients(){
        System.out.println("I am a Surgeon \nI treat people who needs surgeries");
    }
}
class Dentist extends Doctor{
    @Override
    void treatPatients(){
        System.out.println("I am a Dentist \nI deal with patients who have dental problems");
    }
}



public class Lecture_9 {
    public static void main(String[] args){
        System.out.println("Hi Welcome to Max care, I am Kaushik");
        System.out.println("Please enter\n 1 for Physician\n 2 for Surgeon\n 3 for Dentist");
        Scanner sc=new Scanner(System.in);
        int choice=sc.nextInt();
    Doctor doc=null; 
    switch(choice){
        case 1:
            doc=new Physician();
            break;

        case 2:
            doc=new Surgeon();
            break;

        case 3:
            doc=new Dentist();
            break;

        default:
            System.out.println("Oops! Invalid choice.");
            break;


    }
    if(choice<0 || choice>3){
        System.exit(0);
    }else{
        doc.treatPatients();
    }
    }
}
