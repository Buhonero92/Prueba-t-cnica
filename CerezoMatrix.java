package paquete;

import java.util.Scanner;

public class CerezoMatrix {

	static int[] m; 
	static int[][] v;
	static int[][][] v1;
	
	
	
	public CerezoMatrix(){
		m = new int[] {1,3};
		v = new int[][] {{2, 5, 5},{1, 2, 9}};
		v1 = new int[][][] {{{1, 2, 3}, {2, 3, 4}}, {{5, 6, 7}, {5, 4, 3}}, {{3, 5, 6}, {4, 8, 3}}};
	}
	
	
	
//----------------- MÉTODOS DE LA CLASE CerezoMatrix ------------------------------------------------
	
	
	
	public void dimension(int n){
		if(n == 1){
			System.out.println(m.length);
		}else if(n == 2){
			System.out.println(v.length);
		}else if(n == 3){
			System.out.println(v1.length);
		}
		
	}
	
	public void straight(int n){
		if(n == 1){
			System.out.println("True");
		}else if(n == 2){
			int y = v.length - 1;
			if (v[0].length == v[y].length){
				System.out.println("True");
			}else{
				System.out.println("False");
			}	
		}else if(n == 3){
			int y = v1.length - 1;
			if (v1[0].length == v1[y].length){
				System.out.println("True");
			}else{
				System.out.println("False");
			}	
		}
	}
	
	public int compute(int n){ 
		int suma = 0;
		if (n == 1){
			for(int i = 0; i<m.length; i++){
				suma += m[i];
			}
			System.out.println(suma);
		}else if(n == 2){
			for(int i = 0; i<v.length; i++){
				for (int j = 0; j<v[i].length; j++){
					suma += v[i][j];
				}
			}
			System.out.println(suma);
		}else if(n == 3){
			for(int i = 0; i<v1.length; i++){
				for (int j = 0; j<v1[i].length; j++){
					for (int k=0; k<v1[i][j].length;k++){
						suma += v1[i][j][k];
					}	
				}
			}
			System.out.println(suma);
		}
		return suma;
		
		
	}
	
	
	public static void main(String[] args) {
		int dim;
		Scanner sc = new Scanner(System.in);
		//Las dimensiones solo deberían ser 1, 2 o 3. 
		System.out.print("Escriba el número de dimensiones: ");
		dim = sc.nextInt();
		CerezoMatrix o = new CerezoMatrix();
		switch(dim){
		
		case 1:
			o.dimension(dim);
			o.straight(dim);
			o.compute(dim);
			break;
		
		case 2:
			o.dimension(dim);
			o.straight(dim);
			o.compute(dim);
			break;
		case 3:
			o.dimension(dim);
			o.straight(dim);
			o.compute(dim);
			break;
		}	
	}
}
	

				
	



