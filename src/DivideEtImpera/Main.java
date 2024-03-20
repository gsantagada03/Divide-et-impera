package DivideEtImpera;



/**
 * @author Giuseppe Santagada
 * @version 1.0
 */
public class Main {
	/**
	 * 
	 * @param args parametro che si passa all'interno del metodo main
	 */
	public static void main(String[] args) {
		int numero;
		int[] numeri = {1,2,3,4,5,6};
		ricercaBinaria(numeri, 2);
	}
	
	/**
	 * 
	 * @param numeri l'array che deve essere ciclato
	 * @param numero il numero che corrisponde alla posizione che si vuole scegliere
	 * @return elementoDiMezzo se corrisponde alla ricercaPosizioneNumero
	 * @return -1 se il numero non corrisponde all'elemento di mezzo dopo che è uscito dal ciclo
	 */
	
	/*
	 * Questo metodo serve a trovare la posizione del numero che si passa come parametro 
	 * all'interno dell'array. Se l'elemento di mezzo è uguale al numero inserito, viene stampata
	 * la posizione del numero all'interno dell'array.
	 * Se l'elemento che sta a metà dell'array(chiamato ElementoDiMezzo) è maggiore del numero inserito, si va più a destra,
	 * se invece è minore si va più a sinistra.
	 */
	public static int ricercaBinaria(int []numeri, int numero) {
		int sinistra = 0;
		int destra = numeri.length -1;
		
		for(; sinistra <= destra;) {
			int elementoDiMezzo = (sinistra + destra) /2;
			
			if(numeri[elementoDiMezzo] == numero) {
				System.out.println("La posizione del numero è : " + elementoDiMezzo);
				return elementoDiMezzo;
			}else if(numeri[elementoDiMezzo] > numero) {
				destra = elementoDiMezzo -1;
			}else {
				sinistra = elementoDiMezzo +1;
			}
			
		}
		System.out.println("posizione non trovata");
		return -1;
	}
}
