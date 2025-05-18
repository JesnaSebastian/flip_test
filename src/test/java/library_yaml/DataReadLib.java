package library_yaml;

import org.yaml.snakeyaml.Yaml;

import java.io.File;
import java.io.FileReader;
import java.io.Reader;
import java.util.Map;

public class DataReadLib {
    public String getJsonFromYamlFile(String fileName, String key) {
        Map<String, String> jsonMap = null;
        try {
            String path = System.getProperty("user.dir") + File.separator + "testData" + File.separator + fileName + ".yaml";
            Yaml yaml = new Yaml();
            Reader fileReader = new FileReader(path);
            jsonMap = yaml.load(fileReader);

        } catch (Exception e) {
            e.printStackTrace();
        }
        return jsonMap.get(key).toString();
    }
}

