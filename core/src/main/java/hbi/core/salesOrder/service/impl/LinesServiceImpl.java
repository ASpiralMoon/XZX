package hbi.core.salesOrder.service.impl;

import hbi.core.salesOrder.dto.Lines;
import hbi.core.salesOrder.mapper.LinesMapper;
import hbi.core.salesOrder.service.ILinesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by ASpiralMoon on 2017/1/13.
 */
@Service
public class LinesServiceImpl implements ILinesService {

    @Autowired
    private LinesMapper linesMapper;

    @Override
    public List<Lines> queryByHeaderId(Long headerId) {
        return linesMapper.queryByHeaderId(headerId);
    }

    @Override
    public int addLine(Lines lines) {
        int i = linesMapper.checkLineNumber(lines.getLineNumber());
        if (i > 0) {
            return 0;
        }
        return linesMapper.addLine(lines);
    }

    @Override
    public int editLine(Lines lines) {
        return linesMapper.editLine(lines);
    }

    @Override
    public int delByHeaderId(Long headerId) {
        return linesMapper.delByHeaderId(headerId);
    }

    @Override
    public int delByLineId(Long lineId) {
        return linesMapper.delByLineId(lineId);
    }
}
