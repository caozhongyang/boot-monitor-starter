package turingcao.cn.bootmonitorstarter.config;

import org.springframework.boot.context.properties.ConfigurationProperties;

import java.util.List;

@ConfigurationProperties(prefix = "monitor")
public class MoniterProperties {
    private Boolean enable;
    private List<String> target;
    private CPU cpu;
    private HDisk hDisk;
    private HTTP http;
    private MEM mem;
    private SQL sql;
    private THREAD thread;

    public Boolean getEnable() {
        return enable;
    }

    public void setEnable(Boolean enable) {
        this.enable = enable;
    }

    public List<String> getTarget() {
        return target;
    }

    public void setTarget(List<String> target) {
        this.target = target;
    }

    public CPU getCpu() {
        return cpu;
    }

    public void setCpu(CPU cpu) {
        this.cpu = cpu;
    }

    public HDisk gethDisk() {
        return hDisk;
    }

    public void sethDisk(HDisk hDisk) {
        this.hDisk = hDisk;
    }

    public HTTP getHttp() {
        return http;
    }

    public void setHttp(HTTP http) {
        this.http = http;
    }

    public MEM getMem() {
        return mem;
    }

    public void setMem(MEM mem) {
        this.mem = mem;
    }

    public SQL getSql() {
        return sql;
    }

    public void setSql(SQL sql) {
        this.sql = sql;
    }

    public THREAD getThread() {
        return thread;
    }

    public void setThread(THREAD thread) {
        this.thread = thread;
    }

    public class CPU {
        private Double thresholdValue;
        private Integer freq;
        private Double percent;

        public Double getThresholdValue() {
            return thresholdValue;
        }

        public void setThresholdValue(Double thresholdValue) {
            this.thresholdValue = thresholdValue;
        }

        public Integer getFreq() {
            return freq;
        }

        public void setFreq(Integer freq) {
            this.freq = freq;
        }

        public Double getPercent() {
            return percent;
        }

        public void setPercent(Double percent) {
            this.percent = percent;
        }
    }

    public class HDisk {
        private Double percent;

        public Double getPercent() {
            return percent;
        }

        public void setPercent(Double percent) {
            this.percent = percent;
        }
    }

    public class HTTP {
        private Integer times;
        private Double thresholdValue;
        private Double avgTime;

        public Integer getTimes() {
            return times;
        }

        public void setTimes(Integer times) {
            this.times = times;
        }

        public Double getThresholdValue() {
            return thresholdValue;
        }

        public void setThresholdValue(Double thresholdValue) {
            this.thresholdValue = thresholdValue;
        }

        public Double getAvgTime() {
            return avgTime;
        }

        public void setAvgTime(Double avgTime) {
            this.avgTime = avgTime;
        }
    }

    public class MEM {
        private Double thresholdValue;
        private Integer freq;
        private Double percent;

        public Double getThresholdValue() {
            return thresholdValue;
        }

        public void setThresholdValue(Double thresholdValue) {
            this.thresholdValue = thresholdValue;
        }

        public Integer getFreq() {
            return freq;
        }

        public void setFreq(Integer freq) {
            this.freq = freq;
        }

        public Double getPercent() {
            return percent;
        }

        public void setPercent(Double percent) {
            this.percent = percent;
        }
    }

    public class SQL {
        private Integer times;
        private Double thresholdValue;
        private Double avgTime;

        public Integer getTimes() {
            return times;
        }

        public void setTimes(Integer times) {
            this.times = times;
        }

        public Double getThresholdValue() {
            return thresholdValue;
        }

        public void setThresholdValue(Double thresholdValue) {
            this.thresholdValue = thresholdValue;
        }

        public Double getAvgTime() {
            return avgTime;
        }

        public void setAvgTime(Double avgTime) {
            this.avgTime = avgTime;
        }
    }

    public class THREAD {
        private Double thresholdValue;

        public Double getThresholdValue() {
            return thresholdValue;
        }

        public void setThresholdValue(Double thresholdValue) {
            this.thresholdValue = thresholdValue;
        }
    }

}
