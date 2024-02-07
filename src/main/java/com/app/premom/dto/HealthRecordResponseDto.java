package com.app.premom.dto;

import com.app.premom.entity.HealthRecord;
import lombok.Getter;

import java.util.List;

@Getter
public class HealthRecordResponseDto {

    private Long id;
    private float weight;
    private List<Integer> healthInfoList;
    private String healthDiary;
    private int healthState;

    public HealthRecordResponseDto(HealthRecord entity) {
        this.id = entity.getId();
        this.weight = entity.getWeight();
        this.healthInfoList = entity.getHealthInfoList();
        this.healthDiary = entity.getHealthDiary();
        this.healthState = entity.getHealthState();
    }
}
