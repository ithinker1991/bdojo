package com.ashu.atomix;

import io.atomix.catalyst.transport.Address;
import io.atomix.catalyst.transport.netty.NettyTransport;
import io.atomix.copycat.server.storage.Storage;

import java.util.List;

/**
 * Created by ashu on 18-4-3.
 */
public class Demo {

    public static void main(String[] args) {
//        AtomixReplica replica2 = AtomixReplica.builder(new Address("123.456.788.1", 8700)).build();
//        replica2.join(new Address("123.456.789.0", 8700)).join();
//// 定义集群所有节点
//        List<Address> clusters = List.newArrayList(/*....*/);
//// 定义本机地址
//        Address address = new Address("localhost", 5001);
//// replica即一个副本，也可以理解为一个节点
//        AtomixReplica atomix = AtomixReplica.builder(address)
//                // transport类型
//                .withTransport(new NettyTransport())
//                // 日志存储地址
//                .withStorage(new Storage("/logs/xxx"))
//                // 还有其他配置请参考后文
//                .build();
////启动并加入集群，如果集群本身没有启动则新创建集群
//        atomix.bootstrap(clusters).join();
    }
}
