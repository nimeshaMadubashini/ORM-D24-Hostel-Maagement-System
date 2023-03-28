package lk.ijse.hibernate.controller;



import com.jfoenix.controls.JFXTextField;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import lk.ijse.hibernate.utill.nave.Navigation;
import lk.ijse.hibernate.utill.nave.Routes;

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

                Navigation.navigation(Routes.SIGNUP,pane);
        }

        @FXML
        void singInOnAction(ActionEvent event) {

        }

    }


