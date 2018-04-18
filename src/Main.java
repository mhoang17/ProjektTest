import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.Scene;
import javafx.scene.chart.CategoryAxis;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.ScatterChart;
import javafx.scene.chart.XYChart;
import javafx.scene.chart.XYChart.Series;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

import java.io.IOException;


public class Main extends Application {

    public static void main(String[] args) {
        launch(args);
<<<<<<< HEAD
        System.out.println("No");
=======

        System.out.println("Hello");
>>>>>>> ae7a937672e1e7ccd0d5a04095c209e564bde949
    }

    @Override
    public void start(Stage primaryStage) throws IOException {
        CategoryAxis xAxis = new CategoryAxis();
        NumberAxis yAxis = new NumberAxis();
        ScatterChart scatterChart = new ScatterChart(xAxis, yAxis);
        scatterChart.setData(getChartData());
        scatterChart.setTitle("Tester");
        primaryStage.setTitle("ScatteredChart example");

        StackPane root = new StackPane();
        root.getChildren().add(scatterChart);
        primaryStage.setScene(new Scene(root, 400, 250));
        primaryStage.show();
    }

    private ObservableList<XYChart.Series<String, Double>> getChartData() throws IOException {

        FileReading file = new FileReading("TestData");

        file.Load();

        double xValue = (double) file.getxCoordinates().get(0);
        double yValue = (double) file.getyCoordinates().get(0);

        ObservableList<XYChart.Series<String, Double>> answer = FXCollections.observableArrayList();
        Series<String, Double> aSeries = new Series<String, Double>();
        aSeries.setName("a");

        for (int i = 0; i < file.getxCoordinates().size(); i++) {
            aSeries.getData().add(new XYChart.Data(Double.toString(xValue), yValue));

            xValue = (double) file.getxCoordinates().get(i);
            yValue = (double) file.getyCoordinates().get(i);
        }
        answer.addAll(aSeries);
        return answer;
    }
}

//http://www.java2s.com/Tutorials/Java/JavaFX/0860__JavaFX_ScatterChart.htm