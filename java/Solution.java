import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Solution {

    enum Days {
        Su, Mo, Tu, We, Th, Fr, Sa
    }

    public static String compressDays(String [] input)
    {
        String cleanedString = String.join(",", input).replaceAll( "[^A-Z]", "" );
        System.out.println(cleanedString);

        if(cleanedString == "MTWTF")
        {
            return "D";
        }
        else if(cleanedString == "SS")
        {
            return "E";
        }
        else if(cleanedString == "SMTWTFS")
        {
            return "A";
        }
        else {
            HashMap<Days, Integer> daysMap = new HashMap<>();

            for(int i = 0; i < input.length; i++)
            {
                daysMap.put(Days.valueOf(input[i]),(Integer) Days.valueOf(input[i]).ordinal());
                System.out.println(daysMap);
            }
            daysMap = daysMap.entrySet().stream().sorted(Entry.comparingByValue()).collect(Collectors.toMap(Entry::getKey, Entry::getValue,(e1,e2) -> e1, LinkedHashMap::new));
            String tmp = "";
            for(Solution.Days key : daysMap.keySet())
            {
                tmp += key.toString();
            }
            
            return tmp.replaceAll( "[^A-Z]", "" );
        }    
    }

    //public static checkOrdinality

    public static void main(String [] args)
    {
        System.out.println("\n");
        System.out.println("\n");
        String [] array = { "Fr", "Th", "Sa" };
        System.out.println(compressDays(array));
        System.out.println("\n");
        System.out.println("\n");
    }
}