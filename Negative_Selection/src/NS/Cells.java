package NS;



public class Cells {
	protected Cell[] cells;
	private int filled = 0;
	protected int nQueen = 8;

	public Cells() {

	}

	public void addCell(Cell c) {
		cells[this.getFilled()] = c;
		this.setFilled(this.getFilled() + 1);
	}

	public boolean isAllow(int[] cellMeasure) {
		boolean allow = true;
		for (int i = 0; i < this.getFilled(); i++) {
			if (cells[i].measureDistance(cellMeasure, 0, nQueen * 2) == nQueen) {
				allow = false;
				break;
			}
		}
		return allow;
	}
	
	public Cell[] getCells() {
		return cells;
	}
	public void setCells(Cell[] cells) {
		this.cells = cells;
	}

	protected void setFilled(int filled) {
		this.filled = filled;
	}

	protected int getFilled() {
		return filled;
	}
	

}