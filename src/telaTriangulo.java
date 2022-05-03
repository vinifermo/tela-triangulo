import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class telaTriangulo extends JFrame {

    private JSlider sliA;
    private JSlider sliB;
    private JSlider sliC;
    private JPanel mainPanel;
    private JButton btnVerificar;
    private JPanel mainPanel2;
    private JLabel lblA;
    private JLabel lblB;
    private JLabel lblC;
    private JLabel lblStatus;
    private JLabel lblTipo;

    public static void main(String[] args) {
        JFrame frame = new telaTriangulo();
        frame.setVisible(true);

    }

    public telaTriangulo() {
        mainPanel2.setVisible(false);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setContentPane(mainPanel);
        this.pack();
        btnVerificar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int a = sliA.getValue();
                int b = sliB.getValue();
                int c = sliC.getValue();
                if (a < b + c && b < a + c && c < a + b) {
                    lblStatus.setText("Formam um Triângulo");
                    if (a == b && b == c) {
                        lblTipo.setText("Equilátero");
                    } else if (a != b && b != c && a != c) {
                        lblTipo.setText("Escaleno");
                    } else {
                        lblTipo.setText("Isoceles");

                    }
                } else {
                    lblStatus.setText("Não formam um Triângulo");
                    lblTipo.setText("----------");

                }
                mainPanel2.setVisible(true);


            }
        });
        sliA.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                lblA.setText(Integer.toString(sliA.getValue()));
            }
        });
        sliB.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                lblB.setText(Integer.toString(sliB.getValue()));
            }
        });
        sliC.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                lblC.setText(Integer.toString(sliC.getValue()));
            }
        });
    }
}
