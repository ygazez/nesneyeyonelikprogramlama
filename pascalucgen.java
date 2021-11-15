class Main {
  public static void main(String[] args) {
     int maxSatir=6;
     for(int n =0;n<=maxSatir;n++){
	for(int k=0;k<=n;k++){
       System.out.print(fact(n)/(fact(k)*fact(n-k))+" ");
      }
      System.out.println();
    }
     int a=satirtoplami(8);//8.satir toplami 2üzeri8
     System.out.println(a);
 }
	public static int fact(int x){
		if ( x == 0 ) 
			return 1;
		if ( x == 1 ) 
			return 1;
		else
			return x* fact ( x-1);
      }
  public static int satirtoplami(int satir){
      int carpim=1;
		  for (int i=1; i<=satir; i++)
			    carpim=carpim*2;
      return carpim;

    }      

  }
