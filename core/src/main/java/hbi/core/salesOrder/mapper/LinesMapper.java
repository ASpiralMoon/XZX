package hbi.core.salesOrder.mapper;

import com.hand.hap.mybatis.common.Mapper;
import hbi.core.salesOrder.dto.Lines;

import java.util.List;

/**
 * Created by ASpiralMoon on 2017/1/13.
 */
public interface LinesMapper extends Mapper<Lines> {

    List<Lines> queryByHeaderId(Long headerId);

    int checkLineNumber(Long lineNumber);

    int addLine(Lines lines);

    int editLine(Lines lines);

    int delByHeaderId(Long headerId);

    int delByLineId(Long lineId);

}
