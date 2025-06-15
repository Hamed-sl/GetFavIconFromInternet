import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

public class Controller implements Initializable {

    @FXML private Button btn_get;
    @FXML private TextField tf_get;
    @FXML private ImageView imageView;
    @FXML private ListView<String> listView;
    @FXML private Button btn_show;

    @Override
    public void initialize(URL location, ResourceBundle resources) {

        favIcon favIcon = new favIcon();
        List<String> list = new ArrayList<>();


        btn_get.setOnAction(event -> {
            favIcon.saveImage(tf_get.getText());
            list.add(tf_get.getText());
        });

        btn_show.setOnAction(event -> {
            ObservableList<String> olist = FXCollections.observableList(list);
            listView.setItems(olist);
        });

        String selectedImageName = listView.getSelectionModel().getSelectedItem();
        listView.setOnMouseClicked(event -> {
            Image image = new Image(
                    this.getClass().getResourceAsStream("/favicon/" + selectedImageName + ".jpg"));
            imageView.setImage(image);
        });

    }
}
