package activity;
import java.util.List;
import java.util.ArrayList;
import java.awt.Color;
import tools.Helper;
import tools.Marker;

public class Main {
    
    public static void main(String[] args) {
        
        String filename = "files/inspections.txt";
        String outfile = "files/markers.txt";

        List<Inspection> inspections = Helper.readInspectionsFromFile(filename);
        List<Marker> markers = new ArrayList<Marker>();
            
        for (int i = 0; i < inspections.size(); i++) {
            
            Inspection ins = inspections.get(i);
            
            Marker marker = new Marker(ins.getLat(), ins.getLng());
            String text = ins.getName();
            marker.setText(text);
            marker.setSize(5);
            markers.add(marker);
            
        }
        
        Helper.writeAtlasData(outfile, markers);
        Helper.closeAllFiles(); // Don't forget this! Otherwise nothing will write.
        
    }

}