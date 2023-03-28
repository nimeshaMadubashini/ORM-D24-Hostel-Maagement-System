package lk.ijse.hibernate.controller;

import com.jfoenix.controls.JFXTextField;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import lk.ijse.hibernate.bo.BOFactory;
import lk.ijse.hibernate.bo.custome.UserBO;
import lk.ijse.hibernate.dto.UserDto;
import lk.ijse.hibernate.utill.nave.Navigation;
import lk.ijse.hibernate.utill.nave.Routes;

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
UserBO userBO= (UserBO) BOFactory.getBoFactory().getBO(BOFactory.BOType.UserSignUp);
    @FXML
    void SignUPOnAction(ActionEvent event) {
        String nic=txtNic.getText();
        String name=txtName.getText();
        String userName=txtUserName.getText();
        String password=txtpassword.getText();
        try {
            boolean isSave= userBO.saveUser(new UserDto(nic,name,userName,password));
            Navigation.navigation(Routes.SIGNING,pane);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

}
