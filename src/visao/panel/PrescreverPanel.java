package visao.panel;

import java.awt.Dimension;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import net.miginfocom.swing.MigLayout;

public class PrescreverPanel extends JPanel{

	private JTextField fieldCpfPrescrever;
	private JTextField fieldNomePrescrever;
	private JTextField fieldDataNascPrescrever;
	private JTextField fieldMedNormalPrescrever;
	private JTextField fieldMedProtegidoPrescrever;
	private JCheckBox checkBoxPenicilinaPrescrever;
	private JCheckBox checkBoxGlutenPrescrever;
	private JCheckBox checkBoxFrutosDoMarPrescrever;
	private JCheckBox checkBoxDipironaPrescrever;
	private JButton botaoCancelarPrescrever;

	private JCheckBox checkBoxPenicilinaAlergia;
	private JCheckBox checkBoxGlutenAlergia;
	private JCheckBox checkBoxFrutosDoMarAlergia;
	private JCheckBox checkBoxDipironaAlergia;

	


	private static final long serialVersionUID = 1L;

	public PrescreverPanel() {
		super();
		this.setLayout(new MigLayout("", "[94.00][171.00,grow][41.00][143.00,grow][191.00]","[30.00][16.00][35.00][35.00][30.00][18.00][30.00][43.00][][][][][][]"));

		JLabel labelDadosPacientePrescrever = new JLabel("Dados do Paciente:");
		labelDadosPacientePrescrever.setFont(new Font("Tahoma", Font.BOLD, 13));
		this.add(labelDadosPacientePrescrever, "cell 0 0 2 1");

		JLabel labelAlergiasPrescrever = new JLabel("Alergias:");
		labelAlergiasPrescrever.setFont(new Font("Tahoma", Font.BOLD, 13));
		this.add(labelAlergiasPrescrever, "cell 3 0");

		JLabel labelCPFPrescrever = new JLabel("CPF:");
		labelCPFPrescrever.setFont(new Font("Tahoma", Font.PLAIN, 13));
		this.add(labelCPFPrescrever, "cell 0 2,alignx left");

		fieldCpfPrescrever = new JTextField();
		fieldCpfPrescrever.setFont(new Font("Tahoma", Font.PLAIN, 13));
		this.add(fieldCpfPrescrever, "cell 1 2,growx");
		fieldCpfPrescrever.setColumns(10);

		JCheckBox checkBoxGlutenPrescrever = new JCheckBox("Gl\u00FAten");
		checkBoxGlutenPrescrever.setFont(new Font("Tahoma", Font.PLAIN, 13));
		this.add(checkBoxGlutenPrescrever, "cell 3 2");
		this.setCheckBoxGlutenPrescrever(checkBoxGlutenPrescrever);

		JCheckBox checkBoxDipironaPrescrever = new JCheckBox("Dipirona");
		checkBoxDipironaPrescrever.setFont(new Font("Tahoma", Font.PLAIN, 13));
		this.add(checkBoxDipironaPrescrever, "cell 4 2");
		this.setCheckBoxDipironaPrescrever(checkBoxDipironaPrescrever);

		JLabel labelNomePrescrever = new JLabel("Nome:");
		labelNomePrescrever.setFont(new Font("Tahoma", Font.PLAIN, 13));
		this.add(labelNomePrescrever, "cell 0 3,alignx left");

		fieldNomePrescrever = new JTextField();
		fieldNomePrescrever.setFont(new Font("Tahoma", Font.PLAIN, 13));
		this.add(fieldNomePrescrever, "cell 1 3,growx");
		fieldNomePrescrever.setColumns(10);

		JCheckBox checkBoxFrutosDoMarPrescrever = new JCheckBox("Frutos do mar");
		checkBoxFrutosDoMarPrescrever.setFont(new Font("Tahoma", Font.PLAIN, 13));
		this.add(checkBoxFrutosDoMarPrescrever, "cell 3 3");
		this.setCheckBoxFrutosDoMarPrescrever(checkBoxFrutosDoMarPrescrever);

		JCheckBox checkBoxPenicilinaPrescrever = new JCheckBox("Penicilina");
		checkBoxPenicilinaPrescrever.setFont(new Font("Tahoma", Font.PLAIN, 13));
		this.add(checkBoxPenicilinaPrescrever, "cell 4 3");
		this.setCheckBoxPenicilinaPrescrever(checkBoxPenicilinaPrescrever);

		JLabel labelDataNascPrescrever = new JLabel("Data Nasc:");
		labelDataNascPrescrever.setFont(new Font("Tahoma", Font.PLAIN, 13));
		this.add(labelDataNascPrescrever, "cell 0 4,alignx left");

		fieldDataNascPrescrever = new JTextField();
		fieldDataNascPrescrever.setFont(new Font("Tahoma", Font.PLAIN, 13));
		this.add(fieldDataNascPrescrever, "cell 1 4,growx");
		fieldDataNascPrescrever.setColumns(10);

		JLabel labelPrescriçãoPrescrever = new JLabel("Prescri\u00E7\u00E3o:");
		labelPrescriçãoPrescrever.setFont(new Font("Tahoma", Font.BOLD, 13));
		this.add(labelPrescriçãoPrescrever, "cell 0 6");

		JLabel labelMedicamentoPrescrever = new JLabel("Medicamento:");
		labelMedicamentoPrescrever.setFont(new Font("Tahoma", Font.PLAIN, 13));
		this.add(labelMedicamentoPrescrever, "cell 0 7,alignx trailing");

		fieldMedNormalPrescrever = new JTextField();
		this.add(fieldMedNormalPrescrever, "cell 1 7,growx");
		fieldMedNormalPrescrever.setColumns(10);

		fieldMedProtegidoPrescrever = new JTextField();
		this.add(fieldMedProtegidoPrescrever, "cell 3 7 2 1,growx");
		fieldMedProtegidoPrescrever.setColumns(10);

		JButton botaoSalvarPrescrever = new JButton("Salvar");
		botaoSalvarPrescrever.setPreferredSize(new Dimension(100, 25));
		botaoSalvarPrescrever.setFont(new Font("Tahoma", Font.PLAIN, 13));
		this.add(botaoSalvarPrescrever, "cell 0 13");

		JButton botaoCancelarPrescrever = new JButton("Cancelar");
		botaoCancelarPrescrever.setPreferredSize(new Dimension(100, 25));
		botaoCancelarPrescrever.setFont(new Font("Tahoma", Font.PLAIN, 13));
		this.add(botaoCancelarPrescrever, "cell 1 13");
		this.setBotaoCancelarPrescrever(botaoCancelarPrescrever);

	}

