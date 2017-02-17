import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

public class CalcController implements ActionListener{
private CalcModel theModel;
private CalcView theView;

public CalcController(CalcModel theModel,CalcView theView){
this.theModel=theModel;
this.theView=theView;
this.theView.addCalcListener(new CalcListener());
}
class CalcListener implements ActionListener{
      public void actionPerformed(ActionEvent eve){
		int first=theView.getFN();
		int second=theView.getSN();
		if(eve.getSource()==theView.addition){
			theModel.addTwoNO(first, second);
			theView.setResult(theModel.getRes());
		}
		else if(eve.getSource()==theView.subtraction){
			theModel.subTwoNO(first, second);
			theView.setResult(theModel.getRes());
		}
		else if(eve.getSource()==theView.multiplication){
			theModel.mulTwoNO(first, second);
			theView.setResult(theModel.getRes());
			}
		else if(eve.getSource()==theView.division){
			theModel.divTwoNO(first, second);
			theView.setResult(theModel.getRes());
		}
		else{
			theModel.modTwoNO(first, second);
			theView.setResult(theModel.getRes());
		}
	}

	private String toString(int res) {
		// TODO Auto-generated method stub
		return null;
	}
}
@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	
}
}
