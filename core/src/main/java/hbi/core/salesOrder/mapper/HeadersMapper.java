package hbi.core.salesOrder.mapper;

import com.hand.hap.mybatis.common.Mapper;
import hbi.core.salesOrder.dto.Headers;

import java.util.List;

/**
 * Created by ASpiralMoon on 2017/1/13.
 */
public interface HeadersMapper extends Mapper<Headers> {

    List<Headers> queryByParam(Headers headers);

    List<Headers> queryAll();

    List<Headers> queryById(Long headerId);

    int addHeader(Headers headers);

    int editHeader(Headers headers);

    int delHeader(Long headerId);

}
