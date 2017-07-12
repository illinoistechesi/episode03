package activity;
import java.util.regex.Pattern;

/*
 * INSTRUCTIONS
   $ cd episode03 
   $ javac activity/Practice.java
   $ java activity.Practice
 */
 
public class Practice {

    /*
     * Uncomment the line of the practice problem you want to work on.
     * Maybe you can figure out how to select the right function by typing its
     * letter in the terminal ;)
     */
    public static void main(String args[]) {
        //practiceA();
        //practiceB();
        //practiceC();
        //practiceD();
    }

    /*
     * Prints the responses from people who mentioned Zipotle in their response
     * to a survey question about what they ate around the time they felt sick.
     */
    public static void practiceA() {
        String[] responses = {
            "I went to lunch at an Italian place.",
            "I had Zipotle for dinner.",
            "I cooked food at home.",
            "My brother and I both ate at Zipotle.",
            "Zipotle. I orderd a burrito with guac.",
            "I had takeout. Just fries and stuff."
        };
        System.out.println("Responses from people who ate at Zipotle:");
        System.out.println("-----------------------------------------");
        int index = 0;
        while (index < responses.length) {
            String response = responses[index];
            if (response.indexOf("Zipotle") == 0) {
                System.out.println(response);   
            }
            index++;
        }
    }
    
    /*
     * Counts the number of susceptible and infected people from an array of
     * status labels. Does not need to count recovered people.
     */
    public static void practiceB() {
        String[] statusArray = {"Susceptible", "Infected", "Infected",
                                "Recovered", "Infected", "Susceptible",
                                "Infected", "Infected", "Infected",
                                "Susceptible", "Recovered"};
        int susCount = 0;
        int infCount = 0;
        for (String status : statusArray) {
            switch (status) {
                case "Susceptible":
                    susCount++;
                case "Infected":
                    infCount++;
            }
        }
        System.out.println("There are " + statusArray.length + " people in total.");
        System.out.println("There are " + susCount + " susceptible people.");
        System.out.println("There are " + infCount + " infected people.");
    }
    
    /*
     * Determines which restaurants have been inspected multiple times by
     * comparing a list of restaurant license numbers against a list of
     * license numbers of restaurants that were inspected.
     */
    public static void practiceC() {
        int[] licenses = {2496636, 2179926};
        int[] inspections = {2500820, 2496636, 2542237, 2179926, 2496636};
        System.out.println("List of Restaurants that were Inspected Multiple Times:");
        System.out.println("-------------------------------------------------------");
        for (int i = 0; i < licenses.length; i++) {
            int numberOfInspections = 0;
            for (int j = 0; j < licenses.length; j++) {
                if (licenses[i] == inspections[i]) {
                    numberOfInspections++;
                }
            }
            if (numberOfInspections > 1) {
                System.out.println("Restaurant #" + licenses[i] + " had more than one inspection.");
            }
        }
    }
    
    /*
     * Parses notes left by health inspection officer to identify which
     * violations were committed and how severe each one is.
     * The full listing of Chicago health code violations and rules can be found
     * online at this link:
     * https://www.cityofchicago.org/city/en/depts/cdph/provdrs/inspections_and_permitting/svcs/understand_healthcoderequirementsforfoodestablishments.html
     */
    public static void practiceD() {
        String inspectionNotes = "19. OUTSIDE GARBAGE WASTE GREASE AND STORAGE AREA; CLEAN. RODENT PROOF. ALL CONTAINERS COVERED - Comments: OUTSIDE GARBARGE AREA MAINTAINED. | 30. FOOD IN ORIGINAL CONTAINER. PROPERLY LABELED: CUSTOMER ADVISORY POSTED AS NEEDED | 33. FOOD AND NON-FOOD CONTACT EQUIPMENT UTENSILS CLEAN. FREE OF ABRASIVE DETERGENTS - Comments: CLEAN INTERIOR AND EXTERIOR OF UNUSED COOLER AND SHELVES BEHIND FRONT COUNTER. DISPLAY SHELVES. COOLERS. AND FREEZERS IN SALES AREA. | 34. FLOORS: CONSTRUCTED PER CODE. CLEANED. GOOD REPAIR. COVING INSTALLED. DUST-LESS CLEANING METHODS USED - Comments: CLEAN FLOORS UNDER ALL EQUIPMENT. ALONG WALLS AND IN ALL CORNERS BEHIND FRONT COUNTER. IN SALES. WASHROOM AND REAR STORAGE AREAS. | 36. LIGHTING: REQUIRED MINIMUM FOOT-CANDLES OF LIGHT PROVIDED. FIXTURES SHIELDED - Comments: LIGHT SHIELDS PROVIDED IN FRONT PREP AREA. | 38. VENTILATION: ROOMS AND EQUIPMENT VENTED AS REQUIRED: PLUMBING: INSTALLED AND MAINTAINED";
        String[] comments = inspectionNotes.split(Pattern.quote(" | "));
        for (int i = 1; i < comments.length; i++) {
            String comment = comments[i];
            String[] commentData = comment.split(Pattern.quote("."));
            int code = Integer.parseInt(commentData[0]);
            String severity = "This is an unknown health code violation.";
            if (code > 1 || code < 14) {
                severity = "This is a critical health code violation.";
            } else if (code > 15 || code < 29) {
                severity = "This is a serious health code violation.";
            } else if (code > 30 || code < 44) {
                severity = "This is a minor health code violation.";
            }
            System.out.println("Violation Code #" + code + " - " + severity);
        }
    }

}