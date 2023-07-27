import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class UserLogs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, LinkedHashMap<String, Integer>> userLogs = new TreeMap<>();
        String input;
        while(!(input=scanner.nextLine()).equals("end")){
            String IP = input.split("\\s+")[0];
            String message = input.split("\\s+")[1];
            String user = input.split("\\s+")[2];

            IP = IP.replace("IP=","");
            user = user.replace("user=","");


            if(!userLogs.containsKey(user)){
                userLogs.put(user,new LinkedHashMap<>());
                userLogs.get(user).put(IP,1);
            } else if (!userLogs.get(user).containsKey(IP)) {
                userLogs.get(user).put(IP,1);
            }else {
                userLogs.get(user).put(IP,userLogs.get(user).get(IP)+1);
            }
        }

        for(String username: userLogs.keySet()){
            System.out.println(username+": ");
            Map<String, Integer> currentIP = userLogs.get(username);
            int ipCount = currentIP.size();
            for(String ip: currentIP.keySet()){
                if(ipCount==1){
                    System.out.println(ip+" => "+currentIP.get(ip)+".");
                }else {
                    System.out.print(ip+" => "+currentIP.get(ip)+", ");
                }
                ipCount--;
            }
        }
    }
}
