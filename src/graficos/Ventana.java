package graficos;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JFrame;

public class Ventana extends JFrame{

	public Ventana() {
		this.setTitle("Graficos");
		this.setVisible(true);
		this.setSize(800,800);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(true);
		
	}
	
	@Override
	public void paint(Graphics g) {
		
		super.paint(g);
		
		Graphics2D g2d = (Graphics2D) g.create();
		//CUADRADO
		g2d.setStroke(new BasicStroke(5));
		
		g2d.drawRect(100, 100, 80, 80);
		
		g2d.setColor(Color.ORANGE);
		
		g2d.fillRect(120, 120, 80, 80);
		
		g2d.setColor(Color.GREEN);
		
		//LETRA
		g2d.setFont(new Font("Arial", Font.
				BOLD, 60));
		g2d.drawString("Hola", 150, 200);
		//LINEA
		g2d.drawLine(0, 0, 400, 400);
		
		//OVALO
		g2d.drawOval(100, 200, 90, 190);
		g2d.fillOval(150, 250, 190, 90);
		
		g2d.setColor(Color.MAGENTA);
		g2d.drawOval(300, 400, 100, 100);
		g2d.fillOval(350, 450, 100, 100);
		//CIRCULO
		g2d.drawArc(359, 400, 400, 350, 0, 100);
		g2d.fillArc(300, 200, 350, 0, 0, 360);
		//IMAGEN
		try {
			BufferedImage image = ImageIO.read(new File("negocios.png"));
			g2d.drawImage(image, 500, 150, null);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//POLIGONO
		int[] xs = {400,350,450};
		int[] ys = {200,250,250};
		g2d.setColor(Color.blue);
		g2d.drawPolygon(xs, ys, 3);
		
		int[] xs2 = {420,370,470};
		int[] ys2 = {220,270,270};
		g2d.setColor(Color.YELLOW);
		g2d.fillPolygon(xs2, ys2, 3);
		
		g2d.drawRoundRect(300, 280, 300, 300, 20, 20);
		g2d.fillRoundRect(350, 320, 50,50, 20, 20);
	}

}
