package Lab01;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class solve {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner keyb = new Scanner(System.in);
		
		System.out.println("Choose your option:");
		System.out.println("1.Linear equation");
		System.out.println("2.Linear system");
		System.out.println("3.Second-degree equation");
		int choice = keyb.nextInt();
		
		if (choice==1) {
			System.out.println("Enter a in ax + b = 0");
			int a = keyb.nextInt();
			System.out.println("Enter b in ax + b = 0");
			int b = keyb.nextInt();
			
			if(a == 0 && b!=0) {
				JOptionPane.showMessageDialog(null, "No answer");
			}
			else if(a==0 && b== 0) {
				JOptionPane.showMessageDialog(null, "Infinite!");
			}
			else {
				float ans = -b/a;
				JOptionPane.showMessageDialog(null, "Your answer is: "+ans);				
				}
		}
		
		else if (choice==2) {
			System.out.println("Solving a11x1+a12x2 = b1\n & a21x1+a22x2 = b2 \n Enter a11");
			int a11 = keyb.nextInt();
			System.out.println("Solving a11x1+a12x2 = b1\n & a21x1+a22x2 = b2 \n Enter a12");
			int a12 = keyb.nextInt();
			System.out.println("Solving a11x1+a12x2 = b1\n & a21x1+a22x2 = b2 \n Enter b1");
			int b1 = keyb.nextInt();
			
			System.out.println("Solving a11x1+a12x2 = b1\n & a21x1+a22x2 = b2 \n Enter a21");
			int a21 = keyb.nextInt();
			System.out.println("Solving a11x1+a12x2 = b1\n & a21x1+a22x2 = b2 \n Enter a22");
			int a22 = keyb.nextInt();
			System.out.println("Solving a11x1+a12x2 = b1\n & a21x1+a22x2 = b2 \n Enter b2");
			int b2 = keyb.nextInt();
			
			if(a11 ==0 && a12 ==0 && b1==0 && a21 ==0 && a22== 0 && b2 == 0 ) {
				JOptionPane.showMessageDialog(null,"Infinite!");
			}
			else if(a11 == 0 && a12== 0 && b1!=0 || a21 == 0 && a22== 0 && b2!=0 ) {
				JOptionPane.showMessageDialog(null,"No awnser");
			}
			else {
				float ans1 = (b1*a21 - b2*a11)/(a12*a21 -a22*a11);
				float ans2 = (b1*a22 - b2*a11)/(-a12*a21 +a22*a11);
				JOptionPane.showMessageDialog(null,"X1 is: "+ans1+" and X2 is: "+ans2);			
				}
		}
		
		else if (choice == 3) {
			
		}
		
		else {
			JOptionPane.showMessageDialog(null,"Invalid");
		}
	}

}
