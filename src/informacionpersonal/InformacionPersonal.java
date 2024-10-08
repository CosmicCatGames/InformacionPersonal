package informacionpersonal;

import javax.swing.*;
import com.toedter.calendar.JCalendar;

public class InformacionPersonal extends JFrame {

    JLabel nombre, apellido, edad, sexo, birthday, telefono, email;
    JTextField cnombre, capellido, cedad, ctelefono, cemail;
    JButton guardar, nuevo;
    JCalendar cbirthday;
    JComboBox<String> csexo;

    public InformacionPersonal() {
        setTitle("Información Personal");
        setSize(800, 580);
        setLayout(null);
        Funciones();
        this.setResizable(false);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public void Funciones() {
        // Inicializamos los componentes, pero usamos las variables de instancia de la clase
        nombre = new JLabel("Nombre(s)");
        nombre.setBounds(30, 30, 100, 25);
        cnombre = new JTextField(20);
        cnombre.setBounds(150, 30, 200, 25);
        
        apellido = new JLabel("Apellido(s)");
        apellido.setBounds(30, 70, 100, 25);
        capellido = new JTextField(20);
        capellido.setBounds(150, 70, 200, 25);
        
        edad = new JLabel("Edad");
        edad.setBounds(30, 110, 100, 25);
        cedad = new JTextField(20);
        cedad.setBounds(150, 110, 50, 25);
        
        sexo = new JLabel("Sexo");
        sexo.setBounds(30, 150, 100, 25);
        String[] items = {"Masculino", "Femenino"};
        csexo = new JComboBox<>(items);
        csexo.setBounds(150, 150, 100, 25);
        
        birthday = new JLabel("Fecha de nacimiento");
        birthday.setBounds(30, 190, 150, 25);
        cbirthday = new JCalendar();
        cbirthday.setBounds(150, 190, 200, 200);
        
        telefono = new JLabel("Telefono");
        telefono.setBounds(30, 410, 100, 25);
        ctelefono = new JTextField(20);
        ctelefono.setBounds(150, 410, 200, 25);
        
        email = new JLabel("Correo Electronico");
        email.setBounds(30, 450, 150, 25);
        cemail = new JTextField(20);
        cemail.setBounds(150, 450, 200, 25);
        
        guardar = new JButton("Guardar");
        guardar.setBounds(400, 500, 100, 30);
        nuevo = new JButton("Nuevo");
        nuevo.setBounds(520, 500, 100, 30);

        add(nombre);
        add(cnombre);
        add(apellido);
        add(capellido);
        add(edad);
        add(cedad);
        add(sexo);
        add(csexo);
        add(birthday);
        add(cbirthday);
        add(telefono);
        add(ctelefono);
        add(email);
        add(cemail);
        add(guardar);
        add(nuevo);
    }

    public static void main(String[] args) {
        new InformacionPersonal();
    }
}
