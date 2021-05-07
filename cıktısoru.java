public class Main {
    public static void main(String[] args){
        /*int top=0;
        int i;
        int x=5;
        for(i=0; i<10; i++){
            if(i%2==0){
                continue;}
            top=top+i;
        }
        System.out.println("Top="+top); */
        int x=6;
        System.out.println("a= "+mtd(x));
        if((x>5)!=false){
            System.out.println("1");
        }
        if((x>5)==true){
            System.out.println("1");
        }
    }
    public static int mtd(int a){
        return a++;
    }
}
