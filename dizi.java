public class Main {
    public static void main(String[] args){
        int [][] dizi=new int[2][2];
        int [][] dizia=new int[2][2];
        int [][] dizib=new int[2][2];

        int [][] dizi1 = {{1,2},{3,4}};
        int [][] dizi2 = {{5,6},{7,8}};


        mtd(dizi1, dizi2);

    }
    public static void mtd (int a[][] , int b[][]){
        int [][] c = {{0,0},{0,0}};
        for(int satir=0; satir<a.length; satir++){
            for(int sutun=0; sutun<a[satir].length; sutun++){
                a[satir][sutun]=a[satir][sutun]*3;
            }

        }
        for(int satir=0; satir<b.length; satir++){
            for(int sutun=0; sutun<b[satir].length; sutun++){
                b[satir][sutun]=b[satir][sutun]-2;
            }

        }
        for(int satir=0; satir<c.length; satir++){
            for(int sutun=0; sutun<c[satir].length; sutun++){
                c[satir][sutun]=a[satir][sutun]+b[satir][sutun];
                System.out.println("Dizinin "+ (satir+1) + ".satir " + (sutun+1) + ".sutunu: " + c[satir][sutun]);
            }

        }

    }
}
