package controle.action;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import dao.ProfissionalDAO;
import modelo.Profissional;
import visao.JanelaPrincipal;

public class ActionPanelPrescrever implements ActionListener{
	
	private JanelaPrincipal jan;
	//private Profissional profissional;
	//private ProfissionalDAO profissionalDAO;
	
	public ActionPanelPrescrever(JanelaPrincipal janelaPrincipal, Profissional prof, ProfissionalDAO profDao) {
		this.jan = janelaPrincipal;
		//this.profissional = prof;
		//this.profissionalDAO =  profDao;
	}

	@Override
	public void actionPerformed(ActionEvent e5) {
		switch (e5.getActionCommand()) {
		case "Cancelar":
			jan.limpaTelaPrescrever();
			break;
		case "Salvar":
			System.out.println("funcionou");
			
		//case "Salvar":
			//profissional.setCpfAdmissao(jan.getFieldCpfAdmissao().getText());
			
		
	}

		
	} 

}
