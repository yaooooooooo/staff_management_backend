package com.accenture.staffmanagement.service;

import com.accenture.staffmanagement.dao.SkillDao;
import com.accenture.staffmanagement.dto.Pager;
import com.accenture.staffmanagement.entity.Skill;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author chengeng
 */
@Service
public class SkillServiceImpl implements SkillService {

    private SkillDao skillDao;

    public SkillServiceImpl(SkillDao skillDao) {
        this.skillDao = skillDao;
    }

    @Override
    public Pager<Skill> getSkill(int page, int size) {
        Map<String, Object> params = new HashMap<>(2);
        params.put("page", (page - 1) * size);
        params.put("size", size);
        Pager<Skill> pager = new Pager<>();
        List<Skill> list = skillDao.getSkill(params);
        pager.setPage(page);
        pager.setSize(size);
        pager.setRows(list);
        pager.setTotal(skillDao.count());
        return pager;
    }
}
