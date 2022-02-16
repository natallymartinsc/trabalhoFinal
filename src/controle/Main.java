package controle;

import modelo.Profissional;
import visao.JanelaPrincipal;

public class Main {

public static void main(String[] args) {
		
		JanelaPrincipal janelaPrincipal = new JanelaPrincipal();
		janelaPrincipal.setVisible(true);
		Profissional profissional = new Profissional();
		new ProfissionalControle(janelaPrincipal,profissional);
		
	}
}