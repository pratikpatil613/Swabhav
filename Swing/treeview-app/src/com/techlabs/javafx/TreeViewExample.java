package com.techlabs.javafx;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.TreeItem;
import javafx.scene.control.TreeView;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class TreeViewExample extends Application {
	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) {
		TreeItem rootItem = new TreeItem("Engineering college Strem");

		TreeItem compTree = new TreeItem("Computer Engineering Sub");
		compTree.getChildren().add(new TreeItem("Computer Architecture"));
		compTree.getChildren().add(new TreeItem("Operating Systems"));
		compTree.getChildren().add(new TreeItem("Computer Networks"));
		compTree.getChildren().add(new TreeItem("Artificial Intelligence "));

		TreeItem civilTree = new TreeItem("Civil Engineering Sub");
		civilTree.getChildren().add(new TreeItem("Design of RC Structures"));
		civilTree.getChildren().add(new TreeItem("Soil Mechanics & Foundation Engineering"));
		civilTree.getChildren().add(new TreeItem("Design of Steel Structures"));
		civilTree.getChildren().add(new TreeItem("Water Resources Engineering"));

		rootItem.getChildren().add(compTree);
		rootItem.getChildren().add(civilTree);

		TreeView treeView = new TreeView(rootItem);
		// treeView.setRoot(rootItem);

		Scene scene = new Scene((treeView));
		primaryStage.setScene(scene);

		primaryStage.show();

	}

}
