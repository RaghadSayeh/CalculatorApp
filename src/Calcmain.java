
public class Calcmain {

	public static void main(String[] args) {
	CalcView theV=new CalcView();
	CalcModel theM=new CalcModel();
	CalcController theC=new CalcController(theM,theV);
    theV.setVisible(true);
	}

}
