


package javacalculadora;

import java.util.Scanner;
/**
 *
 * @author guilherme.oliveira
 */
public class JavaCalculadora {

    public static void main(String[] args) {
        MenuCalculadora c = new MenuCalculadora();
	float opcao = 5;
        float But1;
	float But2;
                
        Scanner input = new Scanner(System.in); 
	System.out.println("*Escolha uma das opções*");
	System.out.println("1. Dividir");  
        System.out.println("2. Multiplicar");  
	System.out.println("3. Subtrair");  
        System.out.println("4. Somar");  
	System.out.println("0. Sair");  
	System.out.println("Operação: ");  
	opcao = input.nextInt();
	 while (opcao != 0) {
	  if (opcao == 1) {
	    		
	    Scanner input1 = new Scanner(System.in); 
	    System.out.println("Insira o primeiro numero: ");
	    But1 = input1.nextFloat();
	    System.out.println("Insira o segundo numero: ");
	    But2 = input1.nextFloat();
	    
	    float operacao = c.divi(But1, But2);
	    System.out.println(operacao);
	    break;
	    }
	    	if (opcao == 2) {
	    	 Scanner input1 = new Scanner(System.in);
	  	 System.out.println("Insira o primeiro numero: ");
	  	 But1 = input1.nextFloat();
	  	 System.out.println("Insira o segundo numero: ");
	  	 But2 = input1.nextFloat();
	  	 float operacao = c.multi(But1, But2);
	  	 System.out.println(operacao);
		   break;
		    }
		    if (opcao == 3) {
		    Scanner input1 = new Scanner(System.in); 
		    System.out.println("Insira o primeiro numero: ");
		    But1 = input1.nextFloat();
		    System.out.println("Insira o segundo numero: ");
		    But2 = input1.nextFloat();
		    float operacao = c.subi(But1, But2);
		    System.out.println(operacao);
			break;
		    	 }
			  if (opcao == 4) {
			   Scanner input1 = new Scanner(System.in); 
			   System.out.println("Insira o primeiro numero: ");
			   But1 = input1.nextFloat();
			   System.out.println("Insira o segundo numero: ");
			   But2 = input1.nextFloat();
			   float operacao = c.soma(But1, But2);
			   System.out.println(operacao);
				break;
				    }
			    	else{
				System.out.println("O operador é invalida");
				break;
      }
    }
  }
}
