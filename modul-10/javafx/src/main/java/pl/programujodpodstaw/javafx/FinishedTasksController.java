package pl.programujodpodstaw.javafx;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import org.apache.commons.lang3.StringUtils;

public class FinishedTasksController {
    @FXML
    private Label finishedTasksLabel;

    public void updateFinishedTasks(int finishedTasks) {
        String text = "Tyle zadań udało Ci się ukończyć: " + finishedTasks + ". Gratulacje!";
        StringUtils.capitalize(text);
        finishedTasksLabel.setText(text);
    }
}
