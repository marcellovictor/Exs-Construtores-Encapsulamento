
public class Main {

	public static void main(String[] args) {
		
		Data dA1 = new Data(11, 12, 2001);
		Data dA2 = new Data(05, 07, 2021);
		
		Data dB1 = new Data(11, "Dezembro", 2001);
		Data dB2 = new Data(05, "Julho", 2021);
		
		Data dC1 = new Data(365, 242);
		Data dC2 = new Data(366, 350);
		
		
		dA1.imprimeDataPadrao();
		dA2.imprimeDataPadrao();
		
		System.out.println();
		
		dB1.imprimeDataExtenso();
		dB2.imprimeDataExtenso();
		
		System.out.println();
		
		dC1.imprimeContagemDias();
		dC2.imprimeContagemDias();
		
	}

}
