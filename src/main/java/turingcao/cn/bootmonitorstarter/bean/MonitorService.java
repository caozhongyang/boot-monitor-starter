package turingcao.cn.bootmonitorstarter.bean;


import com.alibaba.fastjson.JSON;
import lombok.extern.slf4j.Slf4j;
import turingcao.cn.bootmonitorstarter.config.MoniterProperties;

@Slf4j
public class MonitorService {

    public void startMonitor() {
        log.info("开始监控内存 CPU 硬盘 线程 数据库 。。。");
    }

    public MonitorService(MoniterProperties moniterProperties) {
        log.info(JSON.toJSONString(moniterProperties));
        startMonitor();
    }
}
