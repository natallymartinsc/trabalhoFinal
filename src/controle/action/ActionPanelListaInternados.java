package controle.action;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import dao.ProfissionalDAO;
import modelo.Profissional;
import visao.JanelaPrincipal;

public class ActionPanelListaInternados implements ActionListener{
		
		private JanelaPrincipal jan;
		//private Profissional profissional;
		//private ProfissionalDAO profissionalDAO;
		
		public ActionPanelListaInternados(JanelaPrincipal janelaPrincipal, Profissional prof, ProfissionalDAO profDao) {
			this.jan = janelaPrincipal;
			//this.profissional = prof;
			//this.profissionalDAO =  profDao;
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
