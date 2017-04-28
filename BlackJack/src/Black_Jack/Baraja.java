package Black_Jack;

import java.awt.*;


public class Baraja {
	public static final int NUM_CARTAS = 52;
	public static final int CPP=13;
	Carta cartas[];
	int proxima;
	
	public Baraja(Image imagenes[]){
		cartas=new Carta[NUM_CARTAS];
		for(int i=0;i<NUM_CARTAS;i++){
			cartas[i]=new Carta(imagenes[i],(i%CPP)+1);
		}
	}
	public void barajar(){
		Carta auxiliar;
		for (int i = 0; i < 100; i++) {
			int p1=(int)(Math.random()*NUM_CARTAS);
			int p2=(int)(Math.random()*NUM_CARTAS);
			auxiliar=cartas[p1];
			cartas[p1]=cartas[p2];
			cartas[p2]=auxiliar;
		}
	}
	public Carta sacar(){
		return cartas[proxima++];
	}
}