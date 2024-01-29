package pl.programujodpodstaw.javafx;

import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Modality;
import javafx.stage.Stage;

import java.io.IOException;

public class FinishedTasksWindow {
    private final int finishedTasks;

    public FinishedTasksWindow(int finishedTasks) {
        this.finishedTasks = finishedTasks;
    }

    public void open() throws IOException {
        Stage stage = new Stage();
        FXMLLoader fxmlLoader = new FXMLLoader(FinishedTasksWindow.class.getResource("finished-tasks-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 400, 200);
        stage.setTitle("Gratulacje!");
        stage.setAlwaysOnTop(true);
        stage.initModality(Modality.APPLICATION_MODAL);
        stage.setScene(scene);
        stage.show();

        FinishedTasksController controller = fxmlLoader.getController();
        controller.updateFinishedTasks(finishedTasks);
    }
}
