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
        
        for (int i = 0; i < lines.size(); i++) {
            
            String[] data = lines.get(i);
            System.out.println((i+1) + ", " + data.length);
            double lat = Double.parseDouble(data[0]);
            double lng = Double.parseDouble(data[1]);
            String name = data[2];
            int license = Integer.parseInt(data[3]);
            boolean passed = data[4] == "true" ? true : false;
            String notes = data[5];
            if (data.length > 6) {
               System.out.println("LONGER");
               System.out.println(data[5]);
               System.out.println(data[6]);
               System.out.println(" ");
            }
            Marker marker = new Marker(lat, lng, name);
            marker.setSize(10);
            markers.add(marker);
            
        }
        
        Helper.writeAtlasData(outfile, markers);
        Helper.closeAllFiles(); // Don't forget this! Otherwise nothing will write.
        
    }


}