package controle.action;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import visao.panel.AltaPanel;

public class ActionPanelAlta implements ActionListener{
		
		private AltaPanel panel;
		
		public ActionPanelAlta(AltaPanel panel) {
			this.panel = panel;
			
		}

		@Override
		public void actionPerformed(ActionEvent e2) {
			switch (e2.getActionCommand()) {
			case "Cancelar":
				panel.limpaTelaAlta();
				break;
			case "Salvar":
				System.out.println("funcionou");
				
			//case "Salvar":
				//profissional.setCpfAdmissao(jan.getFieldCpfAdmissao().getText());
				
			
		}

			
		} 


}
