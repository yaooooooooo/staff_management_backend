package com.accenture.staffmanagement.dao;

import com.accenture.staffmanagement.entity.Skill;

import java.util.List;
import java.util.Map;

/**
 * @author chengeng
 */
public interface SkillDao {
    /**
     * @return List<Skill>
     */
    List<Skill> getSkill(Map<String, Object> params);

    long count();
}
