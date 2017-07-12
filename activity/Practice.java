package activity;

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
            if (response.equals("Zipotle")) {
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

}