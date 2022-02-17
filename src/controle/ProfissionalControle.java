package controle;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import controle.action.ActionPanelAdmissao;
import controle.action.ActionPanelAlta;
import dao.ProfissionalDAO;
import modelo.Profissional;
import visao.JanelaPrincipal;
import visao.panel.AdmissaoPanel;
import visao.panel.AltaPanel;
import visao.panel.ListaInternadosPanel;

public class ProfissionalControle implements ActionListener{

	private JanelaPrincipal jan;
	private Profissional prof;
	private ProfissionalDAO prodao;
	
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
		setAdmissaoActions();
		setAltaActions();
		setListaInternadosActions();
		
	}
	
	private void setAdmissaoActions() {
		AdmissaoPanel panel = (AdmissaoPanel) this.jan.getPanelAdmissao();
		ActionPanelAdmissao actionPanelAdmissao = new ActionPanelAdmissao(panel);
		panel.getBotaoCancelarAdmissao().addActionListener(actionPanelAdmissao);
		
	}
	
	private void setAltaActions() {
		AltaPanel panel = (AltaPanel) this.jan.getPanelAlta();
		ActionPanelAlta actionPanelAdmissao = new ActionPanelAlta(panel);
		panel.getBotaoCancelarAlta().addActionListener(actionPanelAdmissao);
		
	}
	
//	private void setListaInternadosActions() {
	//	ListaInternadosPanel panel = (ListaInternadosPanel) this.jan.getPanelListaInternados();
	//	ActionPanelListaInternados actionPanelAdmissao = new ActionPanelAlta(panel);
	//	panel.getBotaoCancelarAlta().addActionListener(actionPanelAdmissao);

	//}

	public void actionPerformed(ActionEvent e) {
		
		if(e.getActionCommand().equals("Admissão")) {
			jan.getPanelAdmissao().setVisible(true);
			jan.getPanelListaInternados().setVisible(false);
			jan.getPanelAlta().setVisible(false);
			jan.getPanelMedicamentos().setVisible(false);
			jan.getPanelPrescrever().setVisible(false);
			jan.panelEmpty.setVisible(false);
		}
		
		else if(e.getActionCommand().equals("Lista de Internados")) {
			jan.getPanelListaInternados().setVisible(true);
			jan.getPanelAdmissao().setVisible(false);
			jan.getPanelAlta().setVisible(false);
			jan.getPanelMedicamentos().setVisible(false);
			jan.getPanelPrescrever().setVisible(false);
			jan.panelEmpty.setVisible(false);
		}
		
		else if(e.getActionCommand().equals("Alta")) {
			jan.getPanelAlta().setVisible(true);
			jan.getPanelAdmissao().setVisible(false);
			jan.getPanelListaInternados().setVisible(false);
			jan.getPanelMedicamentos().setVisible(false);
			jan.getPanelPrescrever().setVisible(false);
			jan.panelEmpty.setVisible(false);
		}
		
		else if(e.getActionCommand().equals("Medicamentos")) {
			jan.getPanelMedicamentos().setVisible(true);
			jan.getPanelAdmissao().setVisible(false);
			jan.getPanelListaInternados().setVisible(false);
			jan.getPanelAlta().setVisible(false);
			jan.getPanelPrescrever().setVisible(false);
			jan.panelEmpty.setVisible(false);
		}
		
		else if(e.getActionCommand().equals("Prescrever")) {
			jan.getPanelPrescrever().setVisible(true);
			jan.getPanelAdmissao().setVisible(false);
			jan.getPanelListaInternados().setVisible(false);
			jan.getPanelAlta().setVisible(false);
			jan.getPanelMedicamentos().setVisible(false);
			jan.panelEmpty.setVisible(false);
		}
	}
	
 
}