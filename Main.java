import javax.swing.JFrame;
import java.awt.*;



	public class Main{

		public Main(){

		JFrame frame = new JFrame();
		Gamepanel gamepanel = new Gamepanel();




		frame.add(gamepanel);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("SnakeGame");



		frame.pack();
		frame.setVisible(true);
		frame.setLocationRelativeTo(null);
	}

	public static void main(String[] args){

		new Main();

	}
}