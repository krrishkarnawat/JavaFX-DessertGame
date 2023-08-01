import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import javafx.application.Platform;
import javafx.geometry.Pos;
import java.util.Random;

public class DessertGame extends Application {
        private int score =0;

        @Override
        public void start(final Stage stage) {

                // Step 3 & 4
                BorderPane borderPane = new BorderPane();
                Scene scene = new Scene(borderPane, 640, 480);
                stage.setTitle("Dessert in the Desert JavaFX Game");

                // Step 5
                Label scoreLabel = new Label("Score: 0");
                borderPane.setTop(scoreLabel);
                BorderPane.setAlignment(scoreLabel, Pos.TOP_LEFT);

                Button exitButton = new Button("Exit");

                exitButton.setOnAction(event -> {
                        Platform.exit();
                });
                borderPane.setBottom(exitButton);
                BorderPane.setAlignment(exitButton, Pos.BOTTOM_RIGHT);
                exitButton.requestFocus();

                // Step 6
                Pane pane = new Pane();
                borderPane.setCenter(pane);
                BorderPane.setAlignment(pane, Pos.CENTER);
                Button newButton = new Button("Dessert");
                Button newButton1 = new Button("Desert");
                Button newButton2 = new Button("Desert");
                Button newButton3 = new Button("Desert");
                Button newButton4 = new Button("Desert");
                Button newButton5 = new Button("Desert");
                Button newButton6 = new Button("Desert");
                Button newButton7 = new Button("Desert");
                pane.getChildren().add(newButton);
                pane.getChildren().add(newButton1);
                pane.getChildren().add(newButton2);
                pane.getChildren().add(newButton3);
                pane.getChildren().add(newButton4);
                pane.getChildren().add(newButton5);
                pane.getChildren().add(newButton6);
                pane.getChildren().add(newButton7);
                Random randGen = new Random();
                Button [] button = new Button[8];
                button[0]=newButton;
                button[1]=newButton1;
                button[2]=newButton2;
                button[3]=newButton3;
                button[4]=newButton4;
                button[5]=newButton5;
                button[6]=newButton6;
                button[7]=newButton7;
                randomizeButtonPositions(randGen,button);
                newButton.setOnAction(event -> {
                        randomizeButtonPositions(randGen,button);
                        score++;
                                Label scoreLabel2 = new Label("Score: "+score);
                                borderPane.setTop(scoreLabel2);
                                BorderPane.setAlignment(scoreLabel2, Pos.TOP_LEFT);
                                exitButton.requestFocus();

                }
                );
                newButton1.setOnAction(event -> {
                        randomizeButtonPositions(randGen,button);
                        score--;
                        Label scoreLabel3 = new Label("Score: "+score);
                        borderPane.setTop(scoreLabel3);
                        BorderPane.setAlignment(scoreLabel3, Pos.TOP_LEFT);
                        exitButton.requestFocus();
                });
                newButton2.setOnAction(event -> {
                        randomizeButtonPositions(randGen,button);
                        score--;
                        Label scoreLabel4 = new Label("Score: "+score);
                        borderPane.setTop(scoreLabel4);
                        BorderPane.setAlignment(scoreLabel4, Pos.TOP_LEFT);
                        exitButton.requestFocus();
                });
                newButton3.setOnAction(event -> {
                        randomizeButtonPositions(randGen,button);
                        score--;
                        Label scoreLabel5 = new Label("Score: "+score);
                        borderPane.setTop(scoreLabel5);
                        BorderPane.setAlignment(scoreLabel5, Pos.TOP_LEFT);
                        exitButton.requestFocus();
                });
                newButton4.setOnAction(event -> {
                        randomizeButtonPositions(randGen,button);
                        score--;
                        Label scoreLabel6 = new Label("Score: "+score);
                        borderPane.setTop(scoreLabel6);
                        BorderPane.setAlignment(scoreLabel6, Pos.TOP_LEFT);
                        exitButton.requestFocus();
                });
                newButton5.setOnAction(event -> {
                        randomizeButtonPositions(randGen,button);
                        score--;
                        Label scoreLabel7 = new Label("Score: "+score);
                        borderPane.setTop(scoreLabel7);
                        BorderPane.setAlignment(scoreLabel7, Pos.TOP_LEFT);
                        exitButton.requestFocus();
                });
                newButton6.setOnAction(event -> {
                        randomizeButtonPositions(randGen,button);
                        score--;
                        Label scoreLabel8 = new Label("Score: "+score);
                        borderPane.setTop(scoreLabel8);
                        BorderPane.setAlignment(scoreLabel8, Pos.TOP_LEFT);
                        exitButton.requestFocus();
                });
                newButton7.setOnAction(event -> {
                        randomizeButtonPositions(randGen,button);
                        score--;
                        Label scoreLabel9 = new Label("Score: "+score);
                        borderPane.setTop(scoreLabel9);
                        BorderPane.setAlignment(scoreLabel9, Pos.TOP_LEFT);
                        exitButton.requestFocus();
                });

                stage.setScene(scene);
                stage.show();
        }
        private void randomizeButtonPositions(Random random, Button[]button){
                for(int i=0; i< button.length; i++){
                        button[i].setLayoutX(random.nextInt(600));
                        button[i].setLayoutY(random.nextInt(400));
                }

        }

        public static void main(String[] args) {
                Application.launch();

        }
}
