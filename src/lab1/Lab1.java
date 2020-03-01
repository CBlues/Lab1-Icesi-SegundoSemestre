
package lab1;


import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Edgar Andres Rodriguez Florez_
 */
public class Lab1 {

    /**
     * Metodo main que llama al menu donde se depliegan el resto de funciones
     */
    public static void main(String[] args){
		
			menu();
	

}
 /**
     * El menu es el centro de la aplicacion, desde aqui se navegara y escogera entre las diferentes opciones
     * la primera opcion hace los puntos 1-5 del laboratorio
     * la segunda opcion  6-10
     * la tercera opcion hace los puntos restantes
     * para escoger una opcion escriba el numero que aparece en frente de estas
     */

	public static void menu(){		
	
	Scanner sn = new Scanner(System.in);
			
	boolean shutdown = false;
			
	int option;
	
		while(!shutdown){
		
		System.out.println("Escribe el numero de una de las siguientes opciones");		
		
		System.out.println("1. Opcion 1");
		System.out.println("2. Opcion 2");
		System.out.println("3. Opcion 3");
		System.out.println("4. Salir");
try{
	option = sn.nextInt();
		
		switch(option){
		case 1:
			System.out.println("Comenzando Opcion 1");
			threeStrings();
			break;
		
		case 2:
			System.out.println("Comenzando Opcion 2");
			numbers();
			break;
		
		case 3:
			System.out.println("Comenzando Opcion 3");
			arrays();
			break;
		
		case 4:
		    System.out.println("Saliendo...");
				shutdown=true;
				break;
			
			default:
				System.out.println("Numero INVALIDO");
				}
		}	catch (InputMismatchException e) { 
		    System.out.println("Utilice solo numeros para elegir una de las opciones");
		    sn.next();
	}
}
		
		
	}
/**
     * En este metodo tiene que ingresar seguidamente una secuencia de numeros donde depues se le dira el tamano y longitud
     * concatena las cadenas y despues las imprime
     */
	public static void threeStrings(){
		//inicializacion de las variables
		int string1;
		int string2;
		int string3;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Ingrese la primera cadena de numeros enteros");
		string1 = sc.nextInt();
		int length1 = (int)(Math.log10(string1)+1);
		System.out.println("La longitud de la primera cadena es: "+length1);
		
		System.out.println("Ingrese la segunda cadena de texto");
		string2 = sc.nextInt();
		int length2 = (int)(Math.log10(string2)+1);
		System.out.println("La longitud de la segunda cadena es: "+length2);
		
		System.out.println("Ingrese la tercera cadena de texto");
		string3 = sc.nextInt();
		int length3 = (int)(Math.log10(string3)+1);
		System.out.println("La longitud de la tercera cadena es: "+length3);
		
		
		
		System.out.println(string1+""+string2+""+string3);
		
		//la posicion no debe pasarse del tamano de ninguna de las cadenas
		System.out.println("Ingrese una posicion de la cadena");
		int num1;
		num1 = sc.nextInt();
		
		String str1 = Integer.toString(string1); 
	
		char character1 = str1.charAt(num1);
		
		System.out.println(character1);
		
		String str2 = Integer.toString(string2); 
	
		char character2 = str2.charAt(num1);
		
		System.out.println(character2);
		
		String str3 = Integer.toString(string3); 
	
		char character3 = str3.charAt(num1);
		
		System.out.println(character3);
		
		
		
		
		
		
	
		
	
	}//finalizacion del metodo
	/**
     * este metodo se encarga de sumar y dividir los numeros ingresados por el usuario
     */
	public static void numbers(){
	//inicializacion de variables
	float num1 = 0;
	float num2 = 0;
	float result;
	float residue;
	int sizearr;
	int number;
	
	Scanner reader = new Scanner(System.in);
	System.out.println("ingrese el primer numero");
		num1 = reader.nextFloat();
	
	System.out.println("ingrese el segundo numero");
		num2 = reader.nextFloat();
		
		result = num1/num2;
		
	System.out.println("El resultado es: "+result);
	
	int entire1 = (int)num1;
		int entire2 = (int)num2;
		
		
		result= entire1/entire2;
		
	residue=entire1%entire2;
		
		System.out.println("El resultado de la parte entera es: "+result);
		System.out.println("Con residuo: "+residue);
		
		System.out.println("ingrese el primer arreglo");
		

		
			
		}//finalizacion del metodo
/**
     * Este metodo se encarga de ller los arreglos ingresados por el usuario
     * el usuario deside el tamaño de los arreglos
     */		
	public static void arrays(){
            //del tamano debe ser un numero positivo entero
		System.out.println("ingrese el tamano del primer arreglo");
		Scanner sc = new Scanner(System.in);
		int totalsize,arrsize1,arrsize2,arrsize3,max1=Integer.MIN_VALUE,max2=Integer.MIN_VALUE,max3=Integer.MIN_VALUE;
		int counter1=0,counter2=0,counter3=0;
		float sum1=0,sum2=0,sum3=0;
		arrsize1= sc.nextInt();
	
	int[] numbers1= new int[arrsize1];
		
	for(int i=0; i<arrsize1; i++){
		System.out.println("ingrese el numero #"+(i+1));
		numbers1[i] = sc.nextInt();
		sum1+= numbers1[i];
		counter1++;
		
		if (numbers1[i]>max1){
			max1=numbers1[i];
		}
		
		
	}
	
	System.out.println("ingrese el tamano del segundo arreglo");
	arrsize2= sc.nextInt();
	
	int[] numbers2= new int[arrsize2];
	
	for(int i=0; i<arrsize2; i++){
		System.out.println("ingrese el numero #"+(i+1));
		numbers2[i] = sc.nextInt();
		sum2+= numbers2[i];
		counter2++;
		if (numbers2[i]>max2){
			max2=numbers2[i];
		}
		
	}
	System.out.println("ingrese el tamano del tercer arreglo");
	arrsize3= sc.nextInt();
	
	int[] numbers3= new int[arrsize3];
	
	for(int i=0; i<arrsize3; i++){
		System.out.println("ingrese el numero #"+(i+1));
	numbers3[i] = sc.nextInt();
	sum3+= numbers3[i];
		counter3++;
		if (numbers3[i]>max3){
			max3=numbers3[i];
		}
	
	
	}
	
	totalsize=arrsize1+arrsize2+arrsize3;
	
	int C[]=new int[100];
		
		System.out.println(Arrays.toString(numbers1));
		System.out.println(Arrays.toString(numbers2));
		System.out.println(Arrays.toString(numbers3));
		
	System.out.println("Decida el numero del arreglo al cual sacar el promedio y el mayor valor");	
	//se da a escoger las opciones que tiene el usuario
        //decide lo que quiere hacer con los arreglos
	int option=0;
	option = sc.nextInt();
	
	switch(option){
		case 1:
		System.out.println("Promedio primer arreglo: "+sum1/counter1);
		System.out.println("Mayor numero del primer arreglo: "+ max1);	
			
		
			
			break;
		
		case 2:
		System.out.println("Promedio segundo arreglo: "+sum2/counter2);
		System.out.println("Mayor numero del segundo arreglo: "+ max2);	
			
			break;
		
		case 3:
		System.out.println("Promedio tercer arreglo: "+sum3/counter3);
		System.out.println("Mayor numero del tercer arreglo: "+ max3);	
			
			break;
	}
	
	System.out.println("Decida entre sumar, restar y multiplicar dos de sus arreglos");
	int option2=0;
	option2 = sc.nextInt();
	int[] result1= new int[arrsize1];
	int num1,num2,result;
	
	switch(option2){
		case 1:
		System.out.println("Suma");
		
		
		
		
		for(int x=0; x<numbers1.length; x++){
			
			num1= numbers1[x];
			num2= numbers2[x];
			
			result=num1+num2;
			
			System.out.println(result);
			
			
			
		}
		
			
		
			
			break;
		
		case 2:
		System.out.println("resta");
		
		
		
		
		for(int x=0; x<numbers1.length; x++){
			
			num1= numbers1[x];
			num2= numbers2[x];
			
			result=num1-num2;
			
			System.out.println(result);
			
			
			
		}
			
			break;
		
		case 3:
		System.out.println("Multiplicacion");
		
		
		
		
		for(int x=0; x<numbers1.length; x++){
			
			num1= numbers1[x];
			num2= numbers2[x];
			
			result=num1*num2;
			
			System.out.println(result);
			
			
			
		}
			break;
		
	}

	
	}//finalizacion del metodo
	
	
	

	
	
	
	
	
	
		
}

