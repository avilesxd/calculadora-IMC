import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class IMC extends JFrame implements ActionListener {
    JLabel Jlabeltext, Jlabeltext2, Jlabeltext3;
    JTextArea Txarea, Txarea2, Txarea3;
    JButton Jboton;

    public IMC() {
        int ANCHO = 400, LARGO = 290;
        setTitle("Calculadora de IMC");
        setSize(ANCHO, LARGO);
        setLayout(null);
        setVisible(true);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        paneles();
    }

    public void paneles() {
        panel1();
        panel2();
        panel3();
    }

    public void panel1() {
        Jlabeltext = new JLabel("Altura (centrimetros)");
        Jlabeltext.setBounds(10, 5, 280, 40);
        add(Jlabeltext);
        Txarea = new JTextArea();
        Txarea.setBounds(150, 15, 180, 18);
        add(Txarea);

        Jlabeltext2 = new JLabel("Peso (Kg)");
        Jlabeltext2.setBounds(20, 80, 280, 40);
        add(Jlabeltext2);
        Txarea2 = new JTextArea();
        Txarea2.setBounds(150, 90, 180, 18);
        add(Txarea2);
    }

    public void panel2() {
        Jlabeltext3 = new JLabel("Indice Masa Corporal");
        Jlabeltext3.setBounds(20, 140, 280, 40);
        add(Jlabeltext3);

        Txarea3 = new JTextArea();
        Txarea3.setEditable(false);
        Txarea3.setBounds(200, 150, 80, 18);
        add(Txarea3);
    }

    public void panel3() {
        Jboton = new JButton("Calcular IMC");
        Jboton.setBounds(170, 190, 150, 40);
        Jboton.addActionListener(this);
        add(Jboton);
    }

    public double totalIMC() {
        double altura = Double.parseDouble(Txarea.getText());
        double peso = Double.parseDouble(Txarea2.getText());
        return peso / (altura * altura);
    }

    public static void main(String[] args) {
        new IMC();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == Jboton) {
            Txarea3.setText(String.format("%.5f",totalIMC()));
        }
    }
}
