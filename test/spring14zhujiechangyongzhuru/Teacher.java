package spring14zhujiechangyongzhuru;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

/*
注解版的常用注入
 */
@Component
public class Teacher {
    @Value("林甜甜")
    private String name;
    @Value("18")
    private int age;
    //余下的就是集合 需要读取xml注入
    @Value("#{friendNames}")
    private List<String> friendNames;
    @Value("#{loverNames}")
    private Set<String> loverNsames;
    @Value("#{score}")
    private Map<String,String> score;
    @Value("#{properties}")
    private Properties properties;
    @Value("#{url.name}")
    private String url;

    @Override
    public String toString() {
        return "Teacher{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", friendNames=" + friendNames +
                ", loverNsames=" + loverNsames +
                ", score=" + score +
                ", properties=" + properties +
                ", url='" + url + '\'' +
                '}';
    }
}
