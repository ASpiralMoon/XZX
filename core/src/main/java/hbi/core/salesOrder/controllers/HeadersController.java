package hbi.core.salesOrder.controllers;

import com.hand.hap.system.controllers.BaseController;
import com.hand.hap.system.dto.ResponseData;
import hbi.core.salesOrder.dto.Headers;
import hbi.core.salesOrder.service.IHeadersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by ASpiralMoon on 2017/1/13.
 */
@Controller
@RequestMapping("/headers")
public class HeadersController extends BaseController {

    @Autowired
    private IHeadersService headersService;

    private ResponseData responseData;

    /**
     * 查询(可带参数)头信息
     *
     * @param headers  headers dto
     * @param pageNum  页数
     * @param pageSize 每页数据量
     * @return ResponseData Headers
     */
    @ResponseBody
    @RequestMapping(value = "/queryByParam", method = RequestMethod.POST)
    public ResponseData queryByParam(
            @RequestBody Headers headers,
            @RequestParam(defaultValue = DEFAULT_PAGE) Integer pageNum,
            @RequestParam(defaultValue = DEFAULT_PAGE_SIZE) Integer pageSize) {
        List<Headers> headersList = headersService.queryByParam(headers, pageNum, pageSize);
        return new ResponseData(headersList);
    }

    /**
     * 根据id查询头信息
     *
     * @param headerId headerId
     * @return ResponseData Headers
     */
    @ResponseBody
    @RequestMapping(value = "/queryById/{headerId}", method = RequestMethod.GET)
    public ResponseData queryById(@PathVariable Long headerId) {
        List<Headers> headersList = headersService.queryById(headerId);
        return new ResponseData(headersList);
    }

    /**
     * 新增头信息
     *
     * @param headers headers dto
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "/addHeader", method = RequestMethod.POST)
    public ResponseData addHeader(@RequestBody Headers headers) {
        int success = headersService.addHeader(headers);
        responseData = new ResponseData();
        if (success > 0) {
            responseData.setSuccess(true);
        } else {
            responseData.setSuccess(false);
        }
        return responseData;
    }

    /**
     * 编辑头信息
     *
     * @param headers headers dto
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "/editHeader", method = RequestMethod.POST)
    public ResponseData editHeader(@RequestBody Headers headers) {
        int success = headersService.editHeader(headers);
        responseData = new ResponseData();
        if (success > 0) {
            responseData.setSuccess(true);
        } else {
            responseData.setSuccess(false);
        }
        return responseData;
    }

    /**
     * 删除头信息
     *
     * @param headerId headers headers dto
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "/delHeader/{headerId}", method = RequestMethod.DELETE)
    public ResponseData delHeader(Long headerId) {
        int success = headersService.delHeader(headerId);
        responseData = new ResponseData();
        if (success > 0) {
            responseData.setSuccess(true);
        } else {
            responseData.setSuccess(false);
        }
        return responseData;
    }
}
