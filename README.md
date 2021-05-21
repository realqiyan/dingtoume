# 推荐使用dingtou v2
> https://github.com/realqiyan/dingtou

# 基金定投策略
> 价值平均定投策略，自动计算场外基金买入卖出金额。

## 1. 工程初始化
> 初始化mysql数据源： src/main/data/init.sql (会初始化数据库和表)
>
> 增量更新脚本：src/main/data/update.sql (修正表结构以及demo数据)
>
> 数据模型参考：src/main/data/mysql.mwb （使用MySQLWorkbench打开）
>
## 2. 配置数据源
> 修改application.properties中的数据源配置
```
spring.datasource.url = jdbc:mysql://127.0.0.1:3306/hbyuan?useUnicode=true&characterEncoding=UTF-8&zeroDateTimeBehavior=CONVERT_TO_NULL&serverTimezone=Asia/Shanghai&useSSL=false
spring.datasource.username = hbyuan
spring.datasource.password = dingtou.me
spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver
spring.datasource.max-idle=10
spring.datasource.max-wait=10000
spring.datasource.min-idle=5
spring.datasource.initial-size=5
```
