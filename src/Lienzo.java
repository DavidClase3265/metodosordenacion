import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.Arrays;
import java.util.Random;

import javax.swing.JPanel;

public class Lienzo extends JPanel {
	
	private static Random r = new Random();			
	private int [] vector = new int[900];			//Hacemos un vector con tamaño 900 que contengan numeros aleatorios
	
	
	
	public Lienzo() {
		
		setPreferredSize(new Dimension(900, 600));  // Dimensiones del panel(lienzo) de dentro de la ventana, cuando ejecutes lo tendras con 
													// 900 de ancho y 600 de alto
													// el dimensions hay que importar
		
		setFocusable(true);				
		addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent e) {			//se ejecuta, keycode es la tecla que se ha tocado, una tecla es vk_i es la
															//constante de pulsar la tecla, si es cierto, se llena el vector
				if (e.getKeyCode() == KeyEvent.VK_I) {
					llenarVector();
					repaint();									// que en algun momento se invoque esta cosa, que se escriba
			}
			else if (e.getKeyCode() == KeyEvent.VK_O) {;
			ordenarVector();
			repaint();									
			
		}	
	}
		});
		
		
		llenarVector();								//invocar el llenar vector
	}
	
	private void llenarVector() {
		for (int i=0; i<vector.length; i++) {
			vector[i] = r.nextInt(600);
		}
	
	}
	
	private void ordenarVector() {
			Arrays.sort(vector);
	}
	
	@Override
	protected void paintComponent(Graphics g) {
		
		super.paintComponent(g);
	
		g.setColor(Color.RED);						//Color rojo
		for (int i=0; i<vector.length;i++)
			g.drawLine(i, 599, i, 599 - vector[i]);
		
		g.drawOval(300, 300, 100, 100);				// Circulo con estas coordenadas, de la esquina superior izq del cuadrado inscrito
													//en el circulo, ahi esta incrito
		
		g.drawRect(300, 300, 100, 100); 			//dibujar cuadrado
	}
	
}
