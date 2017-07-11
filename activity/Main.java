package activity;
import java.util.List;
import java.util.ArrayList;
import java.awt.Color;
import tools.Helper;
import tools.Marker;

public class Main {
    
    public static final Marker IIT = new Marker(
        41.8350991, -87.6276149,
        "Illinois Institute of Technology",
        Color.BLACK, 5);
        
    public static void main(String[] args) {
        
        if (args.length != 2) {
            throw new Error("Improper arguments.");
        }
        
        String filename = args[0];
        String outfile = args[1];

        List<Inspection> inspections = Helper.readInspectionsFromFile(filename);
        List<Marker> markers = new ArrayList<Marker>();
        markers.add(IIT);
            
        for (int i = 0; i < inspections.size(); i++) {
            
            Inspection ins = inspections.get(i);
            
            Marker marker = new Marker(ins.getLat(), ins.getLng());
            String text = ins.getName() + ": " + ins.getNotes();
            marker.setText(text);
            if (ins.passed()) {
                marker.setColor(Color.GREEN);
            }
            if (ins.isHighRisk()) {
                marker.setSize(10);
                marker.setColor(Color.RED);
            } else {
                marker.setSize(5);
            }
            markers.add(marker);
            
        }
        
        Helper.writeAtlasData(outfile, markers);
        Helper.closeAllFiles(); // Don't forget this! Otherwise nothing will write.
        
    }


}