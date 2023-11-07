package Presentacion;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class IngresarPersona extends JFrame{
    private JPanel pnlPrincipal;
    private JLabel lblCodigo;
    private JTextField txtCodigo;
    private JLabel lblNombre;
    private JTextField txtNombre;
    private JTextField txtApellido;
    private JLabel lblApellido;
    private JButton btnGuardar;
    private JComboBox cmbIdioma;
    private JLabel lblIdioma;
    private JCheckBox chbTerminos;
    private JLabel lblGenero;
    private JRadioButton rbtMasculino;
    private JRadioButton rbtFemenino;
    private JRadioButton rbtOtro;
    private JRadioButton rbtNoIndicado;

    public IngresarPersona(){
       this.setTitle("Manitas sudadas(Ingresar Personas)");
       this.setContentPane(pnlPrincipal);
       this.setSize(500,300);
       this.setVisible(true);
       this.setLocationRelativeTo(null);
        btnGuardar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String codigo =txtCodigo.getText();
                String nombre = txtNombre.getText();
                String apellido = txtApellido.getText();
                String idioma =cmbIdioma.getSelectedItem().toString();
                String aceptoTerminos = (chbTerminos.isSelected())?"Si":"No"; //Necesito hacer una igualacion a un valor a una variable
                String genero = (rbtMasculino.isSelected())?"Masculino":
                        (rbtFemenino.isSelected())? "Femenino":
                                (rbtOtro.isSelected())? "Otro":
                                        (rbtNoIndicado.isSelected())? "No indicado":"";

                String mensaje = "Tus datos son: \n" +
                        "Codigo: " + codigo + "\n" +
                        "Nombre: " + nombre + "\n" +
                        "Apellido: " + apellido + "\n" +
                        "Idioma: " + idioma + "\n" +
                        "Genero: " + genero + "\n" +
                        "Aceptò Terminos: "+ aceptoTerminos;

                JOptionPane.showMessageDialog(btnGuardar, mensaje);
            }
        });
    }
}
