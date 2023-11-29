package com.block.details.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class BuildingInfo {
    private Integer buildingNo;
    private String name;
    private Integer totalFloors;
    private String address;
}
