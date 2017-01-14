package hbi.core.salesOrder.controllers;

import com.hand.hap.system.dto.ResponseData;
import hbi.core.salesOrder.dto.Companys;
import hbi.core.salesOrder.service.ICompanysService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * Created by ASpiralMoon on 2017/1/13.
 */
@Controller
@RequestMapping("/companys")
public class CompanysController {

    @Autowired
    private ICompanysService companysService;

    @ResponseBody
    @RequestMapping(value = "/query", method = RequestMethod.POST)
    public ResponseData queryAll(@RequestBody Companys companys) {
        List<Companys> companysList = companysService.queryAll(companys);
        return new ResponseData(companysList);
    }

}
