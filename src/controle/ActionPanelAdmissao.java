package controle;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import dao.ProfissionalDAO;
import modelo.Profissional;
import visao.JanelaPrincipal;


public class ActionPanelAdmissao implements ActionListener{
	
		private JanelaPrincipal jan;
		//private Profissional profissional;
		//private ProfissionalDAO profissionalDAO;
		
		public ActionPanelAdmissao(JanelaPrincipal janelaPrincipal, Profissional prof, ProfissionalDAO profDao) {
			this.jan = janelaPrincipal;
			//this.profissional = prof;
			//this.profissionalDAO =  profDao;
		}

		@Override
		public void actionPerformed(ActionEvent e1) {
			switch (e1.getActionCommand()) {
			case "Cancelar":
				jan.limpaTelaAdmissao();
				break;
			case "Salvar":
				System.out.println("funcionou");
				
			//case "Salvar":
				//profissional.setCpfAdmissao(jan.getFieldCpfAdmissao().getText());
				
			
		}

			
		} 

		
		
		
	}


