package visao.panel;

import java.awt.Dimension;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import net.miginfocom.swing.MigLayout;

public class AltaPanel extends JPanel{
	
	private JTextField fieldCpfAlta;
	private JButton botaoCancelarAlta;
	private JComboBox<String> comboBoxMotivo;

	private static final long serialVersionUID = 1L;

	public AltaPanel() {
		super();
		this.setLayout(new MigLayout("", "[120.00,grow][77.00,grow][180.00,grow][150.00,grow]", "[181.00][][166.00,grow][]"));
		JLabel labelCPFAlta = new JLabel("CPF: ");
		labelCPFAlta.setFont(new Font("Tahoma", Font.PLAIN, 13));
		this.add(labelCPFAlta, "cell 1 0,alignx left,aligny bottom");

		fieldCpfAlta = new JTextField();
		fieldCpfAlta.setFont(new Font("Tahoma", Font.PLAIN, 13));
		this.add(fieldCpfAlta, "cell 2 0,growx,aligny bottom");
		fieldCpfAlta.setColumns(10);

		JLabel labelMotivoAlta = new JLabel("Motivo: ");
		labelMotivoAlta.setFont(new Font("Tahoma", Font.PLAIN, 13));
		this.add(labelMotivoAlta, "cell 1 2,alignx left,aligny top");

		JComboBox<String> comboBoxMotivo = new JComboBox<String>();
		comboBoxMotivo.setFont(new Font("Tahoma", Font.PLAIN, 13));
		comboBoxMotivo.addItem("");
		comboBoxMotivo.addItem("Cura");
		comboBoxMotivo.addItem("Transferência");
		comboBoxMotivo.addItem("Óbito");
		this.add(comboBoxMotivo, "cell 2 2,growx,aligny top");
		this.setComboBoxMotivo(comboBoxMotivo);

		JButton botaoSalvarAlta = new JButton("Salvar");
		botaoSalvarAlta.setPreferredSize(new Dimension(100, 25));
		botaoSalvarAlta.setFont(new Font("Tahoma", Font.PLAIN, 13));
		this.add(botaoSalvarAlta, "flowx,cell 0 3");

		JButton botaoCancelarAlta = new JButton("Cancelar");
		botaoCancelarAlta.setPreferredSize(new Dimension(100, 25));
		botaoCancelarAlta.setFont(new Font("Tahoma", Font.PLAIN, 13));
		this.add(botaoCancelarAlta, "cell 1 3");
		this.setBotaoCancelarAlta(botaoCancelarAlta);

	}

	public JTextField getFieldCpfAlta() {
		return fieldCpfAlta;
	}

	public void setFieldCpfAlta(JTextField fieldCpfAlta) {
		this.fieldCpfAlta = fieldCpfAlta;
	}

	public JButton getBotaoCancelarAlta() {
		return botaoCancelarAlta;
	}

	public void setBotaoCancelarAlta(JButton botaoCancelarAlta) {
		this.botaoCancelarAlta = botaoCancelarAlta;
	}

	public JComboBox<String> getComboBoxMotivo() {
		return comboBoxMotivo;
	}

	public void setComboBoxMotivo(JComboBox<String> comboBoxMotivo) {
		this.comboBoxMotivo = comboBoxMotivo;
	}
	
	public void limpaTelaAlta() {
		fieldCpfAlta.setText("");
		comboBoxMotivo.setSelectedIndex(0);
	}


}
