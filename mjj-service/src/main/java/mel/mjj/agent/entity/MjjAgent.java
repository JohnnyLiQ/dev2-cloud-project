/**
 * @filename:MjjAgent 2019年8月14日
 * @project mdk  V1.0
 * Copyright(c) 2020 liq Co. Ltd. 
 * All right reserved. 
 */
package mel.mjj.agent.entity;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;

/**
 * 
 * <p>说明： 用户信息实体类</P>
 * @version: V1.0
 * @author: liq
 * 
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class MjjAgent extends Model<MjjAgent> {

	private static final long serialVersionUID = 1565925976608L;
	
	@TableId(value = "id", type = IdType.AUTO)
	@ApiModelProperty(name = "id" , value = "主键")
	private String id;
	@ApiModelProperty(name = "status" , value = "状态")
	private String status;
	@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	@JsonFormat(pattern="yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
	@ApiModelProperty(name = "createdOn" , value = "创建时间")
	private Date createdOn;
	@ApiModelProperty(name = "createdBy" , value = "创建人")
	private String createdBy;
	@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	@JsonFormat(pattern="yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
	@ApiModelProperty(name = "modifiedOn" , value = "修改时间")
	private Date modifiedOn;
	@ApiModelProperty(name = "modifiedBy" , value = "修改人")
	private String modifiedBy;
	@ApiModelProperty(name = "nickName" , value = "昵称")
	private String nickName;
	@ApiModelProperty(name = "avatar" , value = "头像")
	private String avatar;
	@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	@JsonFormat(pattern="yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
	@ApiModelProperty(name = "examineTime" , value = "如果账号需要审核，此时间不同于创建时间，如果不需要审核，则与创建时间相同")
	private Date examineTime;
	@ApiModelProperty(name = "examineState" , value = "审核状态")
	private Integer examineState;
	@ApiModelProperty(name = "agentState" , value = "经纪人账号状态")
	private Integer agentState;
	@ApiModelProperty(name = "agentOccupationType" , value = "职业")
	private Integer agentOccupationType;
	@ApiModelProperty(name = "ssoAccount" , value = "对接SSO,对应SSOUnionId")
	private String ssoAccount;
	@ApiModelProperty(name = "invitater" , value = "邀请人ID")
	private String invitater;
	@ApiModelProperty(name = "examineAccount" , value = "审核人员")
	private String examineAccount;
	@ApiModelProperty(name = "marketingOrg" , value = "营销组织")
	private String marketingOrg;
	@ApiModelProperty(name = "manageAgentGroup" , value = "管理员战队")
	private String manageAgentGroup;
	@ApiModelProperty(name = "agentSetting" , value = "经纪人设置")
	private String agentSetting;
	@ApiModelProperty(name = "agentGroup" , value = "战队")
	private String agentGroup;
	@Override
    protected Serializable pkVal() {
        return this.id;
    }
}
