package com.project.pattern;

import java.util.Scanner;

public class Patterns {
	
	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the size of the pattern");
		int n=s.nextInt();
		hollowDownwardRightTriangle(n);
		hollowDownwardLeftTriangle(n);
		hollowPyramid(n);
		hollowReversePyramid(n);
		hollowMirrorRhombus(n);
		hollowRhombus(n);
		hollowRightPascalTriangle(n);
		hollowLeftPascalTriangle(n);
		hollowDiamond(n);
		hollowDiamondInsideSquare(n);
		squareFilled(n);
		squareHollow(n);
		hollowHourGlass(n);
		butterflyStar(n);
		
	}

	
	static void hollowDownwardRightTriangle(int n) {
		System.out.println("\nhollowDownwardRightTriangle:\n");
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if(i==0||j==n-1||i==j)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println("");
		}	
	}
	
	static void hollowDownwardLeftTriangle(int n) {
		System.out.println("\nhollowDownwardLeftTriangle:\n");
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if(i==0||i+j==n-1||j==0)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println("");
		}
	}
	
	static void hollowPyramid(int n) {
		int k=n-1;
		System.out.println("\nhollowPyramid:\n");
		for(int i=0;i<n;i+=2) {
			for(int j=0;j<n;j++) {
				if(i==0||i==2*j||i+j==k)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println("");
			k++;
		}
	}
	
	
	static void hollowReversePyramid(int n) {
		int k=n/2;
		System.out.println("\nhollowReversePyramid:\n");
		for(int i=0;i<n;i+=2) {
			for(int j=0;j<n;j++) {
				if(i==n-1||i+j==k||j==k)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println("");
			k++;
		}
		
	}

	static void hollowMirrorRhombus(int n) {
		System.out.println("\nhollowMirrorRhombus:\n");
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if(i==0||i==n-1||j==n-1||j==0)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println("");
			for(int k=0;k<=i;k++)
				System.out.print(" ");
		}
	}
	
	static void hollowRhombus(int n) {
		int b=n;
		System.out.println("\nhollowRhombus:\n");
		for(int i=0;i<n;i++) {
			for(int k=b;k>0;k--)
				System.out.print(" ");
			for(int j=0;j<n;j++) {
				if(i==0||i==n-1||j==n-1||j==0)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println("");
			b--;
		}
	}
	

	static void hollowRightPascalTriangle(int n) {
		System.out.println("\nhollowRightPascalTriangle:\n");
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if(i>=j&&i+j<=n-1&&(j==0||i==j||i+j==n-1)) 
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println("");
		}
	}
	
	static void hollowLeftPascalTriangle(int n) {
		System.out.println("\nhollowLeftPascalTriangle:\n");
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if(i<=j&&i+j>=n-1&&(j==n-1||i==j||i+j==n-1)) 
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println("");
		}
	}
	
	
	static void hollowDiamond(int n) {
		System.out.println("\nhollowDiamond:\n");
		for(int i=0;i<n;i++) {
			for(int j=0;j<n-i-1;j++) 
				System.out.print(" ");
			for(int j=0;j<2*i+1;j++) {
				if(j==0||j==2*i)
					System.out.print("*");
				else
					System.out.print(" ");
			}	
			System.out.println();
		}
		
		for(int i=n-2;i>=0;i--) {
			for(int j=0;j<n-i-1;j++)  
				System.out.print(" ");
			for(int j=0;j<2*i+1;j++) {
				if(j==0||j==2*i)
					System.out.print("*");
				else
					System.out.print(" ");
			}	
			System.out.println();
		}
		
	}
	
	

	    static void hollowDiamondInsideSquare(int n) {
			System.out.println("\nhollowDiamondInsideSquare:\n");

	        for(int i=1;i<=n;i++) {
	            printLine(i,n);
	        }

	        for(int i=n-1;i>=1;i--) {
	            printLine(i,n);
	        }
	    }

	    static void printLine(int num, int n) {
	        for(int i=1;i<=n-num+1;i++) {
	            System.out.print("*");
	        }

	        for(int i=1;i<=2*num-2;i++) {
	            System.out.print(" ");
	        }

	        for(int i=1;i<=n-num+1;i++) {
	            System.out.print("*");
	        }

	        System.out.println();
	    }
	

	
	static void squareFilled(int n) {
		System.out.println("\nsquareFilled:\n");
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	static void squareHollow(int n) {
		System.out.println("\nsquareHollow:\n");
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if(i==0||j==0||i==n-1||j==n-1)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println("");
		}
	}
	
	static void hollowHourGlass(int n) {
		System.out.println("\nhollowHourGlass:\n");
        
        for(int i=1;i<n;i++) {
            for(int j=i;j<=n;j++) 
                System.out.print(" ");         
            for(int j=1;j<i;j++) 
                System.out.print("* ");           
            for(int j=1;j<=i;j++) {
                System.out.print("* ");                
            }
            System.out.println();
        }

        for(int i=1;i<=n;i++){
            for (int j=1;j<i;j++) 
                System.out.print(" ");           
            for (int j=i;j<n;j++) 
            	System.out.print("*");
            for (int j=i;j<=n;j++) 
            	System.out.print("*");
               
            System.out.println();
        }

	}
	
	static void butterflyStar(int n) {
		System.out.println("\nbutterflyStar:\n");
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if((i>=j&&i+j<=n-1)||(i<=j&&i+j>=n-1))
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println("");
		}
	}




}
