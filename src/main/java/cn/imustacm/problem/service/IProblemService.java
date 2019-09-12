package cn.imustacm.problem.service;


import cn.imustacm.common.domain.Resp;
import cn.imustacm.problem.model.Problem;
import org.springframework.web.bind.annotation.*;

/**
 * 问题服务
 *
 * @author liandong
 * @since 2019-09-12
 */
@RequestMapping("/api/problem")
public interface IProblemService {

    /**
     * 测试
     *
     * @param problem
     * @return
     */
    @PostMapping(value = "add")
    Resp addProblem(@RequestBody Problem problem);

    /**
     * 根据problemId获取problem
     *
     * @param id
     * @return
     */
    @GetMapping(value = "get")
    Problem getProblemById(@RequestParam("id") Long id);
}
