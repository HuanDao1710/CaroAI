package state;

import java.util.ArrayList;

import cell.Cell;
import setting.Value;



/**
 * Trạng thái trò chơi, cập nhật các nước đi
 */
public class State {
	private int[][] cell; // ma trận trạng thái
	private ArrayList<Cell> moveSteps; // danh sách các bước đã đi
	private int steps; // số ô đã đánh
	
	public State(){
		this.steps = 0;
		this.moveSteps = new ArrayList<Cell>();
		this.cell = new int[Value.SIZE][Value.SIZE];
		for (int i=0; i<Value.SIZE; i++) {
			for(int j=0; j<Value.SIZE; j++) {
				cell[i][j] = 0;
			}
				
		}
	}
	
	public State(int[][] cell){
		this.steps = 0;
		this.moveSteps = new ArrayList<Cell>();
		this.cell = new int[Value.SIZE][Value.SIZE];
		for (int i=0; i<Value.SIZE; i++) {
			for(int j=0; j<Value.SIZE; j++) {
				this.cell[i][j] = cell[i][j];
				if(cell[i][j] != 0) {
					this.moveSteps.add(new Cell(i, j, cell[i][j]));
					this.steps++;
				}
			}
		}
		
	}
	
	/**
	 * cập nhật các nước đi
	 */
	public void update(int x, int y, int player) {
		this.cell[x][y] = player;
		this.moveSteps.add(new Cell(x, y, player));
		this.steps++;
	}
	
	public int[][] getState(){
		return this.cell;
	}
	
	public void setState(int[][] cell) {
		for (int i=0; i<Value.SIZE; i++) {
			for(int j=0; j<Value.SIZE; j++) this.cell[i][j] = cell[i][j];
		}
	}
	
	
	
	
	/**
	 * Kiểm tra người thắng cuộc
	 * @return true: nếu player thắng, false nếu ngược lại
	 */
	public boolean checkWinner(int player) {
		int competitor = 0 ;
		if (player == 1) competitor = 2;
		else if (player == 2) competitor = 1;
		int[] lineX = {1, 1, 0, 1};  // |các đường cần kiểm tra(ngang, dọc, chéo xuống trái, chéo lên phải)
		int[] lineY = {0, 1, 1, -1}; // |để tìm người thắng
		for (int x = 0; x < Value.SIZE; x++) {
			for (int y = 0; y < Value.SIZE; y++) {
				if(cell[x][y] == player) { // Nếu ô này đã được player chặn => kiểm tra
					// nếu bị chặn 2 đầu thì bỏ qua
					if(y > 0 && y < Value.SIZE - 5 && cell[x][y - 1] == competitor && cell[x][y + 5] == competitor)	break;	
					if(x > 0 && x < Value.SIZE - 5 && cell[x - 1][y ] == competitor && cell[x + 5][y ] == competitor) break;
					if(x > 0 && y > 0 && x < Value.SIZE - 5 && y < Value.SIZE - 5 && cell[x - 1][y - 1] == competitor && cell[x + 5][y + 5] == competitor) break;
					if(x > 0 && y > 4 && x < Value.SIZE - 5 && y < Value.SIZE - 1 && cell[x - 1][y + 1] == competitor && cell[x + 5][y - 5] == competitor) break;
					for (int i = 0; i < 4; i++) { // kiểm tra 4 đường
						int count = 1; // count = 5 => player chiến thắng
						for(int j = 1; j <= 4; j++) { // kiểm tra 4 ô tiếp theo
							int vtx = x + lineX[i]*j; // vị trí x của ô tiếp theo cần check
							int vty = y + lineY[i]*j; // vị trí y của ô tiếp theo cần check
							// vtx hoặc vty < 0 hoặc > Value.SIZE, hoặc ô này != ô đầu => khỏi ktra
							if(vtx < 0 || vty < 0 || vtx >= Value.SIZE || vty >= Value.SIZE) break;
							if(cell[vtx][vty] == player) count++;
							else break;
						}
						if(count == 5) return true; // Player thắng
					}
				}
			}
		}
		return false; // Không ai thắng cả
	}

	/**
	 * Kiểm tra một ô đã có ai đánh chưa
	 */
	public boolean isClickable(int x, int y) {
		if(x >= 0 && x < Value.SIZE && y >= 0 && y < Value.SIZE)
			if(cell[x][y] == 0) return true;
		return false;
	}
	
	/**
	 * Hết ô để đánh
	 */
	public boolean isOver() {
		if(this.steps == Value.SIZE*Value.SIZE) return true;
		else return false;
	}
}
