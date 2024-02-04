public class lecture_9{
    void add(int n1,int n2){
        System.out.println(n1+n1);
    }
    void add(int n1,int n2,int n3){
        System.out.println(n1+n2+n3);
    }
    void add(float n1,int n2){
        System.out.println(n1+n2);
    }
    void add(float n1 ,float n2 ){
        System.out.println(n1+n2);
    }
    void add(int n1,float n2){
        System.out.println(n1+n2);
    }
    public static void main(String[] args){
        lecture_9 l_9=new lecture_9();
        l_9.add(12.5f,13);
    }
}
