/**
 * @filename:MjjAgentController 2019年8月14日
 * @project mdk  V1.0
 * Copyright(c) 2020 liq Co. Ltd. 
 * All right reserved. 
 */
package mel.mjj.agent.controller;

import mel.mjj.agent.common.AbstractController;
import mel.mjj.agent.entity.MjjAgent;
import mel.mjj.agent.service.MjjAgentService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import io.swagger.annotations.Api;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
/**
 * 
 * <p>说明： 用户信息API接口层</P>
 * @version: V1.0
 * @author: liq
 *
 */
@Api(description = "用户信息",value="用户信息" )
@RestController
@RequestMapping("/mjjAgent")
public class MjjAgentController extends AbstractController<MjjAgentService,MjjAgent>{

	Logger logger = LoggerFactory.getLogger(this.getClass());
	
}