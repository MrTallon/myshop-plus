# MyShopPlus

面向案例变成，模仿 Lusifer 实现 MyShopPlus 工程。

## 技术选型


|      |      |
| :----: | :--: |
| 部署方式 | K8S | 
| 数据库 | TiDB |
| 注册中心 | Nacos |



## 踩坑记录：
### 基于 K8S 的 Nacos：
Nacos 本身采用 Reft 实现高可用，所以本地的两台不满足选举条件。
需要通过 scale 实现动态扩缩容


















