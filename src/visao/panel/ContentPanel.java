package visao.panel;


import java.awt.CardLayout;

import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class ContentPanel extends JPanel{

	private static final long serialVersionUID = 1L;

	public ContentPanel() {
		super();
		this.setBorder(new EmptyBorder(5, 5, 5, 5));
		this.setLayout(new CardLayout(0, 0));
	}

	
}
