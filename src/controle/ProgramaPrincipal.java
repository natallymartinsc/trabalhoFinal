package controle;

import modelo.Profissional;
import visao.JanelaPrincipal;

public class ProgramaPrincipal {

public static void main(String[] args) {
		
		JanelaPrincipal j = new JanelaPrincipal();
		j.setVisible(true);
		Profissional p = new Profissional();
		ProfissionalControle prodcon = new ProfissionalControle(j,p);
		
	}
}