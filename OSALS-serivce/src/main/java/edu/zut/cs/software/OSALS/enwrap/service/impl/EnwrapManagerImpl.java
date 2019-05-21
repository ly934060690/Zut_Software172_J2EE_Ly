package edu.zut.cs.software.OSALS.enwrap.service.impl;

import edu.zut.cs.software.OSALS.enwrap.dao.EnwrapDao;
import edu.zut.cs.software.OSALS.enwrap.domain.Enwrap;
import edu.zut.cs.software.OSALS.enwrap.service.EnwrapManager;
import edu.zut.cs.software.base.service.impl.GenericManagerImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

/**
 * @Author: hyh
 * @Description:
 * @Date:Created in 21:12 2019/5/16
 * @Modified By:
 */
@Service
@Transactional
public class EnwrapManagerImpl extends GenericManagerImpl<Enwrap, Long> implements EnwrapManager {

    EnwrapDao enwrapDao;

    @Autowired
    public void setEnwrapDao(EnwrapDao enwrapDao){
        this.enwrapDao=enwrapDao;
        this.dao=enwrapDao;
    }

    @Override
    public Enwrap findbyEnwrapName(String enwrapName){
        // TODO Auto-generated method stub
        return null;
    }
}
