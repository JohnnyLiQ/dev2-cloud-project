/**
 * @filename:UserController 2019年4月9日
 * @project wallet-manage  V1.0
 * Copyright(c) 2018 flying-cattle Co. Ltd. 
 * All right reserved. 
 */
package com.mel.dev2;

import com.mel.dev2.entity.BasisInfo;
import com.mel.dev2.util.EntityInfoUtil;
import com.mel.dev2.util.Generator;
import com.mel.dev2.util.MySqlToJavaUtil;

import java.sql.SQLException;


/**
 * Copyright: Copyright (c) 2019 
 * 
 * <p>说明： 自动生成工具</P>
 * <p>源码地址：https://gitee.com/flying-cattle/mybatis-dsc-generator</P>
 */
public class CodeGenerator {
		// 基础信息：项目名、作者、版本
		public static final String PROJECT = "mdk";
		public static final String AUTHOR = "liq";
		public static final String VERSION = "V1.0";
		// 数据库连接信息：连接URL、用户名、秘密、数据库名
		public static final String URL = "jdbc:mysql://10.1.2.180:3308/agent_dev?useUnicode=true&characterEncoding=utf-8&autoReconnect=true&failOverReadOnly=false&useSSL=true&serverTimezone=UTC";
		public static final String NAME = "internet_dev_2";
		public static final String PASS = "mysql!@#123";
		public static final String DATABASE = "agent_dev";
		/**
		 * 类信息：类名、对象名（一般是【类名】的首字母小些）、类说明、时间
		 */
		public static final String CLASSNAME = "agent";
		public static final String TABLE = "mjj_agent";
		public static final String CLASSCOMMENT = "用户信息";
		public static final String TIME = "2019年8月14日";
		public static final String AGILE = System.currentTimeMillis() + "";
		// 路径信息，分开路径方便聚合工程项目，微服务项目
		public static final String ENTITY_URL = "mel.mjj.agent.entity";
		public static final String DAO_URL = "mel.mjj.agent.mapper";
		public static final String XML_URL = "mel.mjj.agent.impl";
		public static final String SERVICE_URL = "mel.mjj.agent.service";
		public static final String SERVICE_IMPL_URL = "mel.mjj.agent.service.impl";
		public static final String CONTROLLER_URL = "mel.mjj.agent.controller";
		//是否是Swagger配置
		public static final String IS_SWAGGER = "true";
		// 生成文件存放位置
		public static final String File_URL = "d:\\demo\\dev3-project\\mjj-service\\src\\main\\java\\";
		public static final String MAPPER_URL= "d:\\demo\\dev3-project\\mjj-service\\src\\main\\resources\\mapper\\agent\\";
		
	public static void main(String[] args) {
		BasisInfo bi = new BasisInfo(PROJECT, AUTHOR, VERSION, URL, NAME, PASS, DATABASE, TIME, AGILE, ENTITY_URL,
				DAO_URL, XML_URL, SERVICE_URL, SERVICE_IMPL_URL, CONTROLLER_URL,IS_SWAGGER);
		bi.setTable(TABLE);
		bi.setEntityName(MySqlToJavaUtil.getClassName(TABLE));
		bi.setObjectName(MySqlToJavaUtil.changeToJavaFiled(TABLE));
		bi.setEntityComment(CLASSCOMMENT);
		try {
			bi = EntityInfoUtil.getInfo(bi);
			String fileUrl = File_URL ;

			//开始生成文件
			String aa1 = Generator.createEntity(fileUrl, bi).toString();
			String aa2 = Generator.createDao(fileUrl, bi).toString(); 
			String aa3 = Generator.createDaoImpl(MAPPER_URL, bi).toString();
			String aa4 = Generator.createService(fileUrl, bi).toString(); 
			String aa5 = Generator.createServiceImpl(fileUrl, bi).toString(); 
			String aa6 = Generator.createController(fileUrl, bi).toString();
			// 是否创建swagger配置文件
			String aa7 = Generator.createSwaggerConfig(fileUrl, bi).toString();
			
			System.out.println(aa1);
			System.out.println(aa2); System.out.println(aa3); System.out.println(aa4);
			System.out.println(aa5); System.out.println(aa6); System.out.println(aa7);
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
