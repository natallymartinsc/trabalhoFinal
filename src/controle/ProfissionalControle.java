package controle;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JPanel;

import controle.action.ActionPanelAdmissao;
import dao.ProfissionalDAO;
import modelo.Profissional;
import visao.JanelaPrincipal;

public class ProfissionalControle implements ActionListener{

	private JanelaPrincipal jan;
	private Profissional prof;
	private ProfissionalDAO prodao;
	
	public void Profissional(JanelaPrincipal jan, Profissional prof) {
		this.jan = jan;
		this.prof = prof;
		prodao = new ProfissionalDAO();
		this.jan.getItemAdmissao().addActionListener(this);
		this.jan.getItemListaInternados().addActionListener(this);
		this.jan.getItemAlta().addActionListener(this);
		this.jan.getItemMedicamentos().addActionListener(this);
		this.jan.getItemPrescrever().addActionListener(this);
		ActionPanelAdmissao actionPanelAdmissao = new ActionPanelAdmissao(this.jan,this.prof,this.prodao);
		this.jan.getBotaoCancelarAdmissao().addActionListener(actionPanelAdmissao);
	}
	public ProfissionalControle(JanelaPrincipal jan, Profissional prof) {
		super();
		this.jan = jan;
		this.prof = prof;
		prodao = new ProfissionalDAO();
		this.jan.getItemAdmissao().addActionListener(this);
		this.jan.getItemListaInternados().addActionListener(this);
		this.jan.getItemAlta().addActionListener(this);
		this.jan.getItemMedicamentos().addActionListener(this);
		this.jan.getItemPrescrever().addActionListener(this);
	}
	
	public void actionPerformed(ActionEvent e) {
		
		if(e.getActionCommand().equals("Admissão")) {
			jan.getPanelAdmissao().setVisible(true);
			jan.getPanelListaInternados().setVisible(false);
			jan.getPanelAlta().setVisible(false);
			jan.getPanelMedicamentos().setVisible(false);
			jan.getPanelPrescrever().setVisible(false);
			jan.panel.setVisible(false);
		}
		
		else if(e.getActionCommand().equals("Lista de Internados")) {
			jan.getPanelListaInternados().setVisible(true);
			jan.getPanelAdmissao().setVisible(false);
			jan.getPanelAlta().setVisible(false);
			jan.getPanelMedicamentos().setVisible(false);
			jan.getPanelPrescrever().setVisible(false);
			jan.panel.setVisible(false);
		}
		
		else if(e.getActionCommand().equals("Alta")) {
			jan.getPanelAlta().setVisible(true);
			jan.getPanelAdmissao().setVisible(false);
			jan.getPanelListaInternados().setVisible(false);
			jan.getPanelMedicamentos().setVisible(false);
			jan.getPanelPrescrever().setVisible(false);
			jan.panel.setVisible(false);
		}
		
		else if(e.getActionCommand().equals("Medicamentos")) {
			jan.getPanelMedicamentos().setVisible(true);
			jan.getPanelAdmissao().setVisible(false);
			jan.getPanelListaInternados().setVisible(false);
			jan.getPanelAlta().setVisible(false);
			jan.getPanelPrescrever().setVisible(false);
			jan.panel.setVisible(false);
		}
		
		else if(e.getActionCommand().equals("Prescrever")) {
			jan.getPanelPrescrever().setVisible(true);
			jan.getPanelAdmissao().setVisible(false);
			jan.getPanelListaInternados().setVisible(false);
			jan.getPanelAlta().setVisible(false);
			jan.getPanelMedicamentos().setVisible(false);
			jan.panel.setVisible(false);
		}
	}
	
 
}