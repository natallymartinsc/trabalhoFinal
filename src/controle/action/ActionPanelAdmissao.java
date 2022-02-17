package controle.action;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import visao.panel.AdmissaoPanel;


public class ActionPanelAdmissao implements ActionListener{
	
		private AdmissaoPanel panel;
		
		public ActionPanelAdmissao(AdmissaoPanel panel) {
			this.panel = panel;
		}

		@Override
		public void actionPerformed(ActionEvent e1) {
			switch (e1.getActionCommand()) {
			case "Cancelar":
				this.panel.limpaTelaAdmissao();
				break;
			case "Salvar":
				System.out.println("funcionou");
				break;
			
			//case "Salvar":
				//profissional.setCpfAdmissao(jan.getFieldCpfAdmissao().getText());
				
			
		}

			
		} 

		
		
		
	}


