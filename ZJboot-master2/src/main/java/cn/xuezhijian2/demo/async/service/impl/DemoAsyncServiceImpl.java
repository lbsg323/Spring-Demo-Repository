package cn.xuezhijian2.demo.async.service.impl;

import java.util.Random;
import java.util.concurrent.Future;

import cn.xuezhijian2.demo.async.service.DemoAsyncService;
import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.AsyncResult;
import org.springframework.stereotype.Service;

/**
 * Created with IntelliJ IDEA.
 * packageName  : cn.xuezhijian2.demo.async.service.impl
 * User         : zj
 * Date         : 17/4/22
 * Time         : 下午1:36
 * Description  :
 */

@Service
public class DemoAsyncServiceImpl implements DemoAsyncService{

    public static Random random =new Random();

    @Async
    public Future<String> doTaskOne() throws Exception {
        System.out.println("开始做任务一");
        long start = System.currentTimeMillis();
        Thread.sleep(random.nextInt(10000));
        long end = System.currentTimeMillis();
        System.out.println("完成任务一，耗时：" + (end - start) + "毫秒");
        return new AsyncResult<>("任务一完成");
    }

    @Async
    public Future<String> doTaskTwo() throws Exception {
        System.out.println("开始做任务二");
        long start = System.currentTimeMillis();
        Thread.sleep(random.nextInt(10000));
        long end = System.currentTimeMillis();
        System.out.println("完成任务二，耗时：" + (end - start) + "毫秒");
        return new AsyncResult<>("任务二完成");
    }

    @Async
    public Future<String> doTaskThree() throws Exception {
        System.out.println("开始做任务三");
        long start = System.currentTimeMillis();
        Thread.sleep(random.nextInt(10000));
        long end = System.currentTimeMillis();
        System.out.println("完成任务三，耗时：" + (end - start) + "毫秒");
        return new AsyncResult<>("任务三完成");
    }

}