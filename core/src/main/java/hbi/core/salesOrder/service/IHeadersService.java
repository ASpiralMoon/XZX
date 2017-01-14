package hbi.core.salesOrder.service;

import hbi.core.salesOrder.dto.Headers;

import java.util.List;

/**
 * Created by ASpiralMoon on 2017/1/13.
 */
public interface IHeadersService {

    List<Headers> queryByParam(Headers headers, Integer pageNum, Integer pageSize);

//    List<Headers> queryAll();

    List<Headers> queryById(Long headerId);

    int addHeader(Headers headers);

    int editHeader(Headers headers);

    int delHeader(Long headerId);
}
