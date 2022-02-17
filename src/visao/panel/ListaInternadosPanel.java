package visao.panel;

import java.awt.Dimension;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.ScrollPaneConstants;

import net.miginfocom.swing.MigLayout;

public class ListaInternadosPanel extends JPanel {

	private JButton botaoCancelarListaInternados;

	private static final long serialVersionUID = 1L;

	public ListaInternadosPanel() {
		super();
		this.setLayout(new MigLayout("", "[263.00,grow][101.00,grow][117.00,grow][128.00]", "[][grow][]"));
		JLabel lblNewLabel = new JLabel("Nome:");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 13));
		this.add(lblNewLabel, "cell 0 0");

		JLabel labelUnidadeInternados = new JLabel("Unidade:");
		labelUnidadeInternados.setFont(new Font("Tahoma", Font.BOLD, 13));
		this.add(labelUnidadeInternados, "cell 1 0");

		JLabel labelDataNascInternados = new JLabel("Data Nasc:");
		labelDataNascInternados.setFont(new Font("Tahoma", Font.BOLD, 13));
		this.add(labelDataNascInternados, "cell 2 0");

		JLabel labelAlergiasInternados = new JLabel("Alergias:");
		labelAlergiasInternados.setFont(new Font("Tahoma", Font.BOLD, 13));
		this.add(labelAlergiasInternados, "cell 3 0");

		JScrollPane scroolPaneNomeInternados = new JScrollPane();
		this.add(scroolPaneNomeInternados, "cell 0 1,grow");

		JTextArea textAreaNomeInternados = new JTextArea();
		scroolPaneNomeInternados.setViewportView(textAreaNomeInternados);
		scroolPaneNomeInternados.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);

		JScrollPane scroolPaneUnidadeInternados = new JScrollPane();
		this.add(scroolPaneUnidadeInternados, "cell 1 1,grow");

		JTextArea textAreaUnidadeInternados = new JTextArea();
		scroolPaneUnidadeInternados.setViewportView(textAreaUnidadeInternados);
		scroolPaneUnidadeInternados.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);

		JScrollPane scrollPaneDataNascInternados = new JScrollPane();
		this.add(scrollPaneDataNascInternados, "cell 2 1,grow");

		JTextArea textAreaDataNascInternados = new JTextArea();
		scrollPaneDataNascInternados.setViewportView(textAreaDataNascInternados);
		scrollPaneDataNascInternados.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);

		JScrollPane scrollPaneAlergiasInternados = new JScrollPane();
		this.add(scrollPaneAlergiasInternados, "cell 3 1,grow");

		JTextArea textAreaAlergiasInternados = new JTextArea();
		scrollPaneAlergiasInternados.setViewportView(textAreaAlergiasInternados);
		scrollPaneAlergiasInternados.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);

		JButton buttonSalvarInternados = new JButton("Salvar");
		buttonSalvarInternados.setPreferredSize(new Dimension(100, 25));
		buttonSalvarInternados.setFont(new Font("Tahoma", Font.PLAIN, 13));
		this.add(buttonSalvarInternados, "flowx,cell 0 2");

		JButton botaoCancelarInternados = new JButton("Cancelar");
		botaoCancelarInternados.setPreferredSize(new Dimension(100, 25));
		botaoCancelarInternados.setFont(new Font("Tahoma", Font.PLAIN, 13));
		this.add(botaoCancelarInternados, "cell 0 2");
		this.setBotaoCancelarListaInternados(botaoCancelarListaInternados);

	}

	public JButton getBotaoCancelarListaInternados() {
		return botaoCancelarListaInternados;
	}

	public void setBotaoCancelarListaInternados(JButton botaoCancelarListaInternados) {
		this.botaoCancelarListaInternados = botaoCancelarListaInternados;
	}

}
