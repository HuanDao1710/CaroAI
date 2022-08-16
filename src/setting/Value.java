/**
 * 
 */
package setting;

import java.awt.Color;

public class Value {

	public static final String INFO_MESSAGE = 
		  "Trường: Đại học Bách Khoa Hà Nội\n"
		+ "Môn: Nhập Môn Trí Tuệ Nhân Tạo\n"
		+ "Giảng viên: PGS.TS Lê Thanh Hương\n"
		+ "Đề tài: Game cờ caro sử dụng thuật toán cắt tỉa alpha beta\n"
		+ "Thành viên thực hiện:\n"
		+ " Trần Tuấn Anh - 20193983\n"
		+ " Lại Anh Duy - 2019xxxx\n"
		+ " Trịnh Duy Trường - 2019xxxx\n"
		+ " Đào Quang Huân - 20194064\n";
	
	public static final String INTRODUCE_MESSAGE = 
		"\t\t\t\t\tLuật chơi"
		+ "\r\n" 
		+"Ban đầu loại cờ này được chơi bằng các quân cờ vây (quân cờ màu trắng và đen) "
		+ "trên một bàn cờ vây (19x19)."
		+"\n"
		+ "Quân đen đi trước và người chơi lần lượt đặt một "
		+ "quân cờ của họ trên giao điểm còn trống."
		+ "\n"
		+ "Người thắng là người đầu tiên có được một "
		+ "chuỗi liên tục gồm 4 quân hàng ngang, hoặc dọc, hoặc chéo không bị chặn đầu nào."
		+ "\n"
		+ "Nếu bị chặn một đầu thì người đó cần có chuỗi 5 quân liên tục mới thắng."
		+ "\n"
		+ "Nếu chuỗi 5 quân liên tục bị chặn cả hai đầu thì trò chơi tiếp tục.Một khi đã đặt xuống, "
		+ "các quân cờ không thể di chuyển hoặc bỏ ra khỏi bàn, do đó loại cờ này có thể chơi bằng giấy bút."
		+ "\n"
		+ "Ở Việt Nam, cờ này thường chơi trên giấy tập học sinh (đã có sẵn các ô ca-rô), "
		+ "dùng bút đánh dấu hình tròn (O) và chữ X để đại diện cho 2 quân cờ."
		+ "\n"
		+ "\t\t\t\t\t\t\tSource: wikipedia.com";
	
	/**
	 *  số hàng/số cột mặc định
	 */
	public static final int SIZE = 19;
	/**
	 *  chế độ chơi mặc định: User đi trước
	 */
	public static final int DEFAULT_MODE = 0; 
	/**
	 *  độ rộng của mỗi cell
	 */
	public static final int CELL_WIDTH = 30; 
	/**
	 *  khoảng cách giữa các panel 
	 */
	public static final int MARGIN = 10; 
	/**
	 *  cỡ chữ trong mỗi cell
	 */
	public static final int TEXT_CELL_SIZE = 20; 
	/**
	 *  màu chữ mặc định của X
	 */
	public static final Color USER_TEXT_COLOR = Color.red; 
	/**
	 *  màu chữ mặc định của O
	 */
	public static final Color AI_TEXT_COLOR = Color.green; 
	/**
	 *  màu mặc định của mỗi ô vuông
	 */
	public static final Color CELL_COLOR = Color.white; 
	
	/**
	 * màu mặc định khi user click vào một ô trong bàn c�?
	 */
	public static final Color CLICK_CELL_COLOR = Color.pink;
	/**
	 * màu n�?n mặc định
	 */
	public static final Color BACKGROUND_COLOR = Color.white; 
	/**
	 * Giá trị mặc định của USER
	 */
	public static final int USER_VALUE = 1;
	/**
	 * Giá trị mặc định của AI
	 */
	public static final int AI_VALUE = 2;
	/**
	 * Độ sâu tìm kiếm tối đa
	 */
	public static final int MAX_DEPTH = 7;
	/**
	 * số lượng lấy ra tối đa của danh sách các ô được lượng giá cao nhất
	 */
	public static final int MAX_NUM_OF_HIGHEST_CELL_LIST = 8;
}
