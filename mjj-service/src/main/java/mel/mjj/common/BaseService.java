package mel.mjj.common;

import com.baomidou.mybatisplus.extension.service.IService;

/**
 * Service父类，所有service应该继承此类
 * @param <Entity> 需要查询的实体类名
 * @author liq
 */
public interface BaseService<Entity> extends IService<Entity> {

}
