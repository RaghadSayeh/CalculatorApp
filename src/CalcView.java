import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionListener;
import javax.swing.*;

public class CalcView extends JFrame{
	JTextField firstNo=new JTextField(10);
	JTextField secondNo=new JTextField(10);
	JButton addition =new JButton("add");
	JButton subtraction =new JButton("sub");
    JButton multiplication =new JButton("multiply");
    JButton division =new JButton("divide");
	JButton mod =new JButton("mod");
	private JLabel estimate=new JLabel("Result");
	JTextField res=new JTextField(10);
	CalcView(){
		super("Simple Calculator");
		JPanel calculatorPan=new JPanel();
		JPanel temp=new JPanel();
		temp.setLayout(new GridLayout(5,1));
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setSize(500,500);
		this.setLocationRelativeTo(null);
		temp.add(addition);
		temp.add(subtraction);
		temp.add(multiplication);
		temp.add(division);
		temp.add(mod);
		getContentPane().setLayout(new FlowLayout());
		add(temp,BorderLayout.CENTER);
		calculatorPan.add(firstNo);
		calculatorPan.add(secondNo);
		calculatorPan.add(estimate);
		calculatorPan.add(res);
		calculatorPan.add(temp);
		this.add(calculatorPan);
		}
	public int getFN(){
		return Integer.parseInt(firstNo.getText());
	}
	public int getSN(){
		return Integer.parseInt(secondNo.getText());
	}
	public int getRES(){
		return Integer.parseInt(res.getText());
	}
	public void setResult(int Myresult){
		res.setText(Integer.toString(Myresult));
	}
	public void addCalcListener(ActionListener event) {
		addition.addActionListener(event);
		subtraction.addActionListener(event);
		multiplication.addActionListener(event);
		division.addActionListener(event);
		mod.addActionListener(event);
		
	}
		
		
	//}
}
