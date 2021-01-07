import javax.swing.*;

public class euphoria1{
	JFrame f;
	euphoria1(){
		f=new JFrame();
		JButton b=new JButton("Click ");
		b.setBounds(130,100,100,40);
		f.add(b);
		f.setSize(400,500);
		f.setLayout(null);
		f.setVisible(true);
	}

	public static void main(String[] args) {
		new euphoria1();
	}
}