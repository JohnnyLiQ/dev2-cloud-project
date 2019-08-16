/**
 * @filename:MjjAgentController 2019年8月14日
 * @project mdk  V1.0
 * Copyright(c) 2020 liq Co. Ltd. 
 * All right reserved. 
 */
package mel.mjj.agent.common;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import mel.mjj.utils.AppResult;
import mel.mjj.common.PageParam;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;

/**
 * 
 * <p>说明： 用户信息API接口层</P>
 * @version: V1.0
 * @author: liq
 *
 */
public class AbstractController<S extends IService<T>,T>{
	
	@Autowired
    protected S baseService;

	/**
	 * @explain 查询对象  <swagger GET请求>
	 * @param   id:对象参数
	 * @return  AppResult
	 * @author  liq
	 * @time    2019年4月9日
	 */
	@GetMapping("/getById/{id}")
	@ApiOperation(value = "获取对象", notes = "作者：liq")
	@ApiImplicitParam(paramType="path", name = "id", value = "对象id", required = true, dataType = "Long")
	public AppResult<T> getUserById(@PathVariable("id")Long id){
        AppResult<T> result = new AppResult<T>();
		T obj=baseService.getById(id);
		if (null!=obj ) {
			 result.success(obj);
		}else {
			 result.error("查询对象不存在！");
		}
		return result;
	}
	
	/**
	 * @explain 删除对象
	 * @param   id:对象参数
	 * @return  AppResult
	 * @author  liq
	 * @time    2019年4月9日
	 */
	@PostMapping("/deleteById")
	@ApiOperation(value = "删除", notes = "作者：liq")
	@ApiImplicitParam(paramType="query", name = "id", value = "对象id", required = true, dataType = "Long")
	public AppResult<T> deleteById(Long id){
		AppResult<T> result=new AppResult<T>();
		T obj=baseService.getById(id);
		if (null!=obj) {
		  boolean rsg = baseService.removeById(id);
		  if (rsg) {
			    result.success("删除成功");
		  }else {
			   result.error("删除失败！");
		  }
		}else {
			 result.error("删除的对象不存在！");
		}
		return result;
	}
	
	/**
	 * @explain 添加
	 * @param   entity:对象参数T
	 * @return  Boolean
	 * @author  liq
	 * @time    2019年4月9日
	 */
	@PostMapping("/insert")
	@ApiOperation(value = "添加", notes = "作者：liq")
	public AppResult<T> insert(T entity){
        AppResult<T> result=new AppResult<T>();
		if (null!=entity) {
			boolean rsg = baseService.save(entity);
			if (rsg) {
				  result.success("添加成功");
			  }else {
				  result.error("添加失败！");
			  }
		}else {
			result.error("请传入正确参数！");
		}
		return result;
	}
	
	/**
	 * @explain 修改
	 * @param   entity:对象参数T
	 * @return  Boolean
	 * @author  liq
	 * @time    2019年4月9日
	 */
	@PostMapping("/update")
	@ApiOperation(value = "修改", notes = "作者：liq")
	public AppResult<T> update(T entity){
        AppResult<T> result=new AppResult<T>();
		if (null!=entity) {
			boolean rsg = baseService.updateById(entity);
			if (rsg) {
				  result.success("修改成功");
			  }else {
				  result.error("修改失败！");
			  }
		}else {
			result.error("请传入正确参数！");
		}
		return result;
	}
	
	/**
	 * @explain 分页条件查询用户   
	 * @param   param:对象参数AppPage<User>
	 * @return  PageInfo<User>
	 * @author  liq
	 * @time    2019年5月20日
	 */
	@GetMapping("/getPages")
	@ApiOperation(value = "分页查询", notes = "分页查询返回[IPage<T>],作者：边鹏")
	public AppResult<IPage<T>> getUserPages(PageParam<T> param){
        AppResult<IPage<T>> returnPage=new AppResult<IPage<T>>();
		Page<T> page=new Page<T>(param.getPageNum(),param.getPageSize());
		QueryWrapper<T> queryWrapper =new QueryWrapper<T>();
		queryWrapper.setEntity(param.getParam());
		//分页数据
		IPage<T> pageData=baseService.page(page, queryWrapper);
		returnPage.success(pageData);
		
		return returnPage;
	}
}
