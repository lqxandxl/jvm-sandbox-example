package com.taobao.demo;

/**
 * @author : liqixin
 * @create : 2022-09-12 14-23
 * @Description: Clock
 */
/**
 * 报时的钟
 */
public class Clock {
    //public static Long errorCount = 0l;
    // 日期格式化
    private final java.text.SimpleDateFormat clockDateFormat
            = new java.text.SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

    /**
     * 状态检查
     */
    final void checkState() {
        throw new IllegalStateException("STATE ERROR!");
    }

    /**
     * 获取当前时间
     *
     * @return 当前时间
     */
    final java.util.Date now() {
        return new java.util.Date();
    }

    /**
     * 报告时间
     *
     * @return 报告时间
     */
    final String report() {
        checkState();
        return clockDateFormat.format(now());
    }

    /**
     * 循环播报时间
     */
    final void loopReport() throws InterruptedException {
        while (true) {
            try {
                System.out.println(report());
            } catch (Throwable cause) {
                cause.printStackTrace();
            }
            Thread.sleep(5000);
        }
    }

    public static void main(String... args) throws InterruptedException {
        new Clock().loopReport();
    }

}
