package NS;

public class Self extends Cells {

	private int rad=1;

	public Self(int numCell) {
//		cells = new Cell[numCell];
		cells = new Cell[1];
		int i = 0;
//		while (i < cells.length) {
			Cell c = new Cell(nQueen, "0010000000001000000000010001000010000000000000100100000000000100");
		
		cells[0].printCell();
		cells[0].printMeasure(4*nQueen);
	}
	
	public void setSelfMeasure(){
		for (int i = 0; i < cells.length; i++) {
			int[] msr = cells[i].getMeasure();
			for (int j = nQueen*4; j < msr.length; j++) {
				msr[j] = 1;				
			}
			cells[i].setMeasure(msr);
		}
	}

	public void setRad(int rad) {
		this.rad = rad;
	}

	public int getRad() {
		return rad;
	}
}
