package com.example.bulletin.mapper;

import com.example.bulletin.domain.Bulletin;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository //해당 interface는 저장소임을 명시(mapperscan의 대상)
public interface BulletinMapper {

    int bulletinCount();

    List<Bulletin> getList();

}
