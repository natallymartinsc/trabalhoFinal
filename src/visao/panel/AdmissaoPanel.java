package visao.panel;

import java.awt.Dimension;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import net.miginfocom.swing.MigLayout;

public class AdmissaoPanel extends JPanel {

	private static final long serialVersionUID = 1L;
	
	private JTextField fieldCpfAdmissao;
	private JTextField fieldNomeAdmissao;
	private JTextField fieldDataNascAdmissao;
	private JCheckBox checkBoxGlutenAdmissao;
	private JCheckBox checkBoxDipironAdmissao;
	private JCheckBox checkBoxFrutosDoMarAdmissao;
	private JCheckBox checkBoxPenicilinaAdmissao;
	private JComboBox<String> comboBoxUnidade;
	private JButton botaoCancelarAdmissao;
	

	public AdmissaoPanel() {
		super();
		this.setLayout(new MigLayout("", "[93.00][250.00,grow][][100.00][100.00]",
				"[][35.00][35.00][35.00][][37.00][][][][][][][27.00]"));

		JLabel labelDadosPaciente = new JLabel("Dados do Paciente: ");
		labelDadosPaciente.setFont(new Font("Tahoma", Font.BOLD, 13));
		this.add(labelDadosPaciente, "cell 0 0,alignx left");

		JLabel labelAlergiasAdmissao = new JLabel("Alergias:");
		labelAlergiasAdmissao.setFont(new Font("Tahoma", Font.BOLD, 13));
		this.add(labelAlergiasAdmissao, "cell 3 0");

		JLabel labelCpfAdmissao = new JLabel("CPF: ");
		labelCpfAdmissao.setFont(new Font("Tahoma", Font.PLAIN, 13));
		labelCpfAdmissao.setHorizontalAlignment(SwingConstants.LEFT);
		this.add(labelCpfAdmissao, "cell 0 1,alignx left");

		fieldCpfAdmissao = new JTextField();
		fieldCpfAdmissao.setFont(new Font("Tahoma", Font.PLAIN, 13));
		this.add(fieldCpfAdmissao, "cell 1 1,growx");
		fieldCpfAdmissao.setColumns(10);

		JCheckBox checkBoxGlutenAdmissao = new JCheckBox("Gl\u00FAten");
		checkBoxGlutenAdmissao.setFont(new Font("Tahoma", Font.PLAIN, 13));
		this.add(checkBoxGlutenAdmissao, "cell 3 1");
		this.setCheckBoxGlutenAdmissao(checkBoxGlutenAdmissao);

		JCheckBox checkBoxDipironaAdmissao = new JCheckBox("Dipirona");
		checkBoxDipironaAdmissao.setFont(new Font("Tahoma", Font.PLAIN, 13));
		this.add(checkBoxDipironaAdmissao, "cell 4 1");
		this.setCheckBoxDipironAdmissao(checkBoxDipironaAdmissao);

		JLabel labelNomeAdmissao = new JLabel("Nome: ");
		labelNomeAdmissao.setFont(new Font("Tahoma", Font.PLAIN, 13));
		this.add(labelNomeAdmissao, "cell 0 2,alignx left");

		fieldNomeAdmissao = new JTextField();
		fieldNomeAdmissao.setFont(new Font("Tahoma", Font.PLAIN, 13));
		this.add(fieldNomeAdmissao, "cell 1 2,growx");
		fieldNomeAdmissao.setColumns(10);

		JCheckBox checkBoxFrutosDoMarAdmissao = new JCheckBox("Frutos do mar");
		checkBoxFrutosDoMarAdmissao.setFont(new Font("Tahoma", Font.PLAIN, 13));
		this.add(checkBoxFrutosDoMarAdmissao, "cell 3 2");
		this.setCheckBoxFrutosDoMarAdmissao(checkBoxFrutosDoMarAdmissao);

		JCheckBox checkBoxPenicilinaAdmissao = new JCheckBox("Penicilina");
		checkBoxPenicilinaAdmissao.setFont(new Font("Tahoma", Font.PLAIN, 13));
		this.add(checkBoxPenicilinaAdmissao, "cell 4 2");
		this.setCheckBoxPenicilinaAdmissao(checkBoxPenicilinaAdmissao);

		JLabel labelDataNascAdmissao = new JLabel("Data Nasc:");
		labelDataNascAdmissao.setFont(new Font("Tahoma", Font.PLAIN, 13));
		this.add(labelDataNascAdmissao, "cell 0 3,alignx left");

		fieldDataNascAdmissao = new JTextField();
		fieldDataNascAdmissao.setFont(new Font("Tahoma", Font.PLAIN, 13));
		this.add(fieldDataNascAdmissao, "cell 1 3,growx");
		fieldDataNascAdmissao.setColumns(10);

		JLabel labelDadosAdmissao = new JLabel("Dados de admiss\u00E3o:");
		labelDadosAdmissao.setFont(new Font("Tahoma", Font.BOLD, 13));
		this.add(labelDadosAdmissao, "cell 0 5");

		JLabel labelUnidadeAdmissao = new JLabel("Unidade: ");
		labelUnidadeAdmissao.setFont(new Font("Tahoma", Font.PLAIN, 13));
		this.add(labelUnidadeAdmissao, "cell 0 6,alignx left");
		this.setComboBoxUnidade(comboBoxUnidade);

		JComboBox<String> comboUnidadeAdmissao = new JComboBox<String>();
		comboUnidadeAdmissao.addItem("");
		comboUnidadeAdmissao.addItem("Ambulatório");
		comboUnidadeAdmissao.addItem("Emergência");
		comboUnidadeAdmissao.addItem("UTI");
		this.add(comboUnidadeAdmissao, "cell 1 6,growx");

		JButton botaoSalvarAdmissao = new JButton("Salvar");
		botaoSalvarAdmissao.setFont(new Font("Tahoma", Font.PLAIN, 13));
		botaoSalvarAdmissao.setPreferredSize(new Dimension(100, 25));
		this.add(botaoSalvarAdmissao, "cell 0 12");

		JButton botaoCancelarAdmissao = new JButton("Cancelar");
		botaoCancelarAdmissao.setPreferredSize(new Dimension(100, 25));
		botaoCancelarAdmissao.setFont(new Font("Tahoma", Font.PLAIN, 13));
		this.add(botaoCancelarAdmissao, "cell 1 12");
		this.setBotaoCancelarAdmissao(botaoCancelarAdmissao);

	}


