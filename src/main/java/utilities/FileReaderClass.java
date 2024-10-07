package utilities;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class FileReaderClass {

    private static final String configFile = "src/main/resources/testData.properties";

    public static String readData(String key) {

        String value = "";
        try {

            Properties properties = new Properties();
            File file = new File(configFile);
            if (file.exists()) {
                properties.load(new FileInputStream(file));
                value = properties.getProperty(key);
            }
        } catch (Exception e) {
            //logger.debug("file not found");
        }
        return value;
    }
}
