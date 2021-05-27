package main.controllers;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ResourceBundle;

import static main.java.Functions.getRandom;

public class GameController implements Initializable {

    @FXML
    private TextField userGuess;

    @FXML
    private Label outputLabel;

    @FXML
    private Label numberOfGuesses;

    private int guessedNumber = getRandom(0,100);
    private int numberOfAttempts = 0;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

        /*this.outputLabel.setText(String.valueOf(guessedNumber));*/

    }

    @FXML
    public void checkValue(){


        if(!userGuess.getText().equals("")){

            int userGuessNumber = Integer.parseInt(userGuess.getText());

            if(userGuessNumber==guessedNumber){

                outputLabel.setText("You guessed right!The number was " + String.valueOf(userGuessNumber));
                numberOfGuesses.setText("You guessed in " + String.valueOf(numberOfAttempts) + " tries");

            }else{

                String position;
                numberOfAttempts++;

                if(userGuessNumber > guessedNumber)
                    position = "high";
                else
                    position = "low";

                outputLabel.setText("Incorrect.The number you guessed is not right!The value is too " + position);

            }

        }

    }
}
