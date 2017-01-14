package hbi.core.salesOrder.controllers;

import com.hand.hap.system.controllers.BaseController;
import com.hand.hap.system.dto.ResponseData;
import hbi.core.salesOrder.dto.Lines;
import hbi.core.salesOrder.service.ILinesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by ASpiralMoon on 2017/1/13.
 */
@Controller
@RequestMapping("/lines")
public class LinesController extends BaseController {

    @Autowired
    private ILinesService linesService;

    private ResponseData responseData;

    /**
     * 根据headerId 查询订单
     * @param headerId headerId
     * @return ResponseData(linesList)
     */
    @ResponseBody
    @RequestMapping(value = "/query/{headerId}", method = RequestMethod.POST)
    public ResponseData queryByHeaderId(@PathVariable Long headerId) {
        List<Lines> linesList = linesService.queryByHeaderId(headerId);
        return new ResponseData(linesList);
    }

    /**
     * 新增lines
     *
     * @param lines 订单行dto
     * @return ResponseData
     */
    @ResponseBody
    @RequestMapping(value = "/addLine", method = RequestMethod.POST)
    public ResponseData addLine(@RequestBody Lines lines) {
        int success = linesService.addLine(lines);
        responseData = new ResponseData();
        if (success > 0) {
            responseData.setMessage("成功新增一条订单行");
            responseData.setSuccess(true);
        } else {
            responseData.setMessage("存在相同的订单号");
            responseData.setSuccess(false);
        }
        return responseData;
    }

    /**
     * 编辑lines
     *
     * @param lines 订单行dto
     * @return ResponseData
     */
    @ResponseBody
    @RequestMapping(value = "/editLine", method = RequestMethod.POST)
    public ResponseData editLine(@RequestBody Lines lines) {
        int success = linesService.editLine(lines);
        responseData = new ResponseData();
        if (success > 0) {
            responseData.setMessage("编辑成功!");
            responseData.setSuccess(true);
        } else {
            responseData.setMessage("编辑成功!");
            responseData.setSuccess(false);
        }
        return responseData;
    }

    /**
     * 根据headerId删除lines
     *
     * @param headerId headerId
     * @return ResponseData
     */
    @ResponseBody
    @RequestMapping(value = "/delByHeaderId/{headerId}", method = RequestMethod.DELETE)
    public ResponseData delByHeaderId(@PathVariable Long headerId) {
        int success = linesService.delByHeaderId(headerId);
        responseData = new ResponseData();
        if (success > 0) {
            responseData.setSuccess(true);
        } else {
            responseData.setSuccess(false);
        }
        return responseData;
    }

    /**
     * 根据lineId删除lines
     *
     * @param lineId lineId
     * @return ResponseData
     */
    @ResponseBody
    @RequestMapping(value = "/delByLineId/{lineId}", method = RequestMethod.DELETE)
    public ResponseData delByLineId(@PathVariable Long lineId) {
        int success = linesService.delByLineId(lineId);
        responseData = new ResponseData();
        if (success > 0) {
            responseData.setSuccess(true);
        } else {
            responseData.setSuccess(false);
        }
        return responseData;
    }

}
