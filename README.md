# MyShopPlus

面向大牛编程，模仿 Lusifer 实现 MyShopPlus 工程。

一套玩法打下来，两个字，壮观！

## 技术选型

|      |      |
| :----: | :--: |
| 部署方式 | K8S | 
| 数据库 | TiDB |
| 注册中心 | Nacos |
| 认证中心 | oAuth2-Security |
| 对内通信 | Dubbo |
| 对外通信 | Cloud Alibaba |



## 踩坑记录：
### TiDb
功力不够，实在玩不转 TiDB 了，尤其是遇到不同节点和库之间的数据转移和目标、来源等问题，很容易弄混。
放弃了，直接单机 MySQL 走起吧。

### 基于 K8S 的 Nacos：
Nacos 本身采用 Reft 实现高可用，
早少要启动三台容器（奇数）来选举主节点，
所以本地的两台不满足选举条件。
需要通过 scale 实现动态扩缩容



















