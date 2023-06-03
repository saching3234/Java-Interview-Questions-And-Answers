package mypackage;

import java.lang.management.ManagementFactory;
import com.sun.management.OperatingSystemMXBean;

public class CpuMonitor {
    public static void main(String[] args) {
        OperatingSystemMXBean osBean = ManagementFactory.getPlatformMXBean(
            OperatingSystemMXBean.class);
        double cpuTemp = osBean.getSystemLoadAverage();
        System.out.println("CPU temperature: " + cpuTemp + " °C");
    }
}
