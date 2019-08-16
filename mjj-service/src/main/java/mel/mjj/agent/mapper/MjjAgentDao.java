/**
 * @filename:MjjAgentDao 2019年8月14日
 * @project mdk  V1.0
 * Copyright(c) 2020 liq Co. Ltd. 
 * All right reserved. 
 */
package mel.mjj.agent.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import mel.mjj.agent.entity.MjjAgent;

/**
 * 
 * <p>说明： 用户信息数据访问层</p>
 * @version: V1.0
 * @author: liq
 * 
 */
@Mapper
public interface MjjAgentDao extends BaseMapper<MjjAgent> {
	
}
