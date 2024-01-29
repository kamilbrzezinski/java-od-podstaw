package pl.programujodpodstaw.javafx;

import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.SelectionMode;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;

import java.io.IOException;

public class TodoListController {

    @FXML
    private TextField todoItem;

    @FXML
    private ListView<String> todoList;

    private int finishedTasks;

    public void initialize() {
        todoList.setOnKeyPressed(this::handleKeyPress);
        todoList.getSelectionModel().setSelectionMode(SelectionMode.MULTIPLE);
    }

    private void handleKeyPress(KeyEvent event) {
        if (event.getCode() == KeyCode.DELETE) {
            onDeleteButtonClick();
        }
    }

    @FXML
    protected void onAddButtonClick() {
        String item = todoItem.getText();

        if (item == null || item.isBlank()) return;

        todoList.getItems().add(item);
        todoItem.clear();
    }

    @FXML
    protected void onDeleteButtonClick() {
        ObservableList<String> items = todoList.getSelectionModel().getSelectedItems();

        if (items.size() == 0) return;

        todoList.getItems().removeAll(items);
    }

    @FXML
    protected void markAsDone() throws IOException {
        ObservableList<String> items = todoList.getSelectionModel().getSelectedItems();
        int numberOfItems = items.size();

        if (numberOfItems == 0) return;

        todoList.getItems().removeAll(items);

        finishedTasks += numberOfItems;

        new FinishedTasksWindow(finishedTasks).open();
    }
}