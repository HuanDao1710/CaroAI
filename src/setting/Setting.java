/**
 * 
 */
package setting;

import java.awt.Color;




public class Setting {
	private Color backgroundColor;
	private Color cellColor;
	private Color xColor;
	private Color oColor;
	private int mode;
	
	public Setting() {
		super();
		this.backgroundColor = Value.BACKGROUND_COLOR;
		this.cellColor = Value.CELL_COLOR;
		this.xColor = Value.USER_TEXT_COLOR;
		this.oColor = Value.AI_TEXT_COLOR;
		this.mode = Value.DEFAULT_MODE;
	}
	
	// setter and getter
	
	public int getMode() {
		return mode;
	}
	public void setMode(int mode) {
		this.mode = mode;
	}

	public Color getBackgroundColor() {
		return backgroundColor;
	}

	public Color getCellColor() {
		return cellColor;
	}

	public Color getxColor() {
		return xColor;
	}

	public Color getoColor() {
		return oColor;
	}
}


