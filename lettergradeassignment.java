import java.util.Scanner;

public class lettergradeassignment {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the number of students:");//- To enter the number of students is in the class
		int students=scan.nextInt();
		
		int array_1[]=new int[students];//- Create an array_1 with the size of students in the class to enter integer data
		
		for(int i=0;i<students;i++) {
			System.out.println(i+". enter the notes of students");//- Then, ask the user to enter each student’s grade and save them on the created array_1.
			int a=scan.nextInt();
			array_1[i]=a;
		}
		
		String array_2[]=new String[students];//- Then, create an array_2 with the size of students in the class to enter “letter grade of the students”
		
		//- Then calculate the “letter grade” of each student based on the array with integer data and save them in to an array_2 as a letter grade
		for(int i=0;i<array_1.length;i++) {
			if(array_1[i]>=90) {
				array_2[i]="A";
			}
			else if(array_1[i]>=80) {
				array_2[i]="B";
			}
			else if(array_1[i]>=70) {
				array_2[i]="C";
			}
			else if(array_1[i]>=60) {
				array_2[i]="D";
			}
			else if(array_1[i]<60) {
				array_2[i]="F";
			}
		}
		
		for(int i=0;i<array_2.length;i++) {  //denemek için array_2 yi yazdırdım ödevde istenmiyo
			System.out.println(array_2[i]);
		}
		//ortalama hesabı
		//- Then, create an array_2 with the size of students in the class to enter “letter grade of the students”
		int total=0;  
		for(int i=0;i<array_1.length;i++) {
			total += array_1[i];
		}
		int average =total/students;
		System.out.println(average); //ortalamayı yazdır
		
		//- Then, create an array_2 with the size of students in the class to enter “letter grade of the students”
	//	- Calculate how many students receive grade “A” based on the array_2 data and print the number on the screen if no one, print (“none of the students has grade A”) message
		//- Calculate how many students receive grade “B” based on the array_2 data and print the number on the screen if no one, print (“ none of the students has grade B” ) message
	//	- Calculate how many students receive grade “C” based on the array_2 data and print the number on the screen if no one, print (“ none of the students has grade C” ) message
	//	- Calculate how many students receive grade “D” based on the array_2 data and print the number on the screen if no one, print (“ none of the students has grade D” ) message
	//	- Calculate how many students receive grade “F” based on the array_2 data and print the number on the screen if no one, print (“ none of the students has grade F” ) message
		int countA=0;
		int countB=0;
		int countC=0;
		int countD=0;
		int countF=0;
		for (int i=0;i<array_2.length;i++) {
			if(array_2[i]=="A") {
				countA+=1;
			}
			if(array_2[i]=="B") {
				countB+=1;
			}
			if(array_2[i]=="C") {
				countC+=1;
			}
			if(array_2[i]=="D") {
				countD+=1;
			}
			if(array_2[i]=="F") {
				countF+=1;
			}
			
			
		}

		if (countA==0) {
			System.out.println("none of the students has grade A");
		}
		else
			System.out.println(countA+"students has grade A");
		
     
		if (countB==0) {
			System.out.println("none of the students has grade B");
		}
		else
			System.out.println(countB+"students has grade B");
		
		if (countC==0) {
			System.out.println("none of the students has grade C");
		}
		else
			System.out.println(countC+"students has grade C");
		
		if (countD==0) {
			System.out.println("none of the students has grade D");
		}
		else
			System.out.println(countD+"students has grade D");
		
	
		if (countF==0) {
			System.out.println("none of the students has grade F");
		}
		else
			System.out.println(countF+"students has grade F");
		}
	

}
