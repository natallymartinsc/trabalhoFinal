package visao.panel;

import java.awt.Dimension;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import net.miginfocom.swing.MigLayout;

public class MedicamentosPanel extends JPanel{
	private JTextField fieldCodBarrasMedicamentos;
	private JTextField fieldNomeMedicamentos;
	private JCheckBox checkBoxPenicilinaMedicamentos;
	private JCheckBox checkBoxGlutenMedicamentos;
	private JCheckBox checkBoxFrutosDoMarMedicamentos;
	private JCheckBox checkBoxDipironaMedicamentos;
	private JButton botaoCancelarMedicamentos;

	private static final long serialVersionUID = 1L;

	public MedicamentosPanel() {
		super();
		this.setLayout(new MigLayout("", "[116.00][171.00,grow][143.00][191.00]","[][16.00][35.00][35.00][][37.00][][][][][][][][]"));
		
		JLabel labelDadosMedicamentos = new JLabel("Dados do Medicamento");
		labelDadosMedicamentos.setFont(new Font("Tahoma", Font.BOLD, 13));
		this.add(labelDadosMedicamentos, "cell 0 0 2 1");

		JLabel labelCodigoDeBarrasMedicamentos = new JLabel("C\u00F3d. Barras: ");
		labelCodigoDeBarrasMedicamentos.setFont(new Font("Tahoma", Font.PLAIN, 13));
		this.add(labelCodigoDeBarrasMedicamentos, "cell 0 2,alignx left");

		fieldCodBarrasMedicamentos = new JTextField();
		this.add(fieldCodBarrasMedicamentos, "cell 1 2 2 1,growx");
		fieldCodBarrasMedicamentos.setColumns(10);

		JLabel labelNomeMedicamentos = new JLabel("Nome:");
		labelNomeMedicamentos.setFont(new Font("Tahoma", Font.PLAIN, 13));
		this.add(labelNomeMedicamentos, "cell 0 3,alignx left");

		fieldNomeMedicamentos = new JTextField();
		this.add(fieldNomeMedicamentos, "cell 1 3 2 1,growx");
		fieldNomeMedicamentos.setColumns(10);

		JLabel labelContraindicadoMedicamentos = new JLabel("Contraindicado para as alergias: ");
		labelContraindicadoMedicamentos.setFont(new Font("Tahoma", Font.BOLD, 13));
		this.add(labelContraindicadoMedicamentos, "cell 0 6 2 1");

		JCheckBox checkBoxGlutenMedicamentos = new JCheckBox("Glúten");
		checkBoxGlutenMedicamentos.setFont(new Font("Tahoma", Font.PLAIN, 13));
		this.add(checkBoxGlutenMedicamentos, "cell 0 7");
		this.setCheckBoxGlutenMedicamentos(checkBoxGlutenMedicamentos);

		JCheckBox checkBoxFrutosDoMarMedicamentos = new JCheckBox("Frutos do Mar");
		checkBoxFrutosDoMarMedicamentos.setFont(new Font("Tahoma", Font.PLAIN, 13));
		this.add(checkBoxFrutosDoMarMedicamentos, "cell 1 7");
		this.setCheckBoxFrutosDoMarMedicamentos(checkBoxFrutosDoMarMedicamentos);

		JCheckBox checkBoxPenicilinaMedicamentos = new JCheckBox("Penicilina");
		checkBoxPenicilinaMedicamentos.setFont(new Font("Tahoma", Font.PLAIN, 13));
		this.add(checkBoxPenicilinaMedicamentos, "cell 2 7");
		this.setCheckBoxPenicilinaMedicamentos(checkBoxPenicilinaMedicamentos);

		JCheckBox checkBoxDipironaMedicamentos = new JCheckBox("Dipirona");
		checkBoxDipironaMedicamentos.setFont(new Font("Tahoma", Font.PLAIN, 13));
		this.add(checkBoxDipironaMedicamentos, "cell 3 7");
		this.setCheckBoxDipironaMedicamentos(checkBoxDipironaMedicamentos);

		JButton botaoSalvarMedicamentos = new JButton("Salvar");
		botaoSalvarMedicamentos.setPreferredSize(new Dimension(100, 25));
		botaoSalvarMedicamentos.setFont(new Font("Tahoma", Font.PLAIN, 13));
		this.add(botaoSalvarMedicamentos, "cell 0 13");

		JButton botaoCancelarMedicamentos = new JButton("Cancelar");
		botaoCancelarMedicamentos.setPreferredSize(new Dimension(100, 25));
		botaoCancelarMedicamentos.setFont(new Font("Tahoma", Font.PLAIN, 13));
		this.add(botaoCancelarMedicamentos, "cell 1 13");
		this.setBotaoCancelarMedicamentos(botaoCancelarMedicamentos);

	}

	public JTextField getFieldCodBarrasMedicamentos() {
		return fieldCodBarrasMedicamentos;
	}

	public void setFieldCodBarrasMedicamentos(JTextField fieldCodBarrasMedicamentos) {
		this.fieldCodBarrasMedicamentos = fieldCodBarrasMedicamentos;
	}

	public JTextField getFieldNomeMedicamentos() {
		return fieldNomeMedicamentos;
	}

	public void setFieldNomeMedicamentos(JTextField fieldNomeMedicamentos) {
		this.fieldNomeMedicamentos = fieldNomeMedicamentos;
	}

	public JCheckBox getCheckBoxPenicilinaMedicamentos() {
		return checkBoxPenicilinaMedicamentos;
	}

	public void setCheckBoxPenicilinaMedicamentos(JCheckBox checkBoxPenicilinaMedicamentos) {
		this.checkBoxPenicilinaMedicamentos = checkBoxPenicilinaMedicamentos;
	}

	public JCheckBox getCheckBoxGlutenMedicamentos() {
		return checkBoxGlutenMedicamentos;
	}

	public void setCheckBoxGlutenMedicamentos(JCheckBox checkBoxGlutenMedicamentos) {
		this.checkBoxGlutenMedicamentos = checkBoxGlutenMedicamentos;
	}

	public JCheckBox getCheckBoxFrutosDoMarMedicamentos() {
		return checkBoxFrutosDoMarMedicamentos;
	}

	public void setCheckBoxFrutosDoMarMedicamentos(JCheckBox checkBoxFrutosDoMarMedicamentos) {
		this.checkBoxFrutosDoMarMedicamentos = checkBoxFrutosDoMarMedicamentos;
	}

	public JCheckBox getCheckBoxDipironaMedicamentos() {
		return checkBoxDipironaMedicamentos;
	}

	public void setCheckBoxDipironaMedicamentos(JCheckBox checkBoxDipironaMedicamentos) {
		this.checkBoxDipironaMedicamentos = checkBoxDipironaMedicamentos;
	}

	public JButton getBotaoCancelarMedicamentos() {
		return botaoCancelarMedicamentos;
	}

	public void setBotaoCancelarMedicamentos(JButton botaoCancelarMedicamentos) {
		this.botaoCancelarMedicamentos = botaoCancelarMedicamentos;
	}
	
	public void limpaTelaMedicamentos() {
		fieldCodBarrasMedicamentos.setText("");
		fieldNomeMedicamentos.setText("");
		checkBoxGlutenMedicamentos.setSelected(false);
		checkBoxDipironaMedicamentos.setSelected(false);
		checkBoxFrutosDoMarMedicamentos.setSelected(false);
		checkBoxPenicilinaMedicamentos.setSelected(false);
	}
}
