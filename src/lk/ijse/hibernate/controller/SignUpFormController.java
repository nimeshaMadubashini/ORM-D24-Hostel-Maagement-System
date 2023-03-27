package lk.ijse.hibernate.controller;

import com.jfoenix.controls.JFXTextField;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;

public class SignUpFormController {
    @FXML
    private AnchorPane pane;

    @FXML
    private JFXTextField txtNic;

    @FXML
    private JFXTextField txtName;

    @FXML
    private JFXTextField txtUserName;

    @FXML
    private JFXTextField txtpassword;

    @FXML
    private Label lblNic;

    @FXML
    private Label lblName;

    @FXML
    private Label lbluserName;

    @FXML
    private Label lblPassword;

    @FXML
    void SignUpOnAction(ActionEvent event) {

    }

}