	public JTextField getFieldCpfAdmissao() {
		return fieldCpfAdmissao;
	}


	public void setFieldCpfAdmissao(JTextField fieldCpfAdmissao) {
		this.fieldCpfAdmissao = fieldCpfAdmissao;
	}


	public JTextField getFieldNomeAdmissao() {
		return fieldNomeAdmissao;
	}


	public void setFieldNomeAdmissao(JTextField fieldNomeAdmissao) {
		this.fieldNomeAdmissao = fieldNomeAdmissao;
	}


	public JTextField getFieldDataNascAdmissao() {
		return fieldDataNascAdmissao;
	}


	public void setFieldDataNascAdmissao(JTextField fieldDataNascAdmissao) {
		this.fieldDataNascAdmissao = fieldDataNascAdmissao;
	}


	public JCheckBox getCheckBoxGlutenAdmissao() {
		return checkBoxGlutenAdmissao;
	}


	public void setCheckBoxGlutenAdmissao(JCheckBox checkBoxGlutenAdmissao) {
		this.checkBoxGlutenAdmissao = checkBoxGlutenAdmissao;
	}


	public JCheckBox getCheckBoxDipironAdmissao() {
		return checkBoxDipironAdmissao;
	}


	public void setCheckBoxDipironAdmissao(JCheckBox checkBoxDipironAdmissao) {
		this.checkBoxDipironAdmissao = checkBoxDipironAdmissao;
	}


	public JCheckBox getCheckBoxFrutosDoMarAdmissao() {
		return checkBoxFrutosDoMarAdmissao;
	}


	public void setCheckBoxFrutosDoMarAdmissao(JCheckBox checkBoxFrutosDoMarAdmissao) {
		this.checkBoxFrutosDoMarAdmissao = checkBoxFrutosDoMarAdmissao;
	}


	public JCheckBox getCheckBoxPenicilinaAdmissao() {
		return checkBoxPenicilinaAdmissao;
	}


	public void setCheckBoxPenicilinaAdmissao(JCheckBox checkBoxPenicilinaAdmissao) {
		this.checkBoxPenicilinaAdmissao = checkBoxPenicilinaAdmissao;
	}


	public JComboBox<String> getComboBoxUnidade() {
		return comboBoxUnidade;
	}


	public void setComboBoxUnidade(JComboBox<String> comboBoxUnidade) {
		this.comboBoxUnidade = comboBoxUnidade;
	}


	public JButton getBotaoCancelarAdmissao() {
		return botaoCancelarAdmissao;
	}


	public void setBotaoCancelarAdmissao(JButton botaoCancelarAdmissao) {
		this.botaoCancelarAdmissao = botaoCancelarAdmissao;
	}

	public void limpaTelaAdmissao() {
		fieldCpfAdmissao.setText("");
		fieldNomeAdmissao.setText("");
		fieldDataNascAdmissao.setText("");
		checkBoxGlutenAdmissao.setSelected(false);
		checkBoxDipironAdmissao.setSelected(false);
		checkBoxFrutosDoMarAdmissao.setSelected(false);
		checkBoxPenicilinaAdmissao.setSelected(false);
		comboBoxUnidade.setSelectedIndex(0);
	}

	
	
	
}
