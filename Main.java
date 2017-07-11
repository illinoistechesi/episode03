import java.util.List;
import java.util.ArrayList;
import tools.Helper;
import tools.Marker;

public class Main {

    public static void main(String[] args) {
        
        String filename = args[0];
        String outfile = args[1];
        
        List<String[]> lines = Helper.readCSV(filename);
        List<Marker> markers = new ArrayList<Marker>();
        
        for (int i = 0; i < 20; i++) {
            
            String[] data = lines.get(i);
            String id = data[0];
            String lat = data[1];
            String lng = data[2];
            String cuisine = data[3];
            // Skip item 4: is part of the restaurant name
            String name = data[5];
            String owner = data[6];
            String inspected = data[7];
            String acceptsCard = data[8];
            System.out.println(name);
            
            double latitude = Double.parseDouble(lat);
            double longitude = Double.parseDouble(lng);
            Marker marker = new Marker(latitude, longitude, name);
            marker.setSize(10);
            markers.add(marker);
            
        }
        
        Helper.writeAtlasData(outfile, markers);
        Helper.closeAllFiles(); // Don't forget this! Otherwise nothing will write.
        
    }


}