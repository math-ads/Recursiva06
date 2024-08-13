package view;
import controller.MultiplicaController;
public class Principal {
	
public static void main(String[] args) {
	int fatorA= 5;
	int fatorB=6;
	MultiplicaController multCont = new MultiplicaController();
	int resp = multCont.produto(fatorA, fatorB);
	System.out.println(resp);
}
}
