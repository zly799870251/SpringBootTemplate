package com.zhangly.template.util;

import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.MySqlMapper;

/**
 * Created by 青葉 on 2017/4/19.
 */
public interface BaseMapper<T> extends Mapper<T>,MySqlMapper<T> {
    // fixme 该接口不应该被扫描到，会出错
}
