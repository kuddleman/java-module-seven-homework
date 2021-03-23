import java.io.*;
import java.util.*;

public class ListTester {

    public static void main(String[] args) {
        List<EmergencyShelterWaitlist> shelterList = new ArrayList<>();
        fillList(shelterList);

        // Two interesting queries:
        //1. How many people are on the shelterList?
        System.out.println("There are " + shelterList.size() + " people on tonight's waitlist.");

        //2. How many people on the list were born in 1960?
        int count = 0;
        for ( EmergencyShelterWaitlist obj : shelterList) {
            if (obj.getDateOfBirth().substring(6).equals("1960")) {
                count ++;
            }
        }

        System.out.println("The number of people on the waitlist who were born in 1960 is: " + count);


        // Create Map
        //  We'll reassign the position num to begin with 1001
        int newId = 1001;
        Map<String, Object > map = new HashMap<>();
        for ( EmergencyShelterWaitlist obj : shelterList){
                String idStr = Integer.toString(newId);
                obj.setPosition(idStr);
                map.put(idStr, obj);
                newId ++;
        }


    }

    private static void fillList(List<EmergencyShelterWaitlist> list) {
        try(Scanner fileScan = new Scanner(new FileReader(new File("src/shelterList.csv")))) {
            String line = fileScan.nextLine();

            while(fileScan.hasNext()) {
                line = fileScan.nextLine();

                Scanner lineScan = new Scanner(line);
                lineScan.useDelimiter(",");
                String position = lineScan.next();
                String seniorityNumber = lineScan.next();
                String dateOfBirth = lineScan.next();
                String changesId = lineScan.next();
                String srNum = lineScan.next();
                EmergencyShelterWaitlist em = new EmergencyShelterWaitlist( position,
                                                                            seniorityNumber,
                                                                            dateOfBirth,
                                                                            changesId,
                                                                            srNum
                                                                          );
                list.add(em);
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }


}
