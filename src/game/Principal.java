package game;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		String word = "";
		char letra;
		int erro = 0;
		int fim=0;
		
		do{
			System.out.println("Escolha uma Palavra");
			word = in.nextLine();
			if(word.contains(" ") || !word.contains(""))
				System.out.println("Digite apenas uma palavra!");
		}while(word.contains(" ") || !word.contains(""));
		
		System.out.println("Palavra escolhida foi '"+word.toUpperCase()+"'");
		char ch[] = word.toCharArray();
		char descubra[] = new char[ch.length];
		
		for(int i=0; i<ch.length; i++)
			System.out.print("_ ");
		
		do{
			
			System.out.println("Escolha uma letra");
			letra = in.next().charAt(0);
			
			
			for(int i=0; i<ch.length; i++){
				if(ch[i]==letra){
					descubra[i]=ch[i];
					ch[i]=' ';
					fim++;
					System.out.println("A letra '"+letra+"' existe");
					break;
				}
				if(i==(ch.length-1)){
					System.out.println("Não existe a letra '"+letra+"' na palavra");
					erro++;
					System.out.println("Falta "+(5-erro)+" tentativas");
				}	
			}
			
			for(int i=0; i<ch.length; i++){
				if(descubra[i]!='\0')
					System.out.print(descubra[i]+" ");
				else
					System.out.print("_ ");
			}
			
			if(erro == 5){
				System.out.println("Você perdeu! Acabou suas tentativas.");
				break;
			}
			
			System.out.println("");
		}while(fim != ch.length);
		
		System.out.println("");
		if(fim == ch.length)
			System.out.println("Parabéns, você ganhou!");
		System.out.println("A palavra era: "+word.toUpperCase());
		System.out.println("FIM DE JOGO");
		}	
}
