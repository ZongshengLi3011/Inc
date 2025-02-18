package com.inc.admin.controller.sys;

import com.inc.admin.domain.sys.RoleDO;
import com.inc.admin.service.sys.RoleService;
import com.inc.admin.utils.PageUtils;
import com.inc.admin.utils.Query;
import com.inc.admin.utils.R;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RequestMapping("/role")
@RestController
public class RoleController {
    @Autowired
    RoleService roleService;

    @GetMapping()
    PageUtils list(@RequestParam Map<String, Object> params) {
        Query query = new Query(params);
        List<RoleDO> roleDOS = roleService.list(query);
        int total = roleService.count(query);
        PageUtils pageUtil = new PageUtils(roleDOS, total);
        return pageUtil;
    }

    @GetMapping("/userId/{userId}")
    List<Long> roleIdByUserId(@PathVariable Long userId){
        return roleService.RoleIdsByUserId(userId);
    }

    @DeleteMapping()
    R remove( Long id) {
        return R.operate (roleService.remove(id) > 0);
    }

    @PostMapping
    R save(@RequestBody RoleDO roleDO){
        if(roleService.save(roleDO)>0){
            return R.ok();
        }
        return R.error();
    }

    @PutMapping
    R update(@RequestBody RoleDO roleDO){
        if(roleService.update(roleDO)>0){
            return R.ok();
        }
        return R.error();
    }

}
