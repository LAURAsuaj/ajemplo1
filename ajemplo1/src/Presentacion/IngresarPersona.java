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

    public IngresarPersona(){
       this.setTitle("Manitas sudadas(Ingresar_Personas)");
       this.setContentPane(pnlPrincipal);
       this.setSize(400,300);
       this.setVisible(true);
        btnGuardar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String codigo =txtCodigo.getText();
                String nombre = txtNombre.getText();
                String apellido = txtApellido.getText();

                String mensaje = "Tus datos son: \n" +
                        "Codigo:" + codigo + "\n" +
                        "Nombre:" + nombre + "\n" +
                        "Apellido:" + apellido;


                JOptionPane.showMessageDialog(btnGuardar, mensaje);
            }
        });
    }
}
