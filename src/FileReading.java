import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class FileReading {

    public static void main(String[] args) throws IOException
    {
        //Field
        BufferedReader reader = new BufferedReader(new FileReader("TestData"));
        String line;
        int i = 0;

        List<Double> xCoordinates = new ArrayList<>();
        List<Double> yCoordinates = new ArrayList<>();

        //Load data into lists
        while ((line = reader.readLine()) != null)
        {
            String[] splitted = line.split(",");

            xCoordinates.add(Double.parseDouble(splitted[0]));
            yCoordinates.add(Double.parseDouble(splitted[1]));

            System.out.println(xCoordinates.get(i) + ", " + yCoordinates.get(i));

            i++;
        }
    }
}