	public JTextField getFieldCpfPrescrever() {
		return fieldCpfPrescrever;
	}

	public void setFieldCpfPrescrever(JTextField fieldCpfPrescrever) {
		this.fieldCpfPrescrever = fieldCpfPrescrever;
	}

	public JTextField getFieldNomePrescrever() {
		return fieldNomePrescrever;
	}

	public void setFieldNomePrescrever(JTextField fieldNomePrescrever) {
		this.fieldNomePrescrever = fieldNomePrescrever;
	}

	public JTextField getFieldDataNascPrescrever() {
		return fieldDataNascPrescrever;
	}

	public void setFieldDataNascPrescrever(JTextField fieldDataNascPrescrever) {
		this.fieldDataNascPrescrever = fieldDataNascPrescrever;
	}

	public JTextField getFieldMedNormalPrescrever() {
		return fieldMedNormalPrescrever;
	}

	public void setFieldMedNormalPrescrever(JTextField fieldMedNormalPrescrever) {
		this.fieldMedNormalPrescrever = fieldMedNormalPrescrever;
	}

	public JTextField getFieldMedProtegidoPrescrever() {
		return fieldMedProtegidoPrescrever;
	}

	public void setFieldMedProtegidoPrescrever(JTextField fieldMedProtegidoPrescrever) {
		this.fieldMedProtegidoPrescrever = fieldMedProtegidoPrescrever;
	}

	public JCheckBox getCheckBoxPenicilinaPrescrever() {
		return checkBoxPenicilinaPrescrever;
	}

	public void setCheckBoxPenicilinaPrescrever(JCheckBox checkBoxPenicilinaPrescrever) {
		this.checkBoxPenicilinaPrescrever = checkBoxPenicilinaPrescrever;
	}

	public JCheckBox getCheckBoxGlutenPrescrever() {
		return checkBoxGlutenPrescrever;
	}

	public void setCheckBoxGlutenPrescrever(JCheckBox checkBoxGlutenPrescrever) {
		this.checkBoxGlutenPrescrever = checkBoxGlutenPrescrever;
	}

	public JCheckBox getCheckBoxFrutosDoMarPrescrever() {
		return checkBoxFrutosDoMarPrescrever;
	}

	public void setCheckBoxFrutosDoMarPrescrever(JCheckBox checkBoxFrutosDoMarPrescrever) {
		this.checkBoxFrutosDoMarPrescrever = checkBoxFrutosDoMarPrescrever;
	}

	public JCheckBox getCheckBoxDipironaPrescrever() {
		return checkBoxDipironaPrescrever;
	}

	public void setCheckBoxDipironaPrescrever(JCheckBox checkBoxDipironaPrescrever) {
		this.checkBoxDipironaPrescrever = checkBoxDipironaPrescrever;
	}

	public JButton getBotaoCancelarPrescrever() {
		return botaoCancelarPrescrever;
	}

	public void setBotaoCancelarPrescrever(JButton botaoCancelarPrescrever) {
		this.botaoCancelarPrescrever = botaoCancelarPrescrever;
	}

	public JCheckBox getCheckBoxPenicilinaAlergia() {
		return checkBoxPenicilinaAlergia;
	}

	public void setCheckBoxPenicilinaAlergia(JCheckBox checkBoxPenicilinaAlergia) {
		this.checkBoxPenicilinaAlergia = checkBoxPenicilinaAlergia;
	}

	public JCheckBox getCheckBoxGlutenAlergia() {
		return checkBoxGlutenAlergia;
	}

	public void setCheckBoxGlutenAlergia(JCheckBox checkBoxGlutenAlergia) {
		this.checkBoxGlutenAlergia = checkBoxGlutenAlergia;
	}

	public JCheckBox getCheckBoxFrutosDoMarAlergia() {
		return checkBoxFrutosDoMarAlergia;
	}

	public void setCheckBoxFrutosDoMarAlergia(JCheckBox checkBoxFrutosDoMarAlergia) {
		this.checkBoxFrutosDoMarAlergia = checkBoxFrutosDoMarAlergia;
	}

	public JCheckBox getCheckBoxDipironaAlergia() {
		return checkBoxDipironaAlergia;
	}

	public void setCheckBoxDipironaAlergia(JCheckBox checkBoxDipironaAlergia) {
		this.checkBoxDipironaAlergia = checkBoxDipironaAlergia;
	}
	
	public void limpaTelaPrescrever() {
		fieldCpfPrescrever.setText("");
		fieldNomePrescrever.setText("");
		fieldDataNascPrescrever.setText("");
		fieldMedNormalPrescrever.setText("");
		checkBoxGlutenAlergia.setSelected(false);
		checkBoxFrutosDoMarAlergia.setSelected(false);
		checkBoxDipironaAlergia.setSelected(false);
		checkBoxPenicilinaAlergia.setSelected(false);

	}

	
	
}
