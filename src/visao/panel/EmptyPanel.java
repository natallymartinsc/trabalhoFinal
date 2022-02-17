package visao.panel;

import java.awt.CardLayout;

import javax.swing.JPanel;

public class EmptyPanel extends JPanel{

	private static final long serialVersionUID = 1L;

	public EmptyPanel() {
		super();
		this.setLayout(new CardLayout());
	}
	
}
