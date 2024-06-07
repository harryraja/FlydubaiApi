package config;


import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import org.json.JSONObject;
import org.json.JSONTokener;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.nio.file.Files;
import java.nio.file.Paths;


public class JsonFileUtil {

	public static String getJsonData(String key,String jsonPath) {
        try {
            ObjectMapper objectMapper = new ObjectMapper();
             System.out.println(jsonPath);
            JsonNode jsonNode = objectMapper.readTree(new File(jsonPath));

            String name = jsonNode.get(key).asText();
            return name;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
    
  

        public static JSONObject getJsonRequestFromFile(String filePath) throws Exception {
            
            String content = new String(Files.readAllBytes(Paths.get(filePath)));
            JSONObject jsonObject = new JSONObject(content);
            return jsonObject;
        }
    

  
}
