package top.redobj.blog.util;

import top.redobj.blog.constants.Constants;

import javax.servlet.http.HttpServletRequest;

public class Utils {
    public static enum CHANGE_MODE {
        READ, WRITE
    }

    /**
     * 获取客户IP地址
     *
     * @param request
     * @return
     * @throws Exception
     */
    public static String getIpAddr(HttpServletRequest request) throws Exception {
        String ip = request.getHeader("X-Real-IP");
        if (ip != null && !ip.isEmpty() && !"unknown".equalsIgnoreCase(ip)) {
            return ip;
        }
        ip = request.getHeader("X-Forwarded-For");
        if (ip != null && !ip.isEmpty() && !"unknown".equalsIgnoreCase(ip)) {
            // 多次反向代理后会有多个IP值，第一个为真实IP。
            int index = ip.indexOf(',');
            if (index != -1) {
                return ip.substring(0, index);
            } else {
                return ip;
            }
        } else {
            return request.getRemoteAddr();
        }
    }

    public static String articleChangeHelper(CHANGE_MODE method, String content) {
        if (method == CHANGE_MODE.READ) {
            return content
                    .replace("\t", Constants.SYMBOL_T)
                    .replace("    ", Constants.SYMBOL_T)
                    .replace("\n", " "+Constants.SYMBOL_BR);

        } else {
            return content.replace(Constants.SYMBOL_T,"&nbsp;&nbsp;&nbsp;&nbsp;");
        }
    }

}
