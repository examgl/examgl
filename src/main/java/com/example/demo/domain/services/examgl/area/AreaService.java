package com.example.demo.domain.services.examgl.area;

import com.example.demo.domain.models.examgl.Area;

import java.util.List;

/*
Create By: Ron Rith
Create Date: 2/27/2018
*/
public interface AreaService {

    List<Area> getAllArea();

    void saveArea(Area area);

    Area getAreaBayId(Long id);
}
