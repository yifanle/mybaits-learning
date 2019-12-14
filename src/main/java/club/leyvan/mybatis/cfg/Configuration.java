package club.leyvan.mybatis.cfg;

import java.util.HashMap;
import java.util.Map;

/**
 * @Auther: http://www.leyvan.club
 * @Date: 2019/12/13
 * @Description: club.leyvan.mybaits.cfg
 * @version: 1.0
 */
public class Configuration {
    private String url;
    private String driver;
    private String username;
    private String password;

    private Map<String,Mapper> mappers = new HashMap<String, Mapper>();

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getDriver() {
        return driver;
    }

    public void setDriver(String driver) {
        this.driver = driver;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Map<String, Mapper> getMappers() {
        return mappers;
    }

    public void setMappers(Map<String, Mapper> mappers) {
        this.mappers.putAll(mappers);
    }
}
