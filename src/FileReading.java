import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileReading {

    public static void main(String[] args) throws IOException
    {

        //Path filePath = Paths.get("TestData");

        BufferedReader reader = new BufferedReader(new FileReader("TestData"));

        String line = null;

        int count = 1;
        int i = 0;
        int j = 0;
        double partDouble = 0;

        double[] xCoordinates = new double[10];
        double[] yCoordinates = new double[10];

        while ((line = reader.readLine()) != null)
        {
            String[] splitted = line.split(",");

            for(String part : splitted)
            {
                //partDouble = Double.parseDouble(part);
                System.out.println(splitted[0]);
                System.out.println(splitted[1]);
            }

        }
    }
}
