package practical1;

public class CollegeConfig {

    private static CollegeConfig instance;

    private String collegeName;
    private String systemVersion;

    private CollegeConfig() {
        collegeName = "PCPS College";
        systemVersion = "1.0";
    }

    public static CollegeConfig getInstance() {

        if (instance == null) {
            instance = new CollegeConfig();
        }

        return instance;
    }

    public String getCollegeName() {
        return collegeName;
    }

    public String getSystemVersion() {
        return systemVersion;
    }
}