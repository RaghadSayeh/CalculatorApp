import javax.swing.JOptionPane;

public class CalcModel {

	private int result;
	public void addTwoNO(int FN,int SN){
		 result=FN+SN;
	}
	public void subTwoNO(int FN,int SN){
		 result=FN-SN;
	}
	public void mulTwoNO(int FN,int SN){
		 result=FN*SN;
	}
	public void divTwoNO(int FN,int SN){
		if(SN==0){
			JOptionPane.showMessageDialog(null, "Can not divide by zero");
		}
		 result=FN/SN;
	}
	public void modTwoNO(int FN,int SN){
		 result=FN%SN;
	}
	public int getRes(){
		return result;
	}
	
	
}
