package hbi.core.salesOrder.mapper;

import com.hand.hap.mybatis.common.Mapper;
import hbi.core.salesOrder.dto.Items;

import java.util.List;

/**
 * Created by ASpiralMoon on 2017/1/13.
 */
public interface ItemsMapper extends Mapper<Items> {

    List<Items> queryAll();
}
