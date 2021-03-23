import java.io.*;
import java.util.*;

public class ListTester {

    public static void main(String[] args) {
        List<EmergencyShelterWaitlist> shelterList = new ArrayList<>();
        fillList(shelterList);


    }

    private static void fillList(List<EmergencyShelterWaitlist> list) {
        try(Scanner fileScan = new Scanner(new FileReader(new File("HSH_90-day_emergency_shelter_waitlist.csv")))) {
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
