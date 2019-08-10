package com.huluwa.mapper;

import com.huluwa.model.entity.WashLog;
import com.huluwa.model.entity.WashLogExample;
import java.util.List;

public interface WashLogMapper {
    int insert(WashLog record);

    int insertSelective(WashLog record);

    List<WashLog> selectByExample(WashLogExample example);
}