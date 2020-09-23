package com.surin.english;

import java.util.ArrayList;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.HPos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.GridPane;
import javafx.scene.text.TextAlignment;
import javafx.stage.Stage;

public class UI extends Application {
	private ArrayList<String> wordsToLearn = new ArrayList<String>();
	private byte modeJob;
	private final String modeJobTrue = "Selected Mode - TRUE";
	private int correct = 0;
	private int incorrect = 0;
	private boolean correctAnswer = false;
	private boolean firstBoot = true; 
	private String words2[] = new String[2];
	private String tempWord = "";
	Vocabulary vocabulary = new Vocabulary("settings\\vocabulary.txt");
	Statistic statistic = new Statistic();

	@Override
	public void start(Stage primaryStage) throws Exception {
		//Create objects
		GridPane gridPane = new GridPane();
		TextField t_Translate = new TextField();
		Label l_vocabulary = new Label("Download vocabulary - False");
		Label l_mode = new Label("Selected Mode - False");
		MenuItem engToRus = new MenuItem("English to Russian");
		MenuItem rusToEng = new MenuItem("Russian to English");
		MenuItem combined = new MenuItem("Ñombined");
		MenuItem d_vocabulary = new MenuItem("Download vocabulary");
		MenuItem s_vocabulary = new MenuItem("Show vocabulary");
		MenuItem s_statistic = new MenuItem("Show Statistic");
		Menu m_Mode = new Menu("Mode");
		Menu m_File = new Menu("File");
		MenuBar mBar = new MenuBar();
		Button b_Start = new Button("Start");
		Button b_Stop = new Button("Stop");
		Label l_wordToTranslate = new Label("Word to Translate");
		Scene scene = new Scene(gridPane,350,150);
		
		//Configure objects
		l_mode.setTextAlignment(TextAlignment.CENTER);
		gridPane.setVgap(15);
		gridPane.setHgap(15);
		GridPane.setHalignment(t_Translate, HPos.CENTER);
		GridPane.setHalignment(l_wordToTranslate, HPos.CENTER);
		GridPane.setHalignment(b_Start, HPos.CENTER);
		GridPane.setHalignment(b_Stop, HPos.CENTER);
		//gridPane.setGridLinesVisible(true);
		m_Mode.setDisable(true);
		s_vocabulary.setDisable(true);
		s_statistic.setDisable(true);
		t_Translate.setDisable(true);
		b_Start.setDisable(true);

		//Menu
		m_Mode.getItems().add(engToRus);
		m_Mode.getItems().add(rusToEng);
		m_Mode.getItems().add(combined);
		m_File.getItems().add(d_vocabulary);
		m_File.getItems().add(s_vocabulary);
		m_File.getItems().add(s_statistic);
		mBar.getMenus().add(m_File);
		mBar.getMenus().add(m_Mode);
		
		//Scene
		gridPane.add(mBar, 0, 0,2,1);
		gridPane.add(b_Start, 0, 3);
		gridPane.add(b_Stop, 1, 3);
		gridPane.add(l_vocabulary, 1, 1);
		gridPane.add(l_mode, 1, 2);
		gridPane.add(l_wordToTranslate, 0, 1);
		gridPane.add(t_Translate, 0, 2);
		
		s_statistic.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent arg0) {
				statistic.getStatitisticLearn();
				statistic.summary(correct, incorrect);
			}
		});
		
		b_Start.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent arg0) {
				if(firstBoot) {					
					updateUI(l_wordToTranslate);
				}
				firstBoot = false;
			}
		});
		
		b_Stop.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent arg0) {
				statistic.getStatitisticLearn();
				statistic.summary(correct, incorrect);
				m_Mode.setDisable(true);
				s_vocabulary.setDisable(true);
				s_statistic.setDisable(true);
				t_Translate.setDisable(true);
				l_mode.setText("Selected Mode - False");
				l_vocabulary.setText("Download vocabulary - False");
				l_wordToTranslate.setText("Word to Translate");
				correct = 0;
				incorrect = 0;
			}
		});
		
		engToRus.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent arg0) {
				modeJob = 1;
				t_Translate.setDisable(false);
				b_Start.setDisable(false);
				l_mode.setText(modeJobTrue +"\n" + " (English To Russian)");
			}
		});
		
		rusToEng.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent arg0) {
				modeJob = 2;
				t_Translate.setDisable(false);
				b_Start.setDisable(false);
				l_mode.setText(modeJobTrue +"\n" + "(Russian To English)");
			}
		});
		
		combined.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent arg0) {
				modeJob = 3;
				t_Translate.setDisable(false);
				l_mode.setText(modeJobTrue +"\n" + "(Ñombined)");
			}
		});
		
		d_vocabulary.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent arg0) {
				setWordsToLearn();
				s_vocabulary.setDisable(false);
				s_statistic.setDisable(false);
				l_vocabulary.setText("Download vocabulary - TRUE");
				m_Mode.setDisable(false);
			}
		});
		
		s_vocabulary.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent arg0) {
				getWordsToLearn();
			}
		});
		
		
		t_Translate.setOnKeyPressed(new EventHandler<KeyEvent>() {
			@Override
			public void handle(KeyEvent event) {
				if(event.getCode() == KeyCode.ENTER) {
					if(!firstBoot) {
						t_Translate.getText();
						
						/**
						 * When user is translate English to Russian
						 */
						if(modeJob == 1) {
							if(words2[1].equals(t_Translate.getText())) {
								correct++;
								correctAnswer = true;
							}
							else {
								incorrect++;
								correctAnswer = false;
							}
						}
						
						/**
						 * When user is translate Russian to English
						 */
						if(modeJob == 2) {
							if(words2[0].equals(t_Translate.getText())) {
								correct++;
								correctAnswer = true;
							}
							else {
								incorrect++;
								correctAnswer = false;
							}
						}
						statistic.updateStatisticLearn(words2[0]+";"+words2[1]+";"+t_Translate.getText()+";"+correctAnswer);
						t_Translate.setText("");
						updateUI(l_wordToTranslate);
					}
				}
			}
		});
		
		primaryStage.setTitle("Hello, world!");
		primaryStage.setScene(scene);
		primaryStage.show();
	}
	
	public void setWordsToLearn() {
		this.wordsToLearn = vocabulary.startReadFile();
	}
	
	public void getWordsToLearn() {
		System.out.println("\nOutput words for learn");
		for (String string : wordsToLearn) {
			System.out.println(string);
		}
	}
	
	private void updateUI(Label l_wordToTranslate) {
		tempWord = vocabulary.nextWord(wordsToLearn);
		words2 = tempWord.split(";");
		if(modeJob == 1)
			l_wordToTranslate.setText(words2[0]);
		if(modeJob == 2)
			l_wordToTranslate.setText(words2[1]);
	}
}
