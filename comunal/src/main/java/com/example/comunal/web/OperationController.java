package com.example.comunal.web;

import com.example.comunal.model.*;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.HandlerMapping;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/")
public class OperationController {

    private List<DataLog> dataLogs = new ArrayList<>();

    @PostMapping("sum/**")
    public Result executeSum(HttpServletRequest request){
        String dynamicParameters = (String) request.getAttribute(
                HandlerMapping.PATH_WITHIN_HANDLER_MAPPING_ATTRIBUTE);

        Sum sum = new Sum();
        int operationResult =sum.executeOperation(dynamicParameters);

        DataLog dataLog = new DataLog("sum",operationResult,sum.getTermList().getTerms());
        dataLogs.add(dataLog);

        return new Result(operationResult);

    }

    @PostMapping("sub/**")
    public Result executeSub(HttpServletRequest request){
        String dynamicParameters = (String) request.getAttribute(
                HandlerMapping.PATH_WITHIN_HANDLER_MAPPING_ATTRIBUTE);

        Sub sub = new Sub();
        int operationResult =sub.executeOperation(dynamicParameters);

        DataLog dataLog = new DataLog("sub",operationResult,sub.getTermList().getTerms());
        dataLogs.add(dataLog);

        return new Result(operationResult);
    }

    @PostMapping("mul/**")
    public Result executeMul(HttpServletRequest request){
        String dynamicParameters = (String) request.getAttribute(
                HandlerMapping.PATH_WITHIN_HANDLER_MAPPING_ATTRIBUTE);

        Mul mul = new Mul();
        int operationResult =mul.executeOperation(dynamicParameters);

        DataLog dataLog = new DataLog("mul",operationResult,mul.getTermList().getTerms());
        dataLogs.add(dataLog);

        return new Result(operationResult);
    }

    @GetMapping("history")
    public List<DataLog> showHistory(){
        return this.dataLogs;
    }
}
