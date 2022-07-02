package com.example.bulletin.service;

import com.example.bulletin.domain.Bulletin;
import com.example.bulletin.mapper.BulletinMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@RequiredArgsConstructor //Mapper 생성자 사용할 수 있게 함
@Transactional(readOnly = true)
public class BulletinService { //bulletinmapper > bulletinmapper.xml통해 반환된 값들을 controller로 넘겨줌
    public final BulletinMapper bulletinMapper; 

    public int bulletinCount(){return bulletinMapper.bulletinCount();}

    public List<Bulletin> bulletinList(){return bulletinMapper.getList();}
}
