import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class FileReading <T> {

    private String fileName;
    private List<Double> xCoordinates = new ArrayList<>();
    private List<Double> yCoordinates = new ArrayList<>();

    public FileReading(String fileName) {
        this.fileName = fileName;
    }

    void Load() throws IOException {
        //Field
        BufferedReader reader = new BufferedReader(new FileReader(fileName));

        String line;
        int i = 0;

        //Load data into lists
        while ((line = reader.readLine()) != null)
        {
            String[] splitted = line.split(",");

            xCoordinates.add(Double.parseDouble(splitted[0]));
            yCoordinates.add(Double.parseDouble(splitted[1]));

            i++;

            System.out.println("Hello");
            System.out.println("Will this work?");
        }
    }

    public List<Double> getxCoordinates() {

        return xCoordinates;
    }

    public List<Double> getyCoordinates() {
        return yCoordinates;
    }
}