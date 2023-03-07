package com.github.tvbox.osc.wxwz.util;

public class DownloadSelect {
    public enum Select {
        OPEN,
        DOWNLOAD,
        CANCEL
    }

    public static String[] getTypeNames() {
        return new String[] {
                "打开",
                "下载",
                "取消"
                //"服务器消息块"
        };
    }

}
