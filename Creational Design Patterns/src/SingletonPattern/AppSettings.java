package SingletonPattern;

public class AppSettings {
    private final String databaseUrl;
    private final String apiKey;
    private static AppSettings appSettings;
    private AppSettings(){
        //Read settings from a config file
        databaseUrl = "jdbc:mysql://localhost:3306/mydatabase";
        apiKey = "12345-ABCDE";
    }

    public static AppSettings getInstance(){
        if (appSettings == null){
            appSettings = new AppSettings();
        }
        return appSettings;
    }

    public String getDatabaseUrl(){
        return databaseUrl;
    }
    public String getApiKey(){
        return apiKey;
    }
}
