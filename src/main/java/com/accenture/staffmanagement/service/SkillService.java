package com.accenture.staffmanagement.service;

import com.accenture.staffmanagement.dto.Pager;
import com.accenture.staffmanagement.entity.Skill;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * @author chengeng
 */
public interface SkillService {
    /**
     * @return List<Skill>
     */
    Pager<Skill> getSkill(int page, int size);
}
