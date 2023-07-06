package Seminar.HomeWork;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
 
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
public class Seminar22 {
    @SuppressWarnings("unchecked")
    public static void main(String[] args) throws IOException {
        JSONParser jsonParser = new JSONParser();
         
        try (FileReader reader = new FileReader("my.json"))
        {
            //Read JSON file
            Object obj = jsonParser.parse(reader);
 
            JSONArray employeeList = (JSONArray) obj;
            System.out.println(employeeList);
             
            //Iterate over employee array
            employeeList.forEach( emp -> parseEmployeeObject( (JSONObject) emp ) );
 
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ParseException e) {
            e.printStackTrace();
        }  
    }

    private static void parseEmployeeObject(JSONObject employee) 
    {
        //Get employee object within list
        JSONObject employeeObject = (JSONObject) employee.get(employee);
         
        //Get employee first name
        String firstName = (String) employeeObject.get("оценка");    
        System.out.println(firstName);
         
        //Get employee last name
        String lastName = (String) employeeObject.get("предмет");  
        System.out.println(lastName);
         
    }

}
