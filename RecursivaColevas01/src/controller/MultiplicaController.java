package controller;

public class MultiplicaController {
  public MultiplicaController() {
	  super();
  }
  
  public int produto( int fatorA, int  fatorB) {
	  
	  if(fatorB== 0) {
		  return 0;
	  }
  
 else {
	
	return  fatorA + produto(fatorA, fatorB-1);
	
}

  }
}

