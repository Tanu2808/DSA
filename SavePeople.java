import java.util.Arrays;

public class SavePeople {
    public int numRescueBoats(int[] people, int limit) {
        int count = 0;
        Arrays.sort(people);
        int i = 0;
        int j = people.length - 1;
        while (i <= j) {
            if (people[i] + people[j] <= limit) 
            {
                count++;
                i++;
                j--;
            }
            else {
                if (people[j] <= limit) j--;
                else i++;
                count++;
            }
        }
        return count;
    }
}
