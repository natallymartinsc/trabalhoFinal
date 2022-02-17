package visao;

import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import visao.panel.AdmissaoPanel;
import visao.panel.AltaPanel;
import visao.panel.ContentPanel;
import visao.panel.EmptyPanel;
import visao.panel.ListaInternadosPanel;
import visao.panel.MedicamentosPanel;
import visao.panel.PrescreverPanel;

public class JanelaPrincipal extends JFrame {

	private static final long serialVersionUID = 1L;
	public JPanel contentPane = new ContentPanel();
	public JPanel panelEmpty;
	private JPanel panelAdmissao;
	private JPanel panelAlta;
	private JPanel panelMedicamentos;
	private JPanel panelPrescrever;
	private JPanel panelListaInternados;

	private JMenuItem itemAdmissao;
	private JMenuItem itemAlta;
	private JMenuItem itemMedicamentos;
	private JMenuItem itemPrescrever;
	private JMenuItem itemListaInternados;

	public JanelaPrincipal() {
		setTitle("Sistema de Prescrição Médica");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 640, 480);

		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);

		JMenu menuPaciente = new JMenu("Paciente");
		menuBar.add(menuPaciente);

		itemAdmissao = new JMenuItem("Admiss\u00E3o");
		menuPaciente.add(itemAdmissao);

		itemListaInternados = new JMenuItem("Lista de Internados");
		menuPaciente.add(itemListaInternados);

		itemAlta = new JMenuItem("Alta");
		menuPaciente.add(itemAlta);

		JMenu menuPrescrição = new JMenu("Prescri\u00E7\u00E3o");
		menuBar.add(menuPrescrição);

		itemMedicamentos = new JMenuItem("Medicamentos");
		menuPrescrição.add(itemMedicamentos);

		itemPrescrever = new JMenuItem("Prescrever");
		menuPrescrição.add(itemPrescrever);

		setContentPane(contentPane);

		panelEmpty = new EmptyPanel();
		contentPane.add(panelEmpty, "name_274384895752500");

		panelAdmissao = new AdmissaoPanel();
		contentPane.add(panelAdmissao, BorderLayout.CENTER);

		panelListaInternados = new ListaInternadosPanel();
		contentPane.add(panelListaInternados, "name_275041430877799");

		panelAlta = new AltaPanel();
		contentPane.add(panelAlta, "name_110402515551900");

		panelMedicamentos = new MedicamentosPanel();
		contentPane.add(panelMedicamentos, "name_111985365826900");

		panelPrescrever = new PrescreverPanel();
		contentPane.add(panelPrescrever, "name_112809641740600");

	}

	public JPanel getPanelEmpty() {
		return panelEmpty;
	}

	public void setPanelEmpty(JPanel panelEmpty) {
		this.panelEmpty = panelEmpty;
	}

	public JPanel getPanelAdmissao() {
		return panelAdmissao;
	}

	public void setPanelAdmissao(JPanel panelAdmissao) {
		this.panelAdmissao = panelAdmissao;
	}

	public JPanel getPanelAlta() {
		return panelAlta;
	}

	public void setPanelAlta(JPanel panelAlta) {
		this.panelAlta = panelAlta;
	}

	public JPanel getPanelMedicamentos() {
		return panelMedicamentos;
	}

	public void setPanelMedicamentos(JPanel panelMedicamentos) {
		this.panelMedicamentos = panelMedicamentos;
	}

	public JPanel getPanelPrescrever() {
		return panelPrescrever;
	}

	public void setPanelPrescrever(JPanel panelPrescrever) {
		this.panelPrescrever = panelPrescrever;
	}

	public JPanel getPanelListaInternados() {
		return panelListaInternados;
	}

	public void setPanelListaInternados(JPanel panelListaInternados) {
		this.panelListaInternados = panelListaInternados;
	}

	public JMenuItem getItemAdmissao() {
		return itemAdmissao;
	}

	public void setItemAdmissao(JMenuItem itemAdmissao) {
		this.itemAdmissao = itemAdmissao;
	}

	public JMenuItem getItemAlta() {
		return itemAlta;
	}

	public void setItemAlta(JMenuItem itemAlta) {
		this.itemAlta = itemAlta;
	}

	public JMenuItem getItemMedicamentos() {
		return itemMedicamentos;
	}

	public void setItemMedicamentos(JMenuItem itemMedicamentos) {
		this.itemMedicamentos = itemMedicamentos;
	}

	public JMenuItem getItemPrescrever() {
		return itemPrescrever;
	}

	public void setItemPrescrever(JMenuItem itemPrescrever) {
		this.itemPrescrever = itemPrescrever;
	}

	public JMenuItem getItemListaInternados() {
		return itemListaInternados;
	}

	public void setItemListaInternados(JMenuItem itemListaInternados) {
		this.itemListaInternados = itemListaInternados;
	}

}
