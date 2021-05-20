package com.accenture.staffmanagement.controller;

import com.accenture.staffmanagement.dto.Pager;
import com.accenture.staffmanagement.entity.Skill;
import com.accenture.staffmanagement.service.SkillService;
import com.accenture.staffmanagement.utils.PassToken;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author chengeng
 */
@RestController
@RequestMapping("/skill")
public class SkillController {

    private SkillService skillService;

    public SkillController(SkillService skillService) {
        this.skillService = skillService;
    }

    @PassToken
    @ApiOperation("Get all skills.")
    @GetMapping("/list/{page}/{size}")
    public Pager<Skill> getSkills(@PathVariable("page") int page,
                                  @PathVariable("size") int size) {
        return skillService.getSkill(page, size);
    }

}
