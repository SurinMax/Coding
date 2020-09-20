package com.surin.english;

import java.util.ArrayList;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class englishLearn extends Application {

	public static void main(String[] args) {
		ArrayList<String> wordsToLearn = new ArrayList<String>();
		System.out.println("Hello, world!");
		Application.launch();
		ReadFile readFile = new ReadFile("settings\\vocabulary.txt");
		wordsToLearn = readFile.startReadFile();
		for (String string : wordsToLearn) {
			System.out.println(string);
		}
		
		
	}
	@Override
	public void start(Stage primaryStage) throws Exception {
		GridPane gridPane = new GridPane();
		Menu menu = new Menu("Mode");
		MenuItem engToRus = new MenuItem("English to Russian");
		MenuItem rusToEng = new MenuItem("Russian to English");
		MenuItem combined = new MenuItem("Ñombined");
		menu.getItems().add(engToRus);
		menu.getItems().add(rusToEng);
		menu.getItems().add(combined);
		MenuBar mBar = new MenuBar();
		mBar.getMenus().add(menu);
		VBox vBox = new VBox(mBar);
		Button bt1 = new Button("bt1");
		Button bt2 = new Button("bt2");
		gridPane.add(mBar, 1, 1,3,1);
		gridPane.add(bt1, 1, 2);
		gridPane.add(bt2, 3, 2);
		Scene scene = new Scene(gridPane);
		primaryStage.setTitle("Hello, world!");
		primaryStage.setScene(scene);
		primaryStage.show();
		
		
	}

}


