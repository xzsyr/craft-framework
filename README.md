##.   介绍

craft-parent是一个大型分布式、微服务、面向企业的JavaEE体系快速研发平台，基于模块化、服务化、原子化、热插拔的设计思想，使用成熟领先的无商业限制的主流开源技术构建。采用服务化的组件开发模式，可实现复杂的业务功能。提供驱动式开发模式，整合内置的代码生成器，将JavaEE开发效率提高5倍以上，减少50%的代码开发量，解决80%的重复工作，让开发者更关注业务逻辑。使用Maven进行项目的构建管理，采用Jenkins进行持续集成，主要定位于大型分布式企业系统或大型分布式互联网产品的架构。
##.   使用技术

- SOA服务框架：SpringCloud 、SpringBoot、RestFul等

- 分布式缓存：Redis

- 模块化管理：Maven

- 数据库连接池：Alibaba Druid

- 核心框架：Spring framework、SpringBoot

- 持久层框架：MyBatis

- 安全框架：Apache Shiro

- <del>服务端验证：Hibernate Validator</del>

- <del>任务调度：quartz</del>

- 日志管理：SLF4J 1.7、Log4j

- <del>客户端验证：JQuery Validation</del>

- <del>动态页签：easyuitab</del>

- <del>前端框架：Bootstrap、Vue</del>

##.   设计思想

分布式、微服务、云架构

JAVA语言开发、跨平台、高性能、高可用、安全、服务化、模块化、组件化、驱动式开发模式

##.   技术架构
###1.  业务层面
- **craft-module-employ 雇主模块**
&nbsp;<p>注册/登录   我的发布、账号设置、我的契约、我的订单</p>
- **craft-module-worker 工作者模块**
&nbsp;<p>注册/登录   我的求职、账号设置、我的契约、我的订单</p>
- **craft-module-agent  代理人模块**
&nbsp;<p> 工具类、通用方法等</p>
- **craft-module-voice  工匠之声（论坛）**
&nbsp;<p>注册/登录   发帖、评论</p>
- **craft-module-chat   微聊（朋友圈）**
&nbsp;<p>注册/登录 添加好友、添加关注、   聊天、通讯录、朋友圈</p>
- **craft-module-contract 契约**
&nbsp;<p>新增契约、编辑、查询、删除、公示</p>
###2.  框架core模块
- **craft-module-common 公共模块**
&nbsp;<p> 工具类、通用方法等</p>
- **craft-module-core 认证授权模块**
&nbsp;<p> 用户管理、角色管理、组管理、区域管理</p>
 

###3.  业务内核模块	 
- **craft-module-yipay 易支付**
- **craft-module-order 订单模块**
- **craft-module-ad 广告模块**

###4.  网关模块
- **craft-admin-gateway 后端网关**
- **craft-web-gateway   前端网关  **

###5.  架构层面服务模块
- **craft-enreka-server 注册中心服务（HA）**
- **craft-config-server 配置中心服务**
- **craft-zuul-server  网管路由服务**
- **craft-zipkin-server 链路追踪服务**

- craft-mq-server 消息服务
- craft-search-server 搜索服务*
- craft-dfs-server  文件服务
- craft-job-server  分布式任务服务

##.   平台基础功能

 - 用户管理：用户是系统操作者，该功能主要完成系统用户配置。

 - 角色管理：角色菜单权限分配、设置角色按机构进行数据范围权限划分。

 - 权限管理：对系统中经常使用的一些较为固定的数据进行维护等。

 - 菜单管理：配置系统菜单，操作权限，按钮权限标识等。

 - 部门管理：配置系统组织机构，树结构展现，可随意调整上下级。

 - 日志管理：系统正常操作日志记录和查询；系统异常信息日志记录和查询。

 - 连接池监视：监视当期系统数据库连接池状态，可进行分析SQL找出系统性能瓶颈。

 - 完整项目的源码来源 技术支持ixzsyr@163.com/ikongge@163.com

##.    源码结构
     
##.    部署说明

###1、下载源码
https://github.com/xzsyr/learn/tree/master/craft-parent
###2、  修改域名host文件 
 <p> C:\Windows\System32\drivers\etc<br>
    新增配置项
  127.0.0.1或IP     peer1 peer2 </p>
  
###3、 运行启动
EurekaServerApplication Run as 'Java Application'#启动注册中心服务器<br>
EurekaServerHaApplication Run as 'Java Application'#启动注册中心服务器standy

##.    其他
<p>全部服务使用swagger2构建强大的RESTful API文档</br>
参考文档：http://blog.didispace.com/springbootswagger2</p>
代码提交说明
- 文件提交采取以下模板格式
【模块名称】修改说明 例：【工匠模块】调整代码查询bug....
- 对全性文件提交采取以下模板格式
【寻找手艺人】调整README.md说明文件内容


##Q&A
