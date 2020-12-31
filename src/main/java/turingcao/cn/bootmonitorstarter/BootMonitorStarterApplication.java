package turingcao.cn.bootmonitorstarter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import turingcao.cn.bootmonitorstarter.bean.MonitorService;

import javax.annotation.Resource;

@SpringBootApplication
public class BootMonitorStarterApplication {

    public static void main(String[] args) {
        SpringApplication.run(BootMonitorStarterApplication.class, args);
    }


}
