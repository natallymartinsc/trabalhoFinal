package controle.action;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import dao.ProfissionalDAO;
import modelo.Profissional;
import visao.JanelaPrincipal;

public class ActionPanelMedicamentos implements ActionListener{
	
	private JanelaPrincipal jan;
	//private Profissional profissional;
	//private ProfissionalDAO profissionalDAO;
	
	public ActionPanelMedicamentos(JanelaPrincipal janelaPrincipal, Profissional prof, ProfissionalDAO profDao) {
		this.jan = janelaPrincipal;
		//this.profissional = prof;
		//this.profissionalDAO =  profDao;
	}

	@Override
	public void actionPerformed(ActionEvent e4) {
		switch (e4.getActionCommand()) {
		case "Cancelar":
			jan.limpaTelaMedicamentos();
			break;
		case "Salvar":
			System.out.println("funcionou");
			
		//case "Salvar":
			//profissional.setCpfAdmissao(jan.getFieldCpfAdmissao().getText());
			
		
	}

		
	} 




}
