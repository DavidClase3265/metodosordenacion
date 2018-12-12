import javax.swing.JFrame;

public class Main extends JFrame {

	public Main() {
		setTitle("Metodos de Ordenacion");   			 //Esto sera El titulo de la Ventana
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  //pulsar la "x" de la ventana que finalice el programa
														 // si no lo ahcemos se cierra pero no finaliza el programa
		
		getContentPane().add(new Lienzo());				 // Esto es para hacer un nuevo lienzo
		pack();											 // como el diseño responsible, que ajuste las cosas
	}
	
	public static void main(String[] args) {
		new Main().setVisible(true); 					 //Para que se muestre la ventana

	}

}
