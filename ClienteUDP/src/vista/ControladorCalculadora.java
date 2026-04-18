package vista;

import entidades.Cliente;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class ControladorCalculadora {

    @FXML private TextField txtIp;
    @FXML private TextField txtPuerto;
    @FXML private TextField txtN1;
    @FXML private TextField txtN2;
    @FXML private Label lblSalida;

    private Cliente cliente = new Cliente();

    private final String IP_SERVIDOR = "192.168.100.83";
    private final int PUERTO = 5000;

    @FXML
    private void sumar() {
        procesarOperacion("sumar");
    }

    @FXML
    private void restar() {
        procesarOperacion("restar");
    }

    @FXML
    private void multiplicar() {
        procesarOperacion("multiplicar");
    }

    @FXML
    private void dividir() {
        procesarOperacion("dividir");
    }

    @FXML
    private void limpiar() {
        txtN1.clear();
        txtN2.clear();
        lblSalida.setText("0.0");
    }

    private void procesarOperacion(String operacion) {
        try {
            String ip = txtIp.getText();
            int puerto = Integer.parseInt(txtPuerto.getText());

            double n1 = Double.parseDouble(txtN1.getText());
            double n2 = Double.parseDouble(txtN2.getText());

            // Usamos los datos dinámicos en lugar de quemar la IP
            String respuesta = cliente.enviar(ip, puerto, n1, n2, operacion);

            lblSalida.setText(respuesta);

        } catch (NumberFormatException e) {
            lblSalida.setText("Error: Datos!");
        } catch (Exception e) {
            lblSalida.setText("Error Red");
            e.printStackTrace();
        }
    }
}