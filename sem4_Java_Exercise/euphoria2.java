import javax.swing.*;

public class euphoria2 extends JFrame{
	JFrame f;
	euphoria2(){
		f=new JFrame();
		JButton b=new JButton("Click ");
		b.setBounds(130,100,100,40);
		add(b);
		setSize(400,500);
		setLayout(null);
		setVisible(true);
	}

	public static void main(String[] args) {
		new euphoria2();
	}
}