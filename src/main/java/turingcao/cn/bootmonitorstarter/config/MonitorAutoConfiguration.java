package turingcao.cn.bootmonitorstarter.config;

import org.springframework.boot.autoconfigure.AutoConfigureOrder;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.Ordered;
import turingcao.cn.bootmonitorstarter.bean.MonitorService;

@AutoConfigureOrder(Ordered.HIGHEST_PRECEDENCE)
@Configuration
@EnableConfigurationProperties(MoniterProperties.class)
@ConditionalOnProperty(name = "monitor.enable", havingValue = "true")
public class MonitorAutoConfiguration {
    @Bean
    @ConditionalOnMissingBean(MonitorService.class)
    public MonitorService monitorService(MoniterProperties moniterProperties) {
        return new MonitorService(moniterProperties);
    }
}
