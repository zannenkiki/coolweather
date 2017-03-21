package com.zq.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by qiqi on 2017/3/21.
 */

public class Now {
    @SerializedName("tmp")
    public String temperature;

    @SerializedName("cond")
    public More more;

    public class More {

        @SerializedName("txt")
        public String info;

    }
}
