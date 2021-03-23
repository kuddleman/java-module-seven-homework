import java.util.*;

public class EmergencyShelterWaitlist implements Comparable<EmergencyShelterWaitlist> {
    private String position,
                   seniorityNumber,
                   dateOfBirth,
                   changesId,
                   srNum;

    public EmergencyShelterWaitlist(String position,
                                    String seniorityNumber,
                                    String dateOfBirth,
                                    String changesId,
                                    String srNum) {

        this.position = position;
        this.seniorityNumber = seniorityNumber;
        this.dateOfBirth = dateOfBirth;
        this.changesId = changesId;
        this.srNum = srNum;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getSeniorityNumber() {
        return seniorityNumber;
    }

    public void setSeniorityNumber(String seniorityNumber) {
        this.seniorityNumber = seniorityNumber;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getChangesId() {
        return changesId;
    }

    public void setChangesId(String changesId) {
        this.changesId = changesId;
    }

    public String getSrNum() {
        return srNum;
    }

    public void setSrNum(String srNum) {
        this.srNum = srNum;
    }

    @Override
    public String toString() {
        return "EmergencyShelterWaitlist{" +
                "position='" + position + '\'' +
                ", seniorityNumber='" + seniorityNumber + '\'' +
                ", dateOfBirth='" + dateOfBirth + '\'' +
                ", changesId='" + changesId + '\'' +
                ", srNum='" + srNum + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        EmergencyShelterWaitlist that = (EmergencyShelterWaitlist) o;
        return position.equals(that.position) &&
                seniorityNumber.equals(that.seniorityNumber) &&
                dateOfBirth.equals(that.dateOfBirth) &&
                changesId.equals(that.changesId) &&
                srNum.equals(that.srNum);
    }

    @Override
    public int hashCode() {
        return Objects.hash(position, seniorityNumber, dateOfBirth, changesId, srNum);
    }

    public void process() {
        // code here to process a business
    }

    @Override
    public int compareTo(EmergencyShelterWaitlist otherList) {
        if(dateOfBirth.equals(otherList.dateOfBirth)) {
            return srNum.compareTo(otherList.srNum);
            } else {
            return changesId.compareTo(otherList.changesId);
        }
    }
}
