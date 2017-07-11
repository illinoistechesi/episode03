import java.util.List;
import java.util.ArrayList;
import java.awt.Color;
import tools.Helper;
import tools.Marker;

public class Main {

    public static void main(String[] args) {
        
        String filename = args[0];
        String outfile = args[1];
        
        List<String[]> lines = Helper.readCSV(filename);
        //List<Inspection> inspections = Helper.readInspectionsFromFile(filename);
        List<Marker> markers = new ArrayList<Marker>();
        
        for (int i = 0; i < lines.size(); i++) {
            
            String[] data = lines.get(i);
            
            double lat = Double.parseDouble(data[0]);
            double lng = Double.parseDouble(data[1]);
            String name = data[2];
            int license = Integer.parseInt(data[3]);
            boolean passed = data[4].equals("true") ? true : false;
            int daysSince = Integer.parseInt(data[5]);
            System.out.println(daysSince + " days since: " + name);
            String notes = data[6];
            String text = name + ": " + notes;
            
            Marker marker = new Marker(lat, lng, text);
            marker.setSize(10);
            if (passed) {
                marker.setColor(Color.GREEN);
            }
            markers.add(marker);
            
        }
        
        Helper.writeAtlasData(outfile, markers);
        Helper.closeAllFiles(); // Don't forget this! Otherwise nothing will write.
        
    }


}