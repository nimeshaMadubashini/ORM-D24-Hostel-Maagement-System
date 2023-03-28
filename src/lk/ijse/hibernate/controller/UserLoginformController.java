package lk.ijse.hibernate.controller;



import com.jfoenix.controls.JFXTextField;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import lk.ijse.hibernate.utill.Navigation;
import lk.ijse.hibernate.utill.Routes;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;

public class UserLoginformController {

        @FXML
        private AnchorPane pane;

        @FXML
        private JFXTextField username;

        @FXML
        private JFXTextField password;

        @FXML
        private Label lblusername;

        @FXML
        private Label lblPassword;

        @FXML
        void SignUpOnAction(ActionEvent event) throws IOException, InvocationTargetException {
                Navigation.navigate(Routes.SignUp, pane);
        }

        @FXML
        void singInOnAction(ActionEvent event) {

        }

    }


