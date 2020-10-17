package day62_Maps;

import java.util.LinkedHashMap;
import java.util.Map;

public class SetEntryForMap {

    public static void main(String[] args) {

        //username and passwords

        Map<String, String> vyTrackCredentials = new LinkedHashMap<>();
        vyTrackCredentials.put("username1", "password1");
        vyTrackCredentials.put("username1", "password1");
        vyTrackCredentials.put("username1", "password1");
        vyTrackCredentials.put("username1", "password1");
        vyTrackCredentials.put("username1", "password1");
        vyTrackCredentials.put("username1", "password1");
        vyTrackCredentials.put("username1", "password1");
        vyTrackCredentials.put("username1", "password1");
        vyTrackCredentials.put("username1", "password1");
        vyTrackCredentials.put("username1", "password1");

        for( Map.Entry<String, String> each : vyTrackCredentials.entrySet() ){
            String userName = each.getKey();
            String passWord = each.getValue();
            System.out.println("Credentials Entered: "+ userName+" - "+passWord);
        }
    }
}
