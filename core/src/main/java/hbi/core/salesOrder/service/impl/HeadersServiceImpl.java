package hbi.core.salesOrder.service.impl;

import com.github.pagehelper.PageHelper;
import hbi.core.salesOrder.dto.Headers;
import hbi.core.salesOrder.mapper.HeadersMapper;
import hbi.core.salesOrder.service.IHeadersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by ASpiralMoon on 2017/1/13.
 */
@Service
public class HeadersServiceImpl implements IHeadersService {

    @Autowired
    private HeadersMapper headersMapper;

    @Override
    public List<Headers> queryByParam(Headers headers, Integer pageNum, Integer pageSize) {
        PageHelper.startPage(pageNum, pageSize);
        return headersMapper.queryByParam(headers);
    }

//    @Override
//    public List<Headers> queryAll() {
//        return headersMapper.queryAll();
//    }

    @Override
    public List<Headers> queryById(Long headerId) {
        return headersMapper.queryById(headerId);
    }

    @Override
    public int addHeader(Headers headers) {
        return headersMapper.addHeader(headers);
    }

    @Override
    public int editHeader(Headers headers) {
        return headersMapper.editHeader(headers);
    }

    @Override
    public int delHeader(Long headerId) {
        return headersMapper.delHeader(headerId);
    }
}
