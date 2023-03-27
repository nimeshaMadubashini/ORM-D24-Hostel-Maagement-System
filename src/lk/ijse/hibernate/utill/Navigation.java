package lk.ijse.hibernate.utill;

import javafx.fxml.FXMLLoader;
import javafx.scene.control.Alert;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;

public class Navigation {
    private static AnchorPane pane;
    public static void navigate(Routes routes, AnchorPane pane) throws IOException {
        Navigation.pane = pane;
    Navigation.pane.getChildren().clear();
    Stage window = (Stage) Navigation.pane.getScene().getWindow();

    switch (routes) {
        case SignIn:
            window.setTitle("Login Page Form");
            initUI("UserLoginform.fxml");
            break;
        case SignUp:
            window.setTitle("Signup Page Form");
            initUI("LoginForm.fxml");
            break;

        default:
            new Alert(Alert.AlertType.ERROR, "Not suitable UI found!").show();
    }
}
    public static void initUI(String location) throws IOException {
        Navigation.pane.getChildren().add(FXMLLoader.load(Navigation.class.getResource("lk/ijse/hibernate/view" + location)));
    }
}
