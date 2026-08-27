package utility;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigDataProvider {

    private Properties properties;

    public ConfigDataProvider() {
        properties = new Properties();

        try {
            FileInputStream file = new FileInputStream(
                    "Configuration/config.properties");

            properties.load(file);
            file.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public String getBrowser() {
        return properties.getProperty("browser");
    }

    public String getUrl() {
        return properties.getProperty("url");
    }
}