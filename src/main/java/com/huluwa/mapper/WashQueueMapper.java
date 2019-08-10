package com.huluwa.mapper;

import com.huluwa.model.entity.WashQueue;
import com.huluwa.model.entity.WashQueueExample;
import java.util.List;

public interface WashQueueMapper {
    int insert(WashQueue record);

    int insertSelective(WashQueue record);

    List<WashQueue> selectByExample(WashQueueExample example);
}