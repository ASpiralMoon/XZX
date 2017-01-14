package hbi.core.salesOrder.service;

import hbi.core.salesOrder.dto.Lines;

import java.util.List;

/**
 * Created by ASpiralMoon on 2017/1/13.
 */
public interface ILinesService {

    List<Lines> queryByHeaderId(Long headerId);

    int addLine(Lines lines);

    int editLine(Lines lines);

    int delByHeaderId(Long headerId);

    int delByLineId(Long lineId);
}
