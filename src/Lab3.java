import javax.swing. *;
import java.awt.*;



public class Lab3 extends JApplet{
	
	JTextArea t1 = new JTextArea();
	JTextArea t2 = new JTextArea();
	
	JLabel l1= new JLabel("Departing from:");
	JLabel l3 = new JLabel("Departure date");
	JLabel l2= new JLabel("Destination");
	
	JComboBox cbb = new JComboBox();
	JComboBox cbb1 = new JComboBox();
	
	JCheckBox chk1 = new JCheckBox("Round Trip", true);
	
	ButtonGroup bg = new ButtonGroup();
	JRadioButton rb1 = new JRadioButton("Morning");
	JRadioButton rb2 = new JRadioButton("Evening");
		
	public void init() {
		setLayout(new FlowLayout ());
		add(l1);
		add(cbb);
			cbb.addItem("Set Destination");
			cbb.addItem("Dallas");
			cbb.addItem("Wash DC");
			cbb.addItem("Seattle");
			cbb.addItem("Oklahoma City");
		add(l2);
		add(cbb1);
			cbb1.addItem("Set Destination");
			cbb1.addItem("Dallas");
			cbb1.addItem("Wash DC");
			cbb1.addItem("Seattle");
			cbb1.addItem("Oklahoma City");
		this.setSize(getPreferredSize());
		
		add(l3);
		add(chk1);
		//add(bg);
			bg.add(rb1);
			bg.add(rb2);
		add(l3);
			
		/*add(tf1);
		add(ta1);
			ta1.setBackground(Color.blue);
			ta1.setWrapStyleWord(true);
			ta1.setLineWrap(true);
			*/
			
			
		
	}

}
