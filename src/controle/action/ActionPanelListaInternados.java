package controle.action;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import dao.ProfissionalDAO;
import modelo.Profissional;
import visao.JanelaPrincipal;
import visao.panel.ListaInternadosPanel;

public class ActionPanelListaInternados implements ActionListener{
		
		private ListaInternadosPanel panel;
		
		public ActionPanelListaInternados(ListaInternadosPanel panel) {
			this.panel = panel;
		}

		@Override
		public void actionPerformed(ActionEvent e3) {
			switch (e3.getActionCommand()) {
			case "Cancelar":
				System.out.println("falta o limpar");
				break;
			case "Salvar":
				System.out.println("funcionou");
				
			//case "Salvar":
				//profissional.setCpfAdmissao(jan.getFieldCpfAdmissao().getText());
				
			
		}

			
		} 

}